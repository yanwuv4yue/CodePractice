package com.moemao.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderIdExtra {

    public static void main(String[] args) throws Exception
    {
        String path = "/Users/yanwuv4yue/";
        String txtPath = "1452.txt";
        String txt2Path = "1442.txt";

        BufferedReader txtReader = null;
        BufferedReader txt2Reader = null;

        try {
            txtReader = Files.newBufferedReader(Paths.get(path + txtPath));
            txt2Reader = Files.newBufferedReader(Paths.get(path + txt2Path));

            List<String> txtList = toList(txtReader);
            List<String> txt2List = toList(txt2Reader);

            for (String orderId : txtList) {
                if (!txt2List.contains(orderId)) {
                    System.out.println(orderId);
                }
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
