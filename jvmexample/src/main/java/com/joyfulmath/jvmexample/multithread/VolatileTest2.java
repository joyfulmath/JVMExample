package com.joyfulmath.jvmexample.multithread;

import com.joyfulmath.jvmexample.TraceLog;

import java.util.concurrent.CountDownLatch;

/**
 * @author deman.lu
 * @version on 2016-05-26 14:34
 */
public class VolatileTest2 {
    public volatile int inc = 0;
    static CountDownLatch countDownLatch = new CountDownLatch(100);
    public void increase() {
        inc++;
    }

    public static void main() {
        TraceLog.i();
        final VolatileTest2 test = new VolatileTest2();
        for(int i=0;i<100;i++){
            new Thread(){
                @Override
                public void run() {
                    for(int j=0;j<100;j++)
                    {
                        test.increase();
                    }
                    countDownLatch.countDown();
                }
            }.start();
        }

        try {
            countDownLatch.await();
            TraceLog.i(String.valueOf(test.inc));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
