package com.joyfulmath.jvmexample.threadsafe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author deman.lu
 * @version on 2016-05-27 10:41
 */
public class ThreadSafeType {

    public AtomicInteger race = new AtomicInteger();

    class ThreadContext{
        public  int id = -1;
    }

    public void doSomeThingBackground(final ThreadContext context)
    {
        new Thread(){
            @Override
            public void run(){
                context.id++;
            }
        }.start();
    }
}
