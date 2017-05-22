package com02.i_4joinLong183;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            thread.join(2000);
            Thread.sleep(2000);
            System.out.println("  end timer="+ System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
