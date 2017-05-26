package com02.j_5inheritableThreadLocal197;

import com02.j_4threadLocal196.ThreadA;
import com02.j_4threadLocal196.Tools;

/**
 * Created by juqiang.xie on 2017/5/26.
 */
public class Run {
    public static void main(String[] args) {
        try {
            for(int i=0;i<10;i++){
                System.out.println("   main "+ Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
