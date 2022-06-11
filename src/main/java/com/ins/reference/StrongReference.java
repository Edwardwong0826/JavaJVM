package com.ins.reference;

public class StrongReference {
    public static void main(String[] args) {

        // only strong reference will cause heap out of memory exception
        StringBuffer str = new StringBuffer("Hello");
        StringBuffer str1 = str;

        str = null;

        System.gc();

        try{
            Thread.sleep(1000000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
