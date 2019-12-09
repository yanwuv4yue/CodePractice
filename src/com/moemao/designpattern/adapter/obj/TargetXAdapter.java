package com.moemao.designpattern.adapter.obj;

public class TargetXAdapter implements TargetA
{
    private TargetX target;

    public TargetXAdapter(TargetX target)
    {
        this.target = target;
    }

    @Override
    public void change()
    {
        target.execute();
        System.out.println("adapter change to A...");
    }
}
