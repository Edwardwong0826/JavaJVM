package com.wong.heap;

/**
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * -XX:UseTLAB
 * -XX:TLABWasteTargetPercent - set ratio of tlab in eden
 *
 */
public class YoungOldSpaceTest {
    public static void main(String[] args) {
        byte[] buffer = new byte [1024*1024*20]; //20m
    }
}
