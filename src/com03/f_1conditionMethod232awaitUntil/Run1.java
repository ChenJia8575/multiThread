package com03.f_1conditionMethod232awaitUntil;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Run1 {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadWait wait = new ThreadWait(service);
        wait.start();
    }
}
