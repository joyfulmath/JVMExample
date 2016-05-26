package com.joyfulmath.jvmexample.multithread;

/**
 * @author deman.lu
 * @version on 2016-05-26 14:20
 */
public class VolatileExample {

    boolean aBoolean = false;
    public Runnable mRun1 = new Runnable() {
        @Override
        public void run() {
            aBoolean = false;
            while (!aBoolean)
            {
                doSomeThing();
            }
        }
    };

    public Runnable mRun2 = new Runnable() {
        @Override
        public void run() {
            aBoolean = true;
        }
    };

    private void doSomeThing() {

    }
}
