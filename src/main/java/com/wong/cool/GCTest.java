package com.wong.cool;

import java.util.ArrayList;
import java.util.List;

/**
 * -XX:+PrintGCDetails - only for java 8
 * -Xlog:gc*  - for java 8 after version
 *  during GC, stop the world cause main thread stop
 *  when eden space is full(survivor space full won't, instead object will straight promote to old generation), Young GC happen
 *  when old space is full, first Young GC then Major GC, after Major GC memory still full, throw out ot memory error
 *  old space or metaspace not enough space will trigger Full GC
 *  -xx: MaxTenuringThreshold set promotion threshold
 *
 */
public class GCTest {
    public static void main(String[] args) {

        int i = 0;

        try{
            List<String> list = new ArrayList<>();
            String a = "test";
            while(true){
                list.add(a);
                a = a + a;
                i++;
            }
        }catch(Throwable t)
        {
            t.printStackTrace();
            System.out.println(i);
        }
    }
}
