package com02.h_1waitNotifyInert177;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class BackupA extends Thread{
    private DBTools dbTools;
    public BackupA(DBTools dbTools){
        this.dbTools=dbTools;
    }
    public void run(){
        dbTools.backupA();
    }
}
