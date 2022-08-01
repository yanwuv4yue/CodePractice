package com.moemao.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmountCalculateErrorMerchantSum {

    public static void main(String[] args) throws Exception
    {
        String path = "/Users/yanwuv4yue/";
        String transferOrderListWithMerchantNoPath = "merchantNoSum.txt";


        BufferedReader transferOrderListWithMerchantNoReader = null;

        try {
            transferOrderListWithMerchantNoReader = Files.newBufferedReader(Paths.get(path + transferOrderListWithMerchantNoPath));

            List<String> transferOrderListWithMerchantNo = toList(transferOrderListWithMerchantNoReader);

            Map<String, TransferMerchantData> map = new HashMap<>();

            for (String transStr : transferOrderListWithMerchantNo) {
                if (map.containsKey(transStr.split("--")[0])) {
                    // 如果已经存在账号
                    TransferMerchantData transferData = map.get(transStr.split("--")[0]);
                    transferData.setWrongCalculationAmount(transferData.getWrongCalculationAmount() + Integer.parseInt(transStr.split("--")[1]));
                    transferData.setWrongTransferAmount(transferData.getWrongTransferAmount() + Integer.parseInt(transStr.split("--")[2]));
                    transferData.setCalculationAmount(transferData.getCalculationAmount() + Integer.parseInt(transStr.split("--")[3]));
                    transferData.setTransferAmount(transferData.getTransferAmount() + Integer.parseInt(transStr.split("--")[4]));
                    map.put(transferData.getMerchantNo(), transferData);
                } else {
                    // 如果没有这个账号
                    TransferMerchantData transferData = new TransferMerchantData();
                    transferData.setMerchantNo(transStr.split("--")[0]);
                    transferData.setWrongCalculationAmount(Integer.parseInt(transStr.split("--")[1]));
                    transferData.setWrongTransferAmount(Integer.parseInt(transStr.split("--")[2]));
                    transferData.setCalculationAmount(Integer.parseInt(transStr.split("--")[3]));
                    transferData.setTransferAmount(Integer.parseInt(transStr.split("--")[4]));
                    map.put(transferData.getMerchantNo(), transferData);
                }
            }

            // 计算完毕后打印输出
            for (String key : map.keySet()) {
                TransferMerchantData transferData = map.get(key);
                System.out.println(
                        transferData.getMerchantNo()
                        + "\t" + toYuan(transferData.getWrongCalculationAmount())
                        + "\t" + toYuan(transferData.getWrongTransferAmount())
                        + "\t" + toYuan(transferData.getCalculationAmount())
                        + "\t" + toYuan(transferData.getTransferAmount())
                        + "\t" + toYuan((transferData.getWrongCalculationAmount() - transferData.getCalculationAmount()))
                        + "\t" + toYuan((transferData.getWrongTransferAmount() - transferData.getTransferAmount()))
                        + "\t" + (transferData.getWrongCalculationAmount() - transferData.getCalculationAmount())
                        + "\t" + (transferData.getWrongTransferAmount() - transferData.getTransferAmount()));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            transferOrderListWithMerchantNoReader.close();
        }
    }

    private static String toYuan(Integer amount) {
        return String.valueOf(Double.parseDouble(String.valueOf(amount)) / 100);
    }

    private static List<String> toList(BufferedReader br) throws IOException
    {
        List<String> list = new ArrayList<>();
        String line = "";
        while (null != (line = br.readLine()))
        {
            list.add(line);
        }

        return list;
    }
}


class TransferMerchantData {
    private String merchantNo;//打款账号
    private Integer wrongCalculationAmount;//错误分账金额
    private Integer wrongTransferAmount;//错误打款金额
    private Integer calculationAmount;//正确分账金额
    private Integer transferAmount;//正确打款金额

    public String getMerchantNo()
    {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo)
    {
        this.merchantNo = merchantNo;
    }

    public Integer getWrongCalculationAmount()
    {
        return wrongCalculationAmount;
    }

    public void setWrongCalculationAmount(Integer wrongCalculationAmount)
    {
        this.wrongCalculationAmount = wrongCalculationAmount;
    }

    public Integer getWrongTransferAmount()
    {
        return wrongTransferAmount;
    }

    public void setWrongTransferAmount(Integer wrongTransferAmount)
    {
        this.wrongTransferAmount = wrongTransferAmount;
    }

    public Integer getCalculationAmount()
    {
        return calculationAmount;
    }

    public void setCalculationAmount(Integer calculationAmount)
    {
        this.calculationAmount = calculationAmount;
    }

    public Integer getTransferAmount()
    {
        return transferAmount;
    }

    public void setTransferAmount(Integer transferAmount)
    {
        this.transferAmount = transferAmount;
    }
}
