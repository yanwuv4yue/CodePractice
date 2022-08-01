package com.moemao.reference.weak;

public class ThreadLocalTest
{
    public static void main(String[] args)
    {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("ok");
        System.out.println(threadLocal.get());
    }
}
