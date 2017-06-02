package com04.a_5timer253schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by juqiang.xie on 2017/6/2.
 */
public class Run2 {
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("started,time "+new Date());
        }
    }

    public static void main(String[] args) throws Exception {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        timer.schedule(task,2000,3000);
    }
}
