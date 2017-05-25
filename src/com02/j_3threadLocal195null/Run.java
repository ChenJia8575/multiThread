package com02.j_3threadLocal195null;

/**
 * Created by juqiang.xie on 2017/5/25.
 */
public class Run {
    public static ThreadLocalExt t1= new ThreadLocalExt();

    public static void main(String[] args) {
        if(t1.get()==null){
            System.out.println("从未放过值");
            t1.set("my value");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
