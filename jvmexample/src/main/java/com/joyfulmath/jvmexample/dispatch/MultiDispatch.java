package com.joyfulmath.jvmexample.dispatch;

import com.joyfulmath.jvmexample.TraceLog;

/**
 * @author deman.lu
 * @version on 2016-05-19 15:02
 */
public class MultiDispatch {
    static class QQ{}
    static class _360{}

    public static class Father{
        public void hardChoice(QQ qq){
            TraceLog.i("Father QQ");
        }

        public void hardChoice(_360 aa){
            TraceLog.i("Father 360");
        }
    }

    public static class Son extends Father{
        public void hardChoice(QQ qq){
            TraceLog.i("Son QQ");
        }

        public void hardChoice(_360 aa){
            TraceLog.i("Son 360");
        }
    }

    public static void action()
    {
        Father father = new Father();
        Father son = new Son();
        father.hardChoice(new _360());
        son.hardChoice(new QQ());
    }
}
