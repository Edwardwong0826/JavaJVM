package com.wong.meta;

/**
 * static reference new object instance always in heap
 * static variable stored in Class object,class object in class loading phase (loading,linking) created
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
