package com.moemao.tools;

public class SvcRefund {
    public static String[] list = {
            "23985171048661028800002--5000",
            "24143925912552089800002--5000",
            "24114093879519393700001--20000",
            "24195957153978320000001--20000",
            "24175614897528536000001--5000",
            "24204234326661069600003--20000",
            "24197496649772370300004--20000",
            "24197490362827421300002--20000"
    };


    public static void main(String[] args) throws Exception
    {
        for (String str : list) {
            print(str.split("--")[0], String.valueOf(System.currentTimeMillis()), str.split("--")[1]);
            Thread.sleep(10L);
            System.out.println("\n");
        }
    }

    private static void print(String orderCode, String time, String amount) {
        System.out.println("{\n" + "    \"orderCode\": \""+orderCode+"\",\n" + "    \"frontTransId\": \""+orderCode+"\",\n" + "    \"transId\": \""+orderCode+"\",\n" + "    \"refundId\": \""+time+"\",\n" + "    \"frontRefundId\": \""+time+"\",\n" + "    \"totalAmount\": "+amount+",\n" + "    \"refundAmount\": "+amount+",\n" + "    \"isVer3\": false,\n" + "    \"ver\": \"2\",\n" + "    \"partnerId\": \"2581\",\n" + "    \"storeId\": \"100003\",\n" + "    \"businessDate\": \"string\",\n" + "    \"refundDesc\": \"svcRefund\",\n" + "    \"notifyUrl\": \"string\"\n" + "}");
    }

}
