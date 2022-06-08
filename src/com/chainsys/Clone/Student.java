package com.chainsys.bestPractices.Clone;

public class Student implements Cloneable {
    public String name;
    public int age;
    //@override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}