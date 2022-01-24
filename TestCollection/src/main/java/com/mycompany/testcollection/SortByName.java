package com.mycompany.testcollection;

import java.util.Comparator;

public class SortByName implements Comparator<User>{

    @Override
    public int compare(User o1, User o2) {
      String o1KaName = o1.getName();
      String o2KaName = o2.getName();
      int x = o1KaName.compareTo(o2KaName);
      if(x==0)
          return 1; 
      return x;
    }
    
}
