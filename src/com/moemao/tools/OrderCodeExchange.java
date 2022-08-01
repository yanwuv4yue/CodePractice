package com.moemao.tools;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OrderCodeExchange {
    private static String file_db = "2080-6-db.txt";
    private static String file_es = "2080-6-es.txt";

    public static void main(String[] args) throws IOException
    {
        String path = "/Users/yanwuv4yue/2581/";
        File fileDb = new File(path + file_db);
        File fileEs = new File(path + file_es);

        BufferedReader dbbr = null;
        BufferedReader esbr = null;
        BufferedWriter bfw = null;

        //创建BufferedReader
        try {
            dbbr = Files.newBufferedReader(Paths.get(path + file_db));
            esbr = Files.newBufferedReader(Paths.get(path + file_es));

            List<String> dbList = toList(dbbr);
//            System.out.println(dbList.size());
            List<String> esList = toList(esbr);
//            System.out.println(esList.size());
            for (String orderCode : esList)
            {
                dbList.remove(orderCode);
            }

            dbList.stream().forEach(code -> System.out.println(code));

//            bfw=Files.newBufferedWriter(Paths.get(path + "result.txt"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            dbbr.close();
            esbr.close();
//            bfw.flush();
//            bfw.close();
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
