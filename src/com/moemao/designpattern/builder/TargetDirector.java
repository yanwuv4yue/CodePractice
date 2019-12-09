package com.moemao.designpattern.builder;

public class TargetDirector
{
    private TargetBuilder builder;

    public TargetDirector(TargetBuilder builder)
    {
        this.builder = builder;
    }

    public Target build()
    {
        return builder.build();
    }
}
