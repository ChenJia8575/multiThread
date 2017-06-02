package com04.a_2timer244;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by juqiang.xie on 2017/6/2.
 */
public class Run {
    private static Timer timer = new Timer();
    static public class MyTask1 extends TimerTask{
        @Override
        public void run() {
            System.out.println("1 started,time "+new Date());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1 ended  ,time "+new Date());
        }
    }
    static public class MyTask2 extends TimerTask{
        @Override
        public void run() {
            System.out.println("2 started,time "+new Date());
        }
    }
    public static void main(String[] args) throws Exception {
        MyTask1 task1 = new MyTask1();
        MyTask2 task2 = new MyTask2();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dstr1="2017-06-02 17:07:40";
        String dstr2="2017-06-02 17:07:41";
        Date date1 = sdf.parse(dstr1);
        Date date2 = sdf.parse(dstr2);
        System.out.println(  sdf.format(new Date()));
        timer.schedule(task1,date1);
        timer.schedule(task2,date2);
    }





}
