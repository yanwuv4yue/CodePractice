package com.moemao.sync;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class CasAndUnsafe
{
    private static int a = 0;
    private static AtomicInteger b = new AtomicInteger(0);

    public static void main(String[] args) throws Exception
    {
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);

        for (int i = 0; i < threads.length; i++)
        {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++)
                {
                    a++;
                    b.addAndGet(1);
                }
                latch.countDown();
            });
        }

        Arrays.stream(threads).forEach(t -> t.start());

        latch.await();

        System.out.println(a);
        System.out.println(b.get());
    }
}
