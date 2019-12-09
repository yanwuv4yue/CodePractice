package com.moemao.designpattern.factory.absfactory;

public class FactoryB implements IFactory
{

    @Override
    public ITargetX create()
    {
        TargetB b = new TargetB();
        b.m1();
        b.m2();
        b.m3();
        return b;
    }
}
