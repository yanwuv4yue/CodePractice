package com.moemao.designpattern.adapter.obj;

public class TargetACaller
{
    void dosm(TargetA target)
    {
        target.change();
        System.out.println("use A...");
    }
}
