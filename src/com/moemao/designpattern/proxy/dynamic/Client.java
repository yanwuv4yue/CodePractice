package com.moemao.designpattern.proxy.dynamic;

public class Client
{
    public static void main(String[] args)
    {
        TargetX targetX = new TargetX();
        targetX.setA("aaaaaaaa");

        ITargetX instance = (ITargetX) new ProxyFactory(targetX).getInstance();

        instance.execute();

        instance.print();
    }
}
