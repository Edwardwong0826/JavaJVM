package com.wong;

/**
 *  command to set heap size
 *  -Xms use to set heap space(young generation+elder generation) initial memory size
 *  -Xmx use to set heap space(young generation+elder generation) max memory size
 *  -XX:+PrintGCDetails
 *  use jps, jstat -gc to check set parameter
 *  advice to set xms and xmx to same value
 */
public class HeapSpaceInitial {

    public static void main(String[] args) {

        // eden only can work with one survivor space
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println(initialMemory+"M");
        System.out.println(maxMemory+"M");

        System.out.println(initialMemory * 64.0 / 1024 + "G");
        System.out.println(maxMemory * 4.0 / 1024 + "G");


    }
}
