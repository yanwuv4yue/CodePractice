package com.moemao.date.timezone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class HourOfDay
{
    public static void main(String[] args)
    {

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("CST"), Locale.US);
        calendar.setLenient(false);//严格数据校验
        //2020-03-08 02:02:00
        calendar.set(2021, 2, 14, 2, 2, 0);

        Date s = new Date(calendar.getTimeInMillis());
        SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(f1.format(s));
    }
}
