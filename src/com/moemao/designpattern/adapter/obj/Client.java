package com.moemao.designpattern.adapter.obj;

public class Client
{
    public static void main(String[] args)
    {
        new TargetACaller().dosm(new TargetXAdapter(new TargetX()));
    }
}
