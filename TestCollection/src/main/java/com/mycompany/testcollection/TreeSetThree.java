package com.mycompany.testcollection;

import java.util.TreeSet;

public class TreeSetThree {
    public static void main(String[] args) {
        TreeSet<User> ts = new TreeSet<User>();
        //TreeSet<User> ts = new TreeSet<User>(new SortByName());
        //TreeSet<User> ts = new TreeSet<User>(new SortByAge());
        //TreeSet<User> ts = new TreeSet<User>(new SortByHeight());
        ts.add(new User(1, "A", 21, 5.4f));
        ts.add(new User(2, "B", 24, 5.7f));
        ts.add(new User(5, "D", 22, 5.9f));
        ts.add(new User(6, "G", 26, 5.1f));
        ts.add(new User(3, "F", 27, 5.2f));
        ts.add(new User(4, "C", 23, 5.3f));
        ts.add(new User(7, "H", 23, 5.3f));
        ts.add(null);
        for(User u : ts)
            System.out.println(u);
    }
    
}
