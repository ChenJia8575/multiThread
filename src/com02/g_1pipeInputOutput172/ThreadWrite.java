package com02.g_1pipeInputOutput172;

import java.io.PipedOutputStream;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ThreadWrite extends Thread{
    private WriteData write;
    private PipedOutputStream out;
    public ThreadWrite(WriteData write,PipedOutputStream out){
        this.write = write;
        this.out=out;
    }

    public void run(){
        write.write(out);
    }
}
