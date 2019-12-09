package com.moemao.designpattern.factory.simple;

public class Factory
{
    public static Target getA()
    {
        return new TargetA();
    }

    public static Target getB()
    {
        return new TargetB();
    }
}
