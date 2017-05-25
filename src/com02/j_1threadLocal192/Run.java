package com02.j_1threadLocal192;

/**
 * Created by juqiang.xie on 2017/5/24.
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i=0;i<100;i++){
                Tools.t1.set("main"+(i+1));
                System.out.println("main get value="+Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
