package com.ins.gc;

/**
 * -XX:+UseSerialGC -to use serial GC in young and old generation
 * -xx:+UseParNewGC -to yse parallel new GC in yong generation
 * -xx:+UseConcMarkSweepGC -to use CMS GC in old generation
 *  -xx:CMSInitiatingOccupancyFraction - set heap memory threshold to trigger GC
 *  -xx:+UseCMSCompactAtFullCollection -set after full gc compact the heap space, but longer stop the world time
 *  -xx:CMSFullGCsBeforeCompaction - set after how many times full gc compact the heap space
 *  -xx:ParallelCMSThreads - set cms thread
 *
 * -xx:+UseParallelGC -use parallel scavenge in young generation
 * -xx:+UseParallelOldGC -use parallel old in old generation
 *  -xx:ParallelGCThreads -set young generation parallel thread , default is with CPU core amount
 *  -xx:MaxGCPauseMillis -set parallel GC max stop the world time, use with cautions
 *  -xx:GCTimeRatio -set parallel GC collecting time ratio, default was 99, range 0-100, throughput set by this parameter
 *  -xx:+UseAdaptiveSizePolicy -set parallel scavenge have self adaptive size
 *
 *  -XX:+UseG1GC
 *  -XX:G1HeapRegionSize - set region size, by 2 square, range 1-32Mb, aim to split heap smallest 2048 region, can more than 2048, default was heap memory 1/2000
 *  -XX:MaxGCPauseMillis - set aim max GC stop the world time goal. default 200ms
 *  -XX:ParallelGCThreads - set stop the world thread, max 8
 *  -XX:ConcGCThreads - set concurrent mark thread, set n to parallel GC thread 1/4
 *  -XX:InitiatingHeapOccupancyPercent - set trigger concurrent GC cycle java heap threshold, more than this value then GC, default GC
 *
 */
public class GCUse {

    // all GC will have stop the world event
    // some GC only one thread concurrent, some GC were parallel
    // throughput first GC for server side need high efficiency usage of CPU, to complete computation, suitable in backend
    // pause time first GC for client side high user interactive scenario, aim to reduce lag time by optimise stop the world event

    // JDK 8 default were Parallel Scavenge and Parallel Old
    // JDK 9 onwards was G1

    // in young generation - Serial, ParNew, Parallel Scavenge
    //  Serial and ParNew use copying algorithm
    // in old generation - CMS, Serial Old, Parallel Old
    //  Serial use mark-sweep algorithms
    //  Parallel Old use mark-compact algorithm

    // CMS was hotspot first concurrent GC, and was pause time first GC for strong user interactive

    // self adaptive size features were Parallel Scavenge and ParNew important difference
    // Parallel Scavenge and Parallel Old GC are throughput first strategy

    // G1 was low latency GC, and use region concepts to split eden, survivor and old, region use copying algorithm
    // but overall kind of like mark compact algorithm
    public static void main(String[] args) {
        try{
            Thread.sleep(1000000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
