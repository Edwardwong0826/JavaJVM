package com.ins.object;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 *  in JVM, we can use NIO or unsafe to direct allocate memory, this part of memory is not
 *  managed by GC. Unsafe class can direct allocate memory
 *  direct memory size can be set by MaxDirectMemorySize
 *  direct memory be default will be with heap -Xms parameter size
 *
 *  also can refer as off heap memory means non managed by Java Garbage Collector
 *  and on heap memory means the object present in the Java heap and subject to Garbage Collector
 *  https://stackoverflow.com/questions/6091615/difference-between-on-heap-and-off-heap
 *  https://stackoverflow.com/questions/78401046/understanding-off-heap-memory-unsafe-and-maxdirectmemorysize-for-a-java-applic
 *
 *  One of the off heap memory use case in Java using Unsafe is the DirectByteBuffer
 *  is an important class used by Java to implement off-heap memory, which is usually used as a buffer pool in the communication process,
 *  such as in Netty, MINA and other NIO frameworks are widely used.
 *  https://stackoverflow.com/questions/66548262/is-off-heap-memory-is-a-java-jvm-standard
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
