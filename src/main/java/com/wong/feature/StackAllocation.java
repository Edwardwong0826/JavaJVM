package com.wong.feature;

/**
 * -Xmx1G -Xms1G -XX:+DoEscapeAnalysis -XX:+PrintGCDetails
 *  -XX:+DoEscapeAnalysis - need use + to open escape analysis
 *  other than hotspot JVM, will possible have stack allocation feature
 */
public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for(int i=0; i < 10000000; i++){
            alloc();
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start+"ms");
        try{
            Thread.sleep(1000000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    private static void alloc(){
        User user = new User();
    }

    static class User{

    }
}
