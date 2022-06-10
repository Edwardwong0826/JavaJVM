package com.ins.object;

public class StringTest1 {

    public void test(){

        // during compilation,JVM will optimise to abc directly if literally declaration not variable
        // can decompile the .class file to see
        String s1 = "a" + "b" + "c";
        String s2 = "abc";

        // == compare address
        // equals compare value
        System.out.println(s1 == s1); // true
        System.out.println(s1.equals(s2)); // true

    }

    public void test2(){

        // when string concentration
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE"+"hadoop";
        // either one os variable, will new string() in heap, string concentration use StringBuilder
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s4); // true
        System.out.println(s3 == s5); // false
        System.out.println(s3 == s6); // false
        System.out.println(s3 == s7); // false
        System.out.println(s5 == s6); // false
        System.out.println(s5 == s7); // false
        System.out.println(s3 == s7); // false

        //intern(): determine in string pool is it exist the value, if got directly return that address
        // if string pool not exist the value, and create one into string pool to return the address
        String s8 = s6.intern();
        System.out.println(s3 == s8); // true

    }

    public void test3(){
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";

        // s1 + s2 details by bytecode
        // StringBuilder s = new StringBuilder()
        // s.append("a");
        // s.append("b");
        // s.toString() -> 约等于new String("ab");
        String s4 = s1 + s2;
        System.out.println(s3 == s4); // false
    }

    public void test4(){

        // string concentration not always use StringBulder
        // if concentration both constant string variable, compiler will optimise instead StringBuilder
        // so advice use final when possible for class, method, primitive and reference variable
        final String s1 = "a";
        final String s2 = "b";
        String s3 = "ab";

        String s4 = s1 + s2;
        System.out.println(s3 == s4); // true
    }

    public void test5(){

        // string concentration not always use StringBulder
        // if concentration both constant string variable, compiler will optimise instead StringBuilder
        // so advice use final when possible for class, method, primitive and reference variable
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3); // false

        final String s4 = "javaEE";
        String s5 = s4 + "hadoop";
        System.out.println(s1 == s5); // true
    }

    public static void main(String[] args) {
        StringTest1 obj = new StringTest1();
        obj.test5();
    }
}
