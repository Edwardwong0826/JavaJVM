package com.wong.meta;

/**
 *  jdk 8 and after
 * -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m\
 * Method store class information, constant, static variable, JIT code cache etc.
 * but might change the place depends on the jvm version
 * jak8 and after, string constant pool and static variable store in heap
 */
public class MetaArea {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        try{
            Thread.sleep(1000000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start+"ms");

    }
}
