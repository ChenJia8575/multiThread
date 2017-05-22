package com02.h_1waitNotifyInert177;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools= new DBTools();
        for (int i=0;i<20;i++) {
            BackupB out = new BackupB(dbTools);
            out.start();
            BackupA in = new BackupA(dbTools);
            in.start();
        }
    }
}
