package org.example.core.java8;

import java.util.HashMap;
import java.util.Map;

public class TestStringBuilder
{
  public static void main(String[] args)
  {
    Map<StringBuilder, Integer> map = new HashMap<>();

    StringBuilder s1 = new StringBuilder("Vikas");
    System.out.println("Before: "+ s1.hashCode());
    map.put(s1, 1);


    s1.append("Dhongade");
    System.out.println("After: "+ s1.hashCode());
    System.out.println(s1);

    System.out.println(map.get(s1));
  }
}
