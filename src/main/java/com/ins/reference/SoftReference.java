package com.ins.reference;

public class SoftReference {

    public static class User{
        public int id;
        public String name;

        public User(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {


        // sf point to user object, sf is a soft reference
        java.lang.ref.SoftReference<User> sf = new java.lang.ref.SoftReference<>(new User(1,"lee"));

        // above 1 one equals to below 3 lines
        //User user = new User(1,"lee");
        //java.lang.ref.SoftReference<User> sf = new java.lang.ref.SoftReference<>(user);
        //user = null;

        // from soft reference get string reference instance
        System.out.println(sf.get()); // heap space still enough, will not collect reachable soft reference

        System.gc();
        System.out.println("After GC");

        System.out.println(sf.get());

        try{
            byte[] b = new byte[1024*1024*7];
        }catch (Throwable e){
            e.printStackTrace();
        }finally {
            // before OOM, GC will remove the reachable soft reference
            System.out.println(sf.get());
        }
    }
}
