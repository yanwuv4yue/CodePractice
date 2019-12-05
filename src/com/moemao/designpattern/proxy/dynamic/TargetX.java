package com.moemao.designpattern.proxy.dynamic;

public class TargetX implements ITargetX
{
    @Override
    public void execute()
    {
        System.out.println("execute...");
    }

    @Override
    public void print(String string)
    {
        System.out.println("print..." + string);
    }
}
