package com.moemao.designpattern.factory.absfactory;

public class Client
{
    public static void main(String[] args)
    {
        ITargetX a = new FactoryProxy(new FactoryA()).create();
        ITargetX b = new FactoryProxy(new FactoryB()).create();

        // add TargetC and FactoryC
        // ITargetX c = new FactoryProxy(new FactoryC()).create();
    }
}
