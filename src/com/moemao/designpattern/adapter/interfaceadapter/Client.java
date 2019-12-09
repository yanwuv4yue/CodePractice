package com.moemao.designpattern.adapter.interfaceadapter;

public class Client
{
    public static void main(String[] args)
    {
        TargetXAdapter targetXAdapter = new TargetXAdapter() {
            @Override
            public void m1()
            {
                System.out.println("new m1...");
            }
        };

        targetXAdapter.m1();
        targetXAdapter.m2();
        targetXAdapter.m3();
    }
}
