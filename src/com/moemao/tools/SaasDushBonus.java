package com.moemao.tools;

import java.util.HashMap;
import java.util.Map;

public class SaasDushBonus
{
    public static String[] list = {
            "殷豪-5",
            "陈雪晴-2",
            "朱瑞-5",
            "朱瑞-2",
            "陈雪晴- ",
            "陈雪晴-5",
            "谭金凤-1",
            "朱瑞-1",
            "-0",
            "张鹏-0",
            "史志东-20",
            "刘海涛-20",
            "张鹏-30",
            "-0",
            "杨征寰-10",
            "陈雪晴-5",
            "付洪庆-20",
            "蔡浩伟-10",
            "付洪庆-10",
            "- ",
            "丁维坤-50",
            "张鹏-20",
            "付洪庆-30",
            "-0",
            "程飞祥-5",
            "殷豪-10",
            "付洪庆-5",
            "刘继明-20",
            "张明警-20",
            "陈雪晴-10",
            "陈雪晴-25",
            "李学兴-25",
            "李学兴-5",
            "李学兴-10",
            "程飞祥-10",
            "程飞祥-10",
            "程飞祥-20",
            "付洪庆-20",
            "-0",
            "蒋小洋-0",
            "胡敬轩-5",
            "-0",
            "朱瑞-2",
            "-0",
            "-0",
            "- ",
            "-0",
            "陈雪晴-20",
            "施冬冬-2",
            "谷向坤-15",
            "施冬冬-2",
            "邓秋黎-25",
            "伍平-20",
            "查志伟-20",
            "谷向坤-15",
            "胡博文-2",
            "杨征寰-10",
            "-0",
            "朱瑞-3",
            "陈斌-10",
            "陈斌-15",
            "-0",
            "胡博文-15",
            "胡博文;伍平-25",
            "查志伟-15",
            "-0",
            "查志伟-25",
            "刘博宇LiuBoYu-5",
            "张彪-10",
            "黄继谦-5",
            "杨征寰-10",
            "朱瑞-3",
            "朱瑞-15",
            "朱瑞-2",
            "黄继谦-10",
            "黄继谦-20",
            "刘昶伯-5",
            "伍平-30",
            "查志伟-15",
            "彭诗炜-5",
            "彭诗炜-5",
            "彭诗炜-10",
            "彭诗炜;陈雪晴-10",
            "彭诗炜-10",
            "彭诗炜-10",
            "张明警-30",
            "杨征寰-10",
            "陈雪晴-20",
            "-0",
            "殷豪-10",
            "谭金凤-2",
            "陈雪晴-10",
            "谭金凤-2",
            "谭金凤-2",
            "谭金凤-1",
            "谭金凤-1",
            "谭金凤-1",
            "谭金凤-5",
            "谭金凤-5",
            "谭金凤-5",
            "谭金凤-5",
            "谭金凤-5",
            "-0",
            "谭金凤-5",
            "蔡浩伟-10",
            "谭金凤-0",
            "谭金凤-5",
            "刘悦-30",
            "陈雪晴-40",
            "-0",
            "陈雪晴-5",
            "杨征寰;程飞祥-10",
            "朱瑞-5",
            "-0",
            "刘悦-5",
            "刘继明-10",
            "陈斌-20",
            "朱瑞-3",
            "张辉5893-10",
            "朱瑞-5",
            "查志伟-10",
            "赵恒琳-10",
            "刘悦-5",
            "陈雪晴-10",
            "李倩琳-15",
            "李倩琳-10",
            "查志伟-10",
            "查志伟-10",
            "刘继明-10",
            "伍平-20",
            "-0",
            "史志东-20",
            "丁维坤-50",
            "张豹-50",
            "朱瑞-1",
            "邓秋黎-10",
            "蒋小洋-10",
            "-0",
            "赵恒琳-5",
            "谭金凤-10",
            "李学兴-15",
            "赵恒琳-10",
            "赵恒琳-15",
            "赵恒琳-5",
            "-0",
            "查志伟-5",
            "陈雪晴-5",
            "殷豪-10",
            "陈雪晴-5",
            "谭金凤-10",
            "-0",
            "蔡浩伟-5",
            "邓秋黎-5",
            "-0",
            "张文凯-10",
            "张文凯-15",
            "-0",
            "邓秋黎-10",
            "邓秋黎-10",
            "邓秋黎-20",
            "邓秋黎-5",
            "邓秋黎-10",
            "邓秋黎-5",
            "张文凯-10",
            "张文凯-20",
            "张文凯-10",
            "张文凯-35",
            "张文凯-15",
            "张文凯-15",
            "张文凯-10",
            "张文凯-10",
            "张文凯-5",
            "张文凯-5",
            "张文凯-5",
            "张文凯-20",
            "张文凯-15",
            "张文凯-10",
            "张文凯-15",
            "张文凯-10",
            "邓秋黎- ",
            "陈雪晴-5",
            "邓秋黎-2",
            "邓秋黎-5",
            "邓秋黎-3",
            "邓秋黎-3",
            "邓秋黎-5",
            "邓秋黎-10",
            "张文凯-20",
            "邓秋黎-10",
            "殷豪;杨征寰-20",
            "张文凯-20",
            "张文凯-20",
            "张文凯-10",
            "张文凯-20",
            "张文凯-20",
            "张文凯-30",
            "张文凯-40",
            "-0",
            "邓秋黎-20",
            "陈斌-10",
            "-0",
            "谭金凤-30",
            "谭金凤-30",
            "殷豪;杨征寰-20",
            "殷豪-20",
            "殷豪-25",
            "杨征寰-25",
            "杨征寰-25",
            "-0",
            "-10",
            "杨征寰-5",
            "杨征寰-5",
            "杨征寰-10",
            "杨征寰-20",
            "陈雪晴-5",
            "陈雪晴-10",
            "杨征寰-5",
            "朱瑞-1",
            "-0",
            "史志东-30",
            "肖小磊-100",
            "任翠翠-50",
            "任翠翠-50",
            "陈雪晴-10",
            "-0",
            "-0",
            "刘海涛-10",
            "张豹-10",
            "蔡浩伟-15",
            "蔡浩伟-15",
            "谭金凤-30",
            "宋云鹏-30",
            "谌会阳-10",
            "谌会阳-5",
            "谌会阳-20",
            "-0",
            "李倩琳-5",
            "陈雪晴-5",
            "张明警-10",
            "张明警-20",
            "陈雪晴-25",
            "张帅华;陈雪晴-25",
            "陈雪晴-20",
            "张帅华-20",
            "李倩琳-20",
            "谭金凤-20",
            "谭金凤-30",
            "张明警-25",
            "伍平-30",
            "张明警-10",
            "李学兴-15",
            "赵恒琳-10",
            "查志伟-10",
            "查志伟-10",
            "张明警-20",
            "查志伟-10",
            "查志伟-10",
            "张明警-20",
            "李学兴-15",
            "赵恒琳-10",
            "李学兴-20",
            "张明警-10",
            "李学兴-25",
            "刘继明-10",
            "李学兴-20",
            "赵恒琳-10",
            "张明警-10",
            "赵恒琳-10",
            "赵恒琳-10",
            "张明警-30",
            "-0",
            "-0",
            "史志东-20",
            "肖小磊-40",
            "谭金凤-2",
            "-0",
            "胡博文-10",
            "蒋小洋-20",
            "徐晨-0",
            "朱瑞-10",
            "赵恒琳-5",
            "查志伟-15",
            "伍平-15",
            "陈雪晴-30",
            "伍平-15",
            "伍平-15",
            "蒋小洋-20",
            "蒋小洋-20",
            "蒋小洋-10",
            "-0",
            "史志东-30",
            "丁维坤-30",
            "张豹-20",
            "-0",
            "谭金凤-5",
            "谭金凤-10",
            "谭金凤-5",
            "陈斌-20",
            "陈斌-15",
            "陈斌-15",
            "朱瑞-5",
            "张豹;史志东;丁维坤-0",
            "张豹-30",
            "丁维坤-20",
            "史志东-20",
            "张豹-0",
            "张豹-50",
            "丁维坤-20",
            "史志东-20",
            "- ",
            "朱瑞-5",
            "刘博宇LiuBoYu-20",
            "-0",
            "杨为华;丁维坤-30",
            "丁维坤-30",
            "杨为华-30",
            "- ",
            "黄继谦-15",
            "殷豪-10",
            "-0",
            "刘兵-20",
            "杨为华-30",
            "-0",
            "伍平-10",
            "李倩琳-10",
            "伍平-10",
            "张明警-15",
            "谭金凤-10",
            "-0",
            "查志伟-5",
            "查志伟-15",
            "赵恒琳-10",
            "赵恒琳-5",
            "李倩琳-10",
            "邓秋黎-15",
            "-0",
            "朱瑞-5",
            "张明警-20",
            "-0",
            "史志东-30",
            "丁维坤-20",
            "杨为华-20",
            "-0",
            "黄继谦-13",
            "刘兵-10",
            "黄继谦-2",
            "-0",
            "伍平-5",
            "-0",
            "杨征寰-0",
            "杨征寰-10",
            "杨征寰-10",
            "杨征寰-10",
            "杨征寰-10",
            "杨征寰-10",
            "杨征寰-10",
            "邓秋黎-20",
            "-0",
            "胡博文-30",
            "张帅华-10",
            "胡博文-5",
            "邓秋黎-2",
            "张帅华-15",
            "谷向坤-15",
            "张志恒-10",
            "张志恒-15",
            "伍平-40",
            "张文凯-10",
            "张文凯-20",
            "张文凯-35",
            "张帅华-20",
            "张志恒-15",
            "邓秋黎-10",
            "伍平-20",
            "张志恒-15",
            "张文凯-20",
            "-0",
            "刘继明-10",
            "徐光兴-20",
            "张帅华-20",
            "查志伟-20",
            "伍平-15",
            "谷向坤-20",
            "邓秋黎-5",
            "邓秋黎-5",
            "邓秋黎-10",
            "邓秋黎-10",
            "谷向坤-10",
            "谷向坤-10",
            "谷向坤-10",
            "谷向坤-10",
            "谷向坤-10",
            "李学兴-0",
            "李学兴-20",
            "谌会阳-10",
            "胡博文;李学兴-20",
            "李学兴-15",
            "李学兴-20",
            "陈雪晴-20",
            "张彪-20",
            "李学兴-15",
            "肖小磊-30",
            "徐光兴-25",
            "徐光兴-15",
            "-0",
            "-0",
            "陈雪晴-10",
            "-20",
            "邓秋黎-5",
            "-20",
            "-0",
            "邓秋黎-10",
            "赵恒琳-30",
            "-0",
            "-0",
            "查志伟-10",
            "张彪-10",
            "谷向坤-15",
            "谷向坤-10",
            "-0",
            "陈斌-20",
            "史志东-30",
            "史志东;肖小磊-150",
            "-0",
            "陈雪晴-5",
            "蒋小洋-15",
            "蒋小洋-5",
            "施冬冬-1",
            "殷豪-10",
            "查志伟-5",
            "陈雪晴-35",
            "查志伟-15",
            "蒋小洋-20",
            "查志伟-15",
            "蒋小洋-30",
            "谭金凤-15",
            "谭金凤-15",
            "谭金凤-10",
            "-0",
            "殷豪-10",
            "朱瑞-5",
            "李倩琳-10",
            "李倩琳-5",
            "李倩琳-10",
            "李倩琳-5",
            "谭金凤-5",
            "施冬冬;黄继谦-25",
            "施冬冬;黄继谦-15",
            "施冬冬;黄继谦-10",
            "李学兴-20",
            "李学兴-10",
            "李学兴-10",
            "李学兴-10",
            "黄继谦-15",
            "李倩琳-5",
            "黄继谦-15",
            "谭金凤-30",
            "李倩琳-5",
            "黄继谦-10",
            "施冬冬;黄继谦-10",
            "李倩琳-35",
            "施冬冬;黄继谦-10",
            "李学兴-10",
            "李倩琳-20",
            "-0",
            "陈斌-5",
            "刘继明-5",
            "刘继明-10",
            "邓秋黎-10",
            "刘悦-15",
            "伍平;胡博文-20",
            "刘继明-10",
            "伍平-15",
            "张帅华-25",
            "徐光兴-5",
            "陈雪晴-30",
            "刘继明-10",
            "伍平-20",
            "-0",
            "刘继明-5",
            "伍平-10",
            "张帅华-20",
            "-0",
            "李倩琳-20",
            "张文凯-10",
            "刘悦-10",
            "徐光兴-25",
            "查志伟-30",
            "刘悦-30",
            "刘悦-25",
            "邓秋黎-10",
            "李倩琳-20",
            "陈雪晴-10",
            "邓秋黎-15"
    };
    public static void main(String[] args)
    {
        Map<String, Float> map = new HashMap<>();
        for (String str : list)
        {
            String name = str.split("-")[0];
            if ("".equals(name.trim()))
            {
                continue;
            }
            String work = str.split("-")[1];
            if ("".equals(work.trim()))
            {
                continue;
            }

            if (!name.contains(";"))
            {
                if (map.containsKey(name))
                {
                    map.put(name, map.get(name) + Float.parseFloat(work));
                }
                else
                {
                    map.put(name, Float.parseFloat(work));
                }
            }
            else
            {
                for (String nameStr : name.split(";"))
                {
                    if (map.containsKey(nameStr))
                    {
                        map.put(nameStr, map.get(nameStr) + Float.parseFloat(work) / 2);
                    }
                    else
                    {
                        map.put(nameStr, Float.parseFloat(work) / 2);
                    }
                }
            }

        }

        for (String name : map.keySet())
        {
            System.out.println(name + "\t" + map.get(name));
        }
    }
}
