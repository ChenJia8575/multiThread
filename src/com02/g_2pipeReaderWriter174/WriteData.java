package com02.g_2pipeReaderWriter174;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class WriteData {
    public void write(PipedWriter out){
        try {
            System.out.println("write :");
            for (int i=1;i<=300;i++){
                String outData = ""+i;
                out.write(outData);
                System.out.print("w"+outData);
                Thread.sleep(5);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
