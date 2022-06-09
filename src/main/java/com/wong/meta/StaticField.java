package com.wong.meta;

/**
 * static reference new object instance always in heap
 */
public class StaticField {

    private static byte[] arr = new byte[1024*1024*100]; //100M
    public static void main(String[] args) {
        System.out.println(StaticField.arr);
        try{
            Thread.sleep(1000000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
