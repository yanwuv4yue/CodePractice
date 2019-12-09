package com.moemao.designpattern.builder;

public class TargetB extends TargetBuilder
{
    @Override
    protected void param1(Target target)
    {
        target.setParam1("B1");
    }

    @Override
    protected void param2(Target target)
    {
        target.setParam2("B2");
    }
}
