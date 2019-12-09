package com.moemao.designpattern.factory.absfactory;

public class TargetB implements ITargetX
{
    @Override
    public void m1()
    {
        System.out.println("B1...");
    }

    @Override
    public void m2()
    {
        System.out.println("B2...");
    }

    @Override
    public void m3()
    {
        System.out.println("B3...");
    }
}
