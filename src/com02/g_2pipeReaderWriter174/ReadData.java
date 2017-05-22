package com02.g_2pipeReaderWriter174;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ReadData {
    public void read(PipedReader in){
        try {
            System.out.println("read:");
            char[] byteArray = new char[20];
            int readLengh=in.read(byteArray);
            while(readLengh!=-1){
                String newData = new String(byteArray,0,readLengh);
                System.out.print("r"+newData);
                readLengh=in.read(byteArray);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
