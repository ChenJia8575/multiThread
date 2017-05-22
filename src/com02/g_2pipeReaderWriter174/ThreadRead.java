package com02.g_2pipeReaderWriter174;

import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ThreadRead extends  Thread{
    private ReadData read;
    private PipedReader in;
    public ThreadRead(ReadData read, PipedReader in){
        this.read = read;
        this.in=in;
    }

    public void run(){
        read.read(in);
    }
}
