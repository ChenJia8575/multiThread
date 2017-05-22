package com02.h_1waitNotifyInert177;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class DBTools {
    volatile private boolean prevIsA=false;
    synchronized public void backupA(){
        try {
            while (prevIsA==true){
                wait();
            }
            for (int i = 0;i<5;i++) {
                System.out.println("AAAAA");
            }
            prevIsA=true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB(){
        try {
            while (prevIsA==false){
                wait();
            }
            for (int i = 0;i<5;i++) {
                System.out.println("aaaaa");
            }
            prevIsA=false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
