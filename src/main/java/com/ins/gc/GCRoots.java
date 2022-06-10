package com.ins.gc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GCRoots {

    public static void main(String[] args) {
        List<Object> numlist = new ArrayList<>();
        Date birth = new Date();

        for(int i =0; i < 100; i++){
            numlist.add(String.valueOf(i));
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("data added completed");
        new Scanner(System.in).next();
        numlist = null;
        birth = null;

        System.out.println("list and dob already empty");
        new Scanner(System.in).next();

        System.out.println("end");
    }

}
