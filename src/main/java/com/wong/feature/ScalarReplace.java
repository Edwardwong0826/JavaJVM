package com.wong.feature;

/**
 *  Java object is aggregate, primitive data is scalar, means those can decompose call aggregate
 *  those cannot call scalar, during JIT escape analysis, will decompose those aggregate to scalar to replace
 *  thus called scalar replace
 *  -XX:+EliminateAllocations - to open scalar replace, default is open
 *  hotspot VM only got scalar replace. dont have stack allocation
 */
public class ScalarReplace {
    public static class User{
        public int id;
        public String name;
    }

    public static void alloc(){
        User u = new User();
        u.id= 5;
        u.name = "test";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for(int i=0; i < 10000000; i++){
            alloc();
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms");
    }

}
