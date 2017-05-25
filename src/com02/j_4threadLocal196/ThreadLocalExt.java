package com02.j_4threadLocal196;

import java.util.Date;

/**
 * Created by juqiang.xie on 2017/5/25.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
