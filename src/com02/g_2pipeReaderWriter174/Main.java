package com02.g_2pipeReaderWriter174;

import java.io.*;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class Main {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedReader inputStream = new PipedReader();
            PipedWriter outputStream = new PipedWriter();
            outputStream.connect(inputStream);
            ThreadRead threadRead = new ThreadRead(readData,inputStream);
            threadRead.start();
            Thread.sleep(2000);
            ThreadWrite threadWrite = new ThreadWrite(writeData,outputStream);
            threadWrite.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
