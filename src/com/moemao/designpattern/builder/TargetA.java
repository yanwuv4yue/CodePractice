package com.moemao.designpattern.builder;

public class TargetA extends TargetBuilder
{
    @Override
    protected void param1(Target target)
    {
        target.setParam1("A1");
    }

    @Override
    protected void param2(Target target)
    {
        target.setParam2("A2");
    }
}
