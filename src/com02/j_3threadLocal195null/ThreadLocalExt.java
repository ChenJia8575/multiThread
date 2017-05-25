package com02.j_3threadLocal195null;

/**
 * Created by juqiang.xie on 2017/5/25.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "i am default value,first get not be null";
    }
}
