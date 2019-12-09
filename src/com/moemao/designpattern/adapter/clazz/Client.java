package com.moemao.designpattern.adapter.clazz;

public class Client
{
    public static void main(String[] args)
    {
        new TargetACaller().dosm(new TargetXAdapter());
    }
}
