package com04.a_1timer242;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by juqiang.xie on 2017/6/2.
 */
public class Run2 {
    private static Timer timer = new Timer(true);
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("started,time "+new Date());
        }
    }

    public static void main(String[] args) throws Exception {
        MyTask task = new MyTask();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dstr="2017-06-02 16:52:30";
        Date date = sdf.parse(dstr);
        System.out.println( date +"  "+ sdf.format(new Date()));
        timer.schedule(task,date);
    }





}
