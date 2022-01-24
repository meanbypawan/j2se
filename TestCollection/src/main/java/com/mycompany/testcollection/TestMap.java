package com.mycompany.testcollection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        LinkedHashMap<String,ArrayList<String>> lhm = new LinkedHashMap<>();
        
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Indore");
        al1.add("Ratlam");
        al1.add("Jabalpur");
        
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Mumbai");
        al2.add("Pune");
        al2.add("Akola");
        
        ArrayList<String> al3 = new ArrayList<>();
        al3.add("Agra");
        al3.add("Luncknow");
        al3.add("Gaziyabad");
    
        lhm.put("MP", al1);
        lhm.put("MH", al2);
        lhm.put("UP", al3);
        
        for(Map.Entry<String,ArrayList<String>>e :lhm.entrySet()){
            System.out.println(e.getKey()+"\n------------------------");
            ArrayList<String> cityList = e.getValue();
            for(String city : cityList)
                System.out.println(city);
        }
        
        
    }
    
}
