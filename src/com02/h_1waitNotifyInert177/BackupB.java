package com02.h_1waitNotifyInert177;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class BackupB extends Thread{
    private DBTools dbTools;
    public BackupB(DBTools dbTools){
        this.dbTools=dbTools;
    }
    public void run(){
        dbTools.backupB();
    }
}
