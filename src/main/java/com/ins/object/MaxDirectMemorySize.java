package com.ins.object;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 *  in JVM, we can use NIO or unsafe to direct allocate memory, this part of memory is not
 *  managed by GC. Unsafe class can direct allocate memory
 *  direct memory size can be set by MaxDirectMemorySize
 *  direct memory be default will be with heap -Xms parameter size
 */
public class MaxDirectMemorySize {
    private static final long _1MB = 1024*1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field declaredField = Unsafe.class.getDeclaredFields()[0];
        declaredField.setAccessible(true);
        Unsafe unsafe = (Unsafe)declaredField.get(null);
        while(true){
            unsafe.allocateMemory(_1MB);
        }
    }

}
