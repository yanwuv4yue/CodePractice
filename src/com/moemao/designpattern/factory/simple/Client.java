package com.moemao.designpattern.factory.simple;

public class Client
{
    public static void main(String[] args)
    {
        Target a = Factory.getA();
        Target b = Factory.getB();

        a.execute();
        b.execute();
    }
}
