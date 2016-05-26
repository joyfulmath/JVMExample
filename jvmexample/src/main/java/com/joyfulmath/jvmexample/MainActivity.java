package com.joyfulmath.jvmexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.joyfulmath.jvmexample.annnotaion.Apple;
import com.joyfulmath.jvmexample.annnotaion.FruitInfoUtils;
import com.joyfulmath.jvmexample.dispatch.DynamicDispatch;
import com.joyfulmath.jvmexample.dispatch.MultiDispatch;
import com.joyfulmath.jvmexample.dispatch.StaticDispatch;
import com.joyfulmath.jvmexample.dynamicproxy.DynamicProxyTest;
import com.joyfulmath.jvmexample.excutor.StaticResolution;
import com.joyfulmath.jvmexample.multithread.VolatileTest;
import com.joyfulmath.jvmexample.multithread.VolatileTest2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        StaticResolution.sayHello();
//        StaticDispatch.action();
//        DynamicDispatch.action();
//        MultiDispatch.action();
//        DynamicProxyTest.action();
//        FruitInfoUtils.getFruitInfo(Apple.class);
//        VolatileTest.action();
        VolatileTest2.main();
        new Apple().displayAppleName();
    }
}
