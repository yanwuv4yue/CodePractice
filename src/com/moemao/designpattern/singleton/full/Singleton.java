package com.moemao.designpattern.singleton.full;

public class Singleton
{
    private Singleton instance = new Singleton();

    private Singleton()
    {

    }

    public Singleton getInstance()
    {
        return this.instance;
    }
}
