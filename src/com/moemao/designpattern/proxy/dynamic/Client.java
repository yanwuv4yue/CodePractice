package com.moemao.designpattern.proxy.dynamic;

public class Client
{
    public static void main(String[] args)
    {
        ITargetX instance = (ITargetX) new ProxyFactory(new TargetX()).getInstance();

        instance.execute();

        instance.print("hello dynamic proxy");
    }
}
