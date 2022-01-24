package com.mycompany.testcollection;

import java.util.Comparator;

public class SortByHeight implements Comparator<User>{

    @Override
    public int compare(User o1, User o2) {
      float x = o1.getHeight() - o2.getHeight();
      if(x == 0)
            return 1;
      else if(x > 0)
             return 1;
      else 
          return -1;
    }
    
}
