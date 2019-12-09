package com.moemao.designpattern.factory.simple;

public class TargetA implements Target
{

    @Override
    public void execute()
    {
        System.out.println("type A...");
    }
}
