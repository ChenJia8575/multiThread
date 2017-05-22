package com02.g_2pipeReaderWriter174;

import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ThreadWrite extends Thread{
    private WriteData write;
    private PipedWriter out;
    public ThreadWrite(WriteData write, PipedWriter out){
        this.write = write;
        this.out=out;
    }

    public void run(){
        write.write(out);
    }
}
