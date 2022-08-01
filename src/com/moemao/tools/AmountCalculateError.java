package com.moemao.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AmountCalculateError {

    public static void main(String[] args) throws Exception
    {
        String path = "/Users/yanwuv4yue/";
        String allOrderCodeListPath = "allOrderCodeList.txt";
        String transferOrderListPath = "inMerchantAmount.txt";


        BufferedReader allOrderCodeListReader = null;
        BufferedReader transferOrderListReader = null;

        try {
            allOrderCodeListReader = Files.newBufferedReader(Paths.get(path + allOrderCodeListPath));
            transferOrderListReader = Files.newBufferedReader(Paths.get(path + transferOrderListPath));

            List<String> allOrderCodeList = toList(allOrderCodeListReader);
            List<String> transferOrderList = toList(transferOrderListReader);

            Set<String> allOrderSet = new HashSet<>();
            allOrderSet.addAll(allOrderCodeList);
            System.out.println("allOrderCodeList:" + allOrderCodeList.size());
            System.out.println("allOrderSet:" + allOrderSet.size());

//            Map<String, TransferData> map = new HashMap<>();
//            for (String transStr : transferOrderList) {
//                TransferData transferData = new TransferData();
//                transferData.setOrderCode(transStr.split("--")[0]);
//                transferData.setTransferAmount(transStr.split("--")[1]);
//                transferData.setCalculationAmount(transStr.split("--")[2]);
//                transferData.setTransferDate(transStr.split("--").length > 3 ? transStr.split("--")[3] : "");
//                map.put(transferData.getOrderCode(), transferData);
//            }
//
//
//            for (String orderCode : allOrderCodeList) {
//                TransferData transferData = map.get(orderCode);
//                if (transferData == null) {
//                    System.out.println(orderCode + "\t\t\t\t");
//                    continue;
//                }
//                System.out.println(orderCode + "\t" + transferStatusDesc(transferData.getTransferStatus()) + "\t" + transferData.getCalculationAmount() + "\t" + transferData.getTransferAmount() + "\t" + transferData.getMerchantNo());
//            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            allOrderCodeListReader.close();
            transferOrderListReader.close();
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

    private static String transferStatusDesc(String transferStatus) {
        if (transferStatus.equals("0")) {
            return "未打款";
        } else if (transferStatus.equals("1")) {
            return "已打款";
        } else if (transferStatus.equals("3")) {
            return "退款";
        } else {
            return "无需打款";
        }
    }
}


class TransferData {
    private String orderCode;
    private String transferAmount;
    private String calculationAmount;
    private String transferDate;
    private String transferStatus;
    private String merchantNo;

    public String getOrderCode()
    {
        return orderCode;
    }

    public void setOrderCode(String orderCode)
    {
        this.orderCode = orderCode;
    }

    public String getTransferAmount()
    {
        return transferAmount;
    }

    public void setTransferAmount(String transferAmount)
    {
        this.transferAmount = transferAmount;
    }

    public String getCalculationAmount()
    {
        return calculationAmount;
    }

    public void setCalculationAmount(String calculationAmount)
    {
        this.calculationAmount = calculationAmount;
    }

    public String getTransferDate()
    {
        return transferDate;
    }

    public void setTransferDate(String transferDate)
    {
        this.transferDate = transferDate;
    }

    public String getTransferStatus()
    {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus)
    {
        this.transferStatus = transferStatus;
    }

    public String getMerchantNo()
    {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo)
    {
        this.merchantNo = merchantNo;
    }
}
