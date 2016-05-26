package com.joyfulmath.jvmexample.annnotaion;

import com.joyfulmath.jvmexample.TraceLog;

/**
 * @author deman.lu
 * @version on 2016-05-23 13:37
 */
public class Apple {

    @FruitName(value="Appleabc")
    String appleName;

    public void displayAppleName()
    {
        TraceLog.i(appleName);
    }
}
