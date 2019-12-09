package com.moemao.designpattern.proxy.staticproxy;

public class TargetX implements ITargetX
{

    @Override
    public void execute()
    {
        System.out.println("doing somethine...");
    }
}
