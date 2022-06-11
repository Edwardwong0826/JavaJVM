package com.ins.reference;

public class WeakReference {

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

    // ThreadLocal use weak reference
    // WeakHashmap use weak reference also
    // Weak reference suitable to use in cache
    // difference soft reference is, when GC, no matter is it enough heap space, it will remove reachable weak reference
    // seems ygc will not collect weak reference, need to look
    public static void main(String[] args) {


        // sf point to user object, sf is a weak reference
        java.lang.ref.WeakReference<User> sf = new java.lang.ref.WeakReference<>(new User(1,"lee"));


        // from weak reference get string reference instance
        System.out.println(sf.get());

        System.gc();
        // no matter heap space is it enough, it will remove weak reference
        System.out.println("After GC");

        System.out.println(sf.get());

    }
}
