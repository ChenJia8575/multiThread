package com02.j_1threadLocal191;

/**
 * Created by juqiang.xie on 2017/5/24.
 */
public class Run {
    public static ThreadLocal t1 = new ThreadLocal();
    public static void main(String[] args) {
        if(t1.get()==null){
            System.out.println("从未放过值");
            t1.set("myvalue");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }

}
