package com.mycompany.testcollection;

import java.util.TreeSet;

public class TestTreeSetTwo {
    public static void main(String[] args) {
        TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>();
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("D"));
        ts.add(new StringBuffer("F"));
        ts.add(new StringBuffer("G"));
        ts.add(new StringBuffer("C"));
        ts.add(new StringBuffer("B"));
        for(StringBuffer element : ts)
            System.out.println(element);
    }
    
}
