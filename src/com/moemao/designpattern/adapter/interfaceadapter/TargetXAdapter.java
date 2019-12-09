package com.moemao.designpattern.adapter.interfaceadapter;

public abstract class TargetXAdapter implements ITargetX
{
    @Override
    public void m1()
    {
        System.out.println("default m1...");
    }

    @Override
    public void m2()
    {
        System.out.println("default m2...");
    }

    @Override
    public void m3()
    {
        System.out.println("default m3...");
    }
}
