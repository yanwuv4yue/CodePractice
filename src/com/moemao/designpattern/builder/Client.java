package com.moemao.designpattern.builder;

public class Client
{
    public static void main(String[] args)
    {
        Target target = new TargetDirector(new TargetA()).build();
        target.print();

        target = new TargetDirector(new TargetB()).build();
        target.print();
    }
}
