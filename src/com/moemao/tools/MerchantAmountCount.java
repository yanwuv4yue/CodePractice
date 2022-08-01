package com.moemao.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MerchantAmountCount {

    public static void main(String[] args) throws Exception
    {
        String path = "/Users/yanwuv4yue/";
        String merchantAmountCountListPath = "merchantAmountCount.txt";


        BufferedReader merchantAmountCountListReader = null;

        try {
            merchantAmountCountListReader = Files.newBufferedReader(Paths.get(path + merchantAmountCountListPath));

            List<String> merchantAmountCountList = toList(merchantAmountCountListReader);

            // key-商户账号
            Map<String, MerchantAmountCountData> map = new HashMap<>();

            for (String transStr : merchantAmountCountList) {
                // 无打款记录直接跳过
                if (transStr.split("--").length < 4) {
                    continue;
                }
                if (!transStr.split("--")[5].equals("已打款")) {
                    continue;
                }

                if (map.containsKey(transStr.split("--")[6])) {
                    // 若当前map中已存在该商户账号
                    MerchantAmountCountData transferData = map.get(transStr.split("--")[6]);
                    transferData.setOrderAmount(transferData.getOrderAmount() + Integer.parseInt("".equals(transStr.split("--")[1]) ? "0" : transStr.split("--")[1]));
                    transferData.setCalculationAmount(transferData.getCalculationAmount() + Integer.parseInt("".equals(transStr.split("--")[3]) ? "0" : transStr.split("--")[3]));
                    transferData.setTransferAmount(transferData.getTransferAmount() + Integer.parseInt("".equals(transStr.split("--")[4]) ? "0" : transStr.split("--")[4]));
                } else {
                    // 若当前map中没有该商户账号，则新增一个对象
                    MerchantAmountCountData transferData = new MerchantAmountCountData();
                    transferData.setOrderAmount(Integer.parseInt("".equals(transStr.split("--")[1]) ? "0" : transStr.split("--")[1]));
                    transferData.setRouteName(transStr.split("--")[2]);
                    transferData.setCalculationAmount(Integer.parseInt("".equals(transStr.split("--")[3]) ? "0" : transStr.split("--")[3]));
                    transferData.setTransferAmount(Integer.parseInt("".equals(transStr.split("--")[4]) ? "0" : transStr.split("--")[4]));
                    transferData.setMerchantNo(transStr.split("--")[6]);
                    map.put(transStr.split("--")[6], transferData);
                }
            }

            // 最终输出打款账户结果
            for (MerchantAmountCountData data : map.values()) {
                System.out.println(data);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            merchantAmountCountListReader.close();
        }
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


class MerchantAmountCountData {
    private String merchantNo;
    private Integer transferAmount;
    private Integer calculationAmount;
    private Integer orderAmount;
    private String routeName;

    private String toYuan(Integer amount) {
        double result = amount / 100;
        return String.valueOf(result);
    }

    @Override
    public String toString()
    {
        return merchantNo + "\t" + routeName + "\t" + toYuan(transferAmount) + "\t" + toYuan(calculationAmount) + "\t" + toYuan(orderAmount) + "\t" + (transferAmount - orderAmount*0.945)/100;
    }

    public String getMerchantNo()
    {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo)
    {
        this.merchantNo = merchantNo;
    }

    public Integer getTransferAmount()
    {
        return transferAmount;
    }

    public void setTransferAmount(Integer transferAmount)
    {
        this.transferAmount = transferAmount;
    }

    public Integer getCalculationAmount()
    {
        return calculationAmount;
    }

    public void setCalculationAmount(Integer calculationAmount)
    {
        this.calculationAmount = calculationAmount;
    }

    public Integer getOrderAmount()
    {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount)
    {
        this.orderAmount = orderAmount;
    }

    public String getRouteName()
    {
        return routeName;
    }

    public void setRouteName(String routeName)
    {
        this.routeName = routeName;
    }
}
