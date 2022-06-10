package com.ins.gc;

import java.util.ArrayList;

/** -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 *
 */
public class HeapOOM {
    byte[] buffer = new byte [1 * 1024 * 1024]; //1mb

    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();
        int count = 0;
        try
        {
            while(true){
                list.add(new HeapOOM());
                count++;
            }
        }catch (Throwable e){
            System.out.println(count);
            e.printStackTrace();
        }
    }
}
