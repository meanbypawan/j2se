package com.mycompany.testcollection;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(100);
        ts.add(50);
        ts.add(10);
        ts.add(5);
        ts.add(30);
        ts.add(20);
        for(Integer element : ts)
            System.out.println(element);
    }
    
}
