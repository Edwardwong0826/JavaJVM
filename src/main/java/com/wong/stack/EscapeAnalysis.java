package com.wong.stack;

/**
 *  check escape analysis by new object instance is it possible use by outside scope or method
 *  if there is no escape, JVM compiler will consider stackAllocation which put the instance in stack
 *  instead of heap
 */
public class EscapeAnalysis {
    public EscapeAnalysis obj;

    //method return EA, escape
    public EscapeAnalysis getInstance(){
        return obj == null ? new EscapeAnalysis() : obj;
    }

    // set field for class field, escape
    public void setObj(){
        this.obj = new EscapeAnalysis();
    }

    // object scope only in current method, no escape
    public void useEscapeAnalysis(){
        EscapeAnalysis e = new EscapeAnalysis();
    }

    // use field return variable, escape
    public void useEscapeAnalysis1(){
        EscapeAnalysis e = getInstance();
    }

}
