package com.joyfulmath.jvmexample.dispatch;

import com.joyfulmath.jvmexample.TraceLog;

/**
 * @author deman.lu
 * @version on 2016-05-19 13:53
 */
public class StaticDispatch {
    static abstract class Human{

    }

    static class Man extends Human{

    }

    static class Woman extends Human{

    }

    public void sayHello(Human guy)
    {
        TraceLog.i("Hello guy!");
    }

    public void sayHello(Man man)
    {
        TraceLog.i("Hello gentleman!");
    }

    public void sayHello(Woman man)
    {
        TraceLog.i("Hello lady!");
    }

    public void sayHello(int data)
    {
        TraceLog.i("Hello int!");
    }

    public void sayHello(long  data)
    {
        TraceLog.i("Hello long");
    }

    public static void action()
    {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch dispatch = new StaticDispatch();
        dispatch.sayHello(man);
        dispatch.sayHello(woman);
        dispatch.sayHello((Man)man);
        dispatch.sayHello((Woman)woman);
    }
}
