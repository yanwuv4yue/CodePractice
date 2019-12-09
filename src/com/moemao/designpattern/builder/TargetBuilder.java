package com.moemao.designpattern.builder;

public abstract class TargetBuilder
{
    protected Target target = new Target();

    protected abstract void param1(Target target);

    protected abstract void param2(Target target);

    public Target build()
    {
        param1(target);
        param2(target);
        return target;
    }
}
