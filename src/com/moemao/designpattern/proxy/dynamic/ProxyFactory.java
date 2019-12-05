package com.moemao.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yanwuv4yue
 */
public class ProxyFactory<T>
{
    private T target;

    ProxyFactory(T target)
    {
        this.target = target;
    }

    public T getInstance()
    {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
            {
                System.out.println("JDK动态代理开始...");

                return method.invoke(target, args);
            }
        });
    }
}
