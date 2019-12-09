package com.moemao.designpattern.factory.absfactory;

public class FactoryA implements IFactory
{

    @Override
    public ITargetX create()
    {
        TargetA a = new TargetA();
        a.m1();
        a.m2();
        a.m3();
        return a;
    }
}
