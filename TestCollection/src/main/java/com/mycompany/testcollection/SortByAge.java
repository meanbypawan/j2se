package com.mycompany.testcollection;

import java.util.Comparator;

public class SortByAge implements Comparator<User>{

    @Override
    public int compare(User o1, User o2) {
      int x =  o1.getAge() - o2.getAge();
      if(x == 0)
          return 1;
      else if(x < 0)
            return 1;
      return -1;
    }
    
}
