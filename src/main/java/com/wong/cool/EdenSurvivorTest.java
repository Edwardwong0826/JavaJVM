package com.wong.cool;

/**
 *  -xx:NewRatio: set new generation and old generation ratio, default value is 2
 *  -xx:SurvivorRatioRatio: set new generation eden space and survivor space ratio, by default it was 8 : 1 : 1 ratio, if not need to set
 *  -xx:-UseAdaptiveSizePolicy: close adaptive memory allocation strategy
 *  -Xmn: set new generation space
 *  -XX:HandlePromotionFailure will always true after jdk 7
 *  -XX:+PrintEscapeAnalysis
 */
public class EdenSurvivorTest {

    public static void main(String[] args) {

        System.out.println("start...");
        try{
            Thread.sleep(100000000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
