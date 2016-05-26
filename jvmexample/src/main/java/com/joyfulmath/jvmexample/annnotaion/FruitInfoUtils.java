package com.joyfulmath.jvmexample.annnotaion;

import com.joyfulmath.jvmexample.TraceLog;

import java.lang.reflect.Field;

/**
 * @author deman.lu
 * @version on 2016-05-23 14:08
 */
public class FruitInfoUtils {
    public static void getFruitInfo(Class<?> clazz)
    {
        String fruitNameStr = "";
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields)
        {
            if(field.isAnnotationPresent(FruitName.class))
            {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                fruitNameStr = fruitName.value();
                TraceLog.i(fruitNameStr);
            }
        }
    }
}
