package com02.j_5inheritableThreadLocal197;

import java.util.Date;

/**
 * Created by juqiang.xie on 2017/5/26.
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
    /*@Override
    protected Object childValue(Object parentValue) {
        return parentValue+" added in subThread";
    }*/
}
