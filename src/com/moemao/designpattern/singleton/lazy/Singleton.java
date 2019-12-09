package com.moemao.designpattern.singleton.lazy;

public class Singleton
{
    private Singleton instance;

    private Singleton()
    {

    }

    public Singleton getInstance()
    {
        if (this.instance == null)
        {
            this.instance = new Singleton();
        }
        return this.instance;
    }
}
