package com.joyfulmath.jvmexample.dispatch;

import com.joyfulmath.jvmexample.TraceLog;

/**
 * @author deman.lu
 * @version on 2016-05-19 14:26
 */
public class DynamicDispatch {
    static abstract class Human{
        protected abstract void sayHello();
    }

    static class Man extends Human{

        @Override
        protected void sayHello() {
            TraceLog.i("Hello gentleman!");
        }
    }

    static class Woman extends Human{

        @Override
        protected void sayHello() {
            TraceLog.i("Hello lady!");
        }
    }

    public static void action()
    {
        Human man = new Man();
        Human woman = new Woman();
        man.sayHello();
        woman.sayHello();
        man = new Woman();
        man.sayHello();
    }
}
