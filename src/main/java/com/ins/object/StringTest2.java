package com.ins.object;

/**
 * question 1
 * new String("ab") will create how many object? look bytecode
 *  one object is : new keyword create in heap
 *  second object is: in string constant pool - ldc loadconstant
 *
 * question 2
 * new String("a") + new String("b")? look bytecode
 *  object 1: new StringBuilder()
 *  object 2: new String("a")
 *  object 3: constant pool "a"
 *  object 4: new String("b")
 *  object 5: constant pool "b"
 *  object 6: StringBuilder.toString()
 *            new String("ab") - in string constant pool, dont have "ab"
 */
public class StringTest2 {
    public static void main(String[] args) {
        //String str = new String("ab");

        String str = new String("a") + new String("b");

    }
}
