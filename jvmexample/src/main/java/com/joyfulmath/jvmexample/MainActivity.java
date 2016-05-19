package com.joyfulmath.jvmexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.joyfulmath.jvmexample.excutor.StaticResolution;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StaticResolution.sayHello();
    }
}
