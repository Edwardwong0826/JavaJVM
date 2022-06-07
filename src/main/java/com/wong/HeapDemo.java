package com.wong;

public class HeapDemo {

    // first load to memory, generate a class object accordingly
    // static variable value init related to the order
    // static variable stored in metaspace, in linking phase prepare default value
    // and in init phase <clinit>() method merged all static value and assign the value given
    static{
        System.out.println("class a static initializer init");
        m = 300;
    }

    static int m = 300;

    private int num = 1;


    public static void main(String[] args) {

        double price = 130.5; // double and long use two slot in stack local variable table, other type and reference type use 1 slot

        System.out.println("start...");
        try{
            Thread.sleep(100000000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("end...");



    }
}
