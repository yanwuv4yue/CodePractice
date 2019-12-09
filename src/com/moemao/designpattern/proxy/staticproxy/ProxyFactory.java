package com.moemao.designpattern.proxy.staticproxy;

public class ProxyFactory implements ITargetX
{
    private ITargetX target;

    public ProxyFactory(ITargetX target)
    {
        this.target = target;
    }

    @Override
    public void execute()
    {
        System.out.println("static proxy start...");
        this.target.execute();
    }
}
