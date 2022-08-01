package com.moemao.tools;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShengShiQu {
    public static void main(String[] args) throws Exception
    {
        String path = "/Users/yanwuv4yue/";
        String txtPath = "area_data.js";

        BufferedReader txtReader = null;

        try {
            txtReader = Files.newBufferedReader(Paths.get(path + txtPath));
            String line = "";
            StringBuffer sb = new StringBuffer();
            while (null != (line = txtReader.readLine()))
            {
                sb.append(line);
            }

            System.out.println(sb.toString());



        } catch (Exception e) {
            System.out.println(e);
        } finally {
            txtReader.close();
        }
    }
}
