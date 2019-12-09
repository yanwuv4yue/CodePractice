package com.moemao.designpattern.proxy.staticproxy;

public class Client
{
    public static void main(String[] args)
    {
        ITargetX target = new TargetX();
        new ProxyFactory(target).execute();
    }
}
