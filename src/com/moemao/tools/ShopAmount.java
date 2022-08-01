package com.moemao.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopAmount {

    public static void main(String[] args) throws Exception
    {
        String path = "/Users/yanwuv4yue/";
        String txtPath = "shopAmount.txt";
        String txt2Path = "shopMerchant.txt";

        BufferedReader txtReader = null;
        BufferedReader txt2Reader = null;

        try {
            txtReader = Files.newBufferedReader(Paths.get(path + txtPath));
            txt2Reader = Files.newBufferedReader(Paths.get(path + txt2Path));

            List<String> txtList = toList(txtReader);
            List<String> txt2List = toList(txt2Reader);

            // 门店金额 门店号-金额
            Map<String, Integer> map = new HashMap<>();
            for (String str : txtList) {
                if (map.containsKey(str.split("--")[0].trim())) {
                    map.put(str.split("--")[0].trim(), map.get(str.split("--")[0]) + Integer.parseInt(str.split("--")[1]));
                } else {
                    map.put(str.split("--")[0].trim(), Integer.parseInt(str.split("--")[1]));
                }
            }
            System.out.println("一共涉及" + map.size() + "个门店正订单金额");

            // 门店商户号 门店号-商户号
            Map<String, String> map2 = new HashMap<>();
            for (String str : txt2List) {
                if (map2.containsKey(str.split("--")[0].trim())) {

                } else {
                    map2.put(str.split("--")[0].trim(), str.split("--")[1]);
                }
            }
            System.out.println("一共涉及" + map2.size() + "个门店收款账户");

//            for (String shopId : map.keySet()) {
//                if (!map2.keySet().contains(shopId)) {
//                    System.out.println("未匹配门店号：" + shopId);
//                }
//            }

            // 商户号-金额
            Map<String, Integer> map3 = new HashMap<>();
            String[] merchantList = {
                    "399211028027138",
                    "399211028031030",
                    "399211028088780",
                    "399211028093220",
                    "399211028098321",
                    "399211028103439",
                    "399211028116656",
                    "399211028118921",
                    "399211028122693",
                    "399211028131216",
                    "399211028151391",
                    "399211028159709",
                    "399211028164293",
                    "399211028180193",
                    "399211028190500",
                    "399211028194423",
                    "399211028219928",
                    "399211028219979",
                    "399211028248596",
                    "399211028253549",
                    "399211028268952",
                    "399211028284926",
                    "399211028293122",
                    "399211028304562",
                    "399211028326640",
                    "399211028370533",
                    "399211028407300",
                    "399211028444497",
                    "399211028460099",
                    "399211028499643",
                    "399211028520324",
                    "399211028536432",
                    "399211028549612",
                    "399211028570700",
                    "399211028571441",
                    "399211028735425",
                    "399211028736702",
                    "399211028746009",
                    "399211028760322",
                    "399211028777221",
                    "399211028781685",
                    "399211028803121",
                    "399211028841647",
                    "399211028876035",
                    "399211028940707",
                    "399211028982630",
                    "399220106224751",
                    "399220126708922"
            };
            for (String merchant : merchantList) {
                map3.put(merchant, 0);
            }

            for (String shopId : map2.keySet()) {
                String merchantNo = map2.get(shopId);
                Integer amount = map.get(shopId) == null ? 0 : map.get(shopId);
                if (map3.containsKey(merchantNo)) {
                    map3.put(merchantNo, map3.get(merchantNo) + amount);
                } else {
                    map3.put(merchantNo, amount);
                }
            }

            for (String merchantNo : map3.keySet()) {
                System.out.println(merchantNo + "\t" + map3.get(merchantNo));
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            txtReader.close();
            txt2Reader.close();
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

class ShopAmountTarger {
    private String shopId;
    private Integer amount;
    private String inMerchantNo;

    public String getShopId()
    {
        return shopId;
    }

    public void setShopId(String shopId)
    {
        this.shopId = shopId;
    }

    public Integer getAmount()
    {
        return amount;
    }

    public void setAmount(Integer amount)
    {
        this.amount = amount;
    }

    public String getInMerchantNo()
    {
        return inMerchantNo;
    }

    public void setInMerchantNo(String inMerchantNo)
    {
        this.inMerchantNo = inMerchantNo;
    }

    @Override
    public String toString()
    {
        return shopId + "\t" + amount + "\t" + inMerchantNo;
    }
}
