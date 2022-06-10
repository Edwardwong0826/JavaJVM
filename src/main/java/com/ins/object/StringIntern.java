package com.ins.object;

/**
 * how to make sure variable s point to string constant pool data?
 * method 1: String s = "xxx"; - use literally declaration
 * method 2: use intern();
 *           String s = new String("xxx").intern();
 *           String s = new StringBuilder("xxx").toString().intern();
 *
 */
public class StringIntern {
    public static void main(String[] args) {
        String s= new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2); // jdk7/8: false
        // why is false? s.intern() return constant pool address didn't assign to s

        String s3= new String("1") +  new String("1"); // s3 now points to heap object, and string constant pool dont have "11"
        s3.intern(); // in the string constant pool generate "11" because last line didn't generate into the pool
        String s4 = "11"; // s4 point s3 string constant pool "11" address
                          // in jdk7/8 when intern(), string constant pool create pointer point to s3 heap  address instead of create one "11" object
                          // s4 point to sting constant pool
                          // that's why s3 and s4 is == true, because they both refer to same address
        System.out.println(s3 == s4); ; // jdk7/8: true
    }
}
