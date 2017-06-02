package com04.a_4timerCancel250;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by juqiang.xie on 2017/6/2.
 */
public class Run3 {
    static int i=0;
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("run "+ i);
        }
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            try {
                i++;
                Timer timer = new Timer();
                MyTask task = new MyTask();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dstr="2017-06-02 16:47:58";
                Date date = sdf.parse(dstr);
                timer.schedule(task,date);
                timer.cancel();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }





}
