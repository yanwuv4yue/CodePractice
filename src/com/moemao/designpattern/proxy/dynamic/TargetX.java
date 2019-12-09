package com.moemao.designpattern.proxy.dynamic;

public class TargetX implements ITargetX
{
    private String a = "";

    public void setA(String a)
    {
        this.a = a;
    }

    @Override
    public void execute()
    {
        System.out.println("execute...");
    }

    @Override
    public void print()
    {
        System.out.println("print..." + this.a);
    }
}
