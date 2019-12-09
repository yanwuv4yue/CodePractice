package com.moemao.designpattern.factory.absfactory;

public class FactoryProxy implements IFactory
{
    private IFactory factory;

    public FactoryProxy(IFactory factory)
    {
        this.factory = factory;
    }

    @Override
    public ITargetX create()
    {
        return factory.create();
    }
}
