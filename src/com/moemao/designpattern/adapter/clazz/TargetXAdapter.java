package com.moemao.designpattern.adapter.clazz;

public class TargetXAdapter extends TargetX implements TargetA
{
    @Override
    public void change()
    {
        super.execute();
        System.out.println("adapter change to A...");
    }
}
