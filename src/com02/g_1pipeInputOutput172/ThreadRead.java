package com02.g_1pipeInputOutput172;

import java.io.PipedInputStream;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ThreadRead extends  Thread{
    private ReadData read;
    private PipedInputStream in;
    public ThreadRead(ReadData read, PipedInputStream in){
        this.read = read;
        this.in=in;
    }

    public void run(){
        read.read(in);
    }
}
