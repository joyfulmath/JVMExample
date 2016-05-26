package com.joyfulmath.jvmexample.annnotaion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author deman.lu
 * @version on 2016-05-23 13:36
 */
@Documented//文档
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitName {

    String value() default "";
}
