package com02.g_1pipeInputOutput172;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ReadData {
    public void read(PipedInputStream in){
        try {
            System.out.println("read:");
            byte[] byteArray = new byte[20];
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
