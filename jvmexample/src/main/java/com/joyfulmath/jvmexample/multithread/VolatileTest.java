package com.joyfulmath.jvmexample.multithread;

import android.graphics.drawable.Drawable;

import com.joyfulmath.jvmexample.TraceLog;

/**
 * @author deman.lu
 * @version on 2016-05-26 11:21
 */
public class VolatileTest {
    volatile boolean initialized = false;
    int context = 0;
    public Runnable mRun1 = new Runnable() {
        @Override
        public void run() {
            context = readFileName();
            writeFile(context);
            initialized = true;
            play();
            drawable();
        }
    };

    private void drawable() {

    }

    private void play() {

    }

    private void writeFile(int a) {
        TraceLog.i();
    }

    public Runnable mRun2 = new Runnable() {
        @Override
        public void run() {
            while (!initialized)
            {
                try {
                    TraceLog.i("sleep");
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            doSomeThing(context);
        }
    };

    private void doSomeThing(int context) {
        TraceLog.i(String.valueOf(context));
    }


    private int readFileName() {
        TraceLog.i();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public void startThread()
    {
        new Thread(mRun2).start();
        new Thread(mRun1).start();

    }

    public static void action()
    {
        VolatileTest test = new VolatileTest();
        test.startThread();
    }
}
