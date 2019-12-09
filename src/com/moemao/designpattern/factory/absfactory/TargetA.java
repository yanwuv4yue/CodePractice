package com.moemao.designpattern.factory.absfactory;

public class TargetA implements ITargetX
{
    @Override
    public void m1()
    {
        System.out.println("A1...");
    }

    @Override
    public void m2()
    {
        System.out.println("A2...");
    }

    @Override
    public void m3()
    {
        System.out.println("A3...");
    }
}
