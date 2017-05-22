package com02.g_1pipeInputOutput172;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class WriteData {
    public void write(PipedOutputStream out){
        try {
            System.out.println("write :");
            for (int i=1;i<=300;i++){
                String outData = ""+i;
                out.write(outData.getBytes());
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
