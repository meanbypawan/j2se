package com.mycompany.testcollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestHashMap {
    public static void main(String[] args) {
        //LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1, "A");
        tm.put(10, "B");
        tm.put(5, "C");
        tm.put(25, "D");
        tm.put(20, "E");
        
        tm.put(30, "F");
        tm.put(30, "G");
        
       for(Map.Entry<Integer,String> e : tm.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
        /* 
        Set<Map.Entry<Integer,String>> s = hm.entrySet();
        for(Map.Entry<Integer,String> entry : s)
            System.out.println(entry.getKey()+" "+entry.getValue());
      */
       
    }
    
}
