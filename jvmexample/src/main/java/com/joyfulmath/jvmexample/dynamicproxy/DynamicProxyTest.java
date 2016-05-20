package com.joyfulmath.jvmexample.dynamicproxy;

import com.joyfulmath.jvmexample.TraceLog;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * @author deman.lu
 * @version on 2016-05-20 14:04
 */
public class DynamicProxyTest {
    interface IHello{
        void sayHello();
    }

    static class Hello implements IHello{

        @Override
        public void sayHello() {
            TraceLog.i("Hello world!");
        }
    }

    static class DynamicProxy implements InvocationHandler{

        Object originalObj;

        Object bind(Object obj)
        {
            this.originalObj = obj;
            return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(),originalObj.getClass().getInterfaces(),this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            TraceLog.i("welcome");
            return method.invoke(originalObj,args);
        }
    }

    public static void action()
    {
        IHello hello = (IHello) new DynamicProxy().bind(new Hello());
        hello.sayHello();
    }
}
