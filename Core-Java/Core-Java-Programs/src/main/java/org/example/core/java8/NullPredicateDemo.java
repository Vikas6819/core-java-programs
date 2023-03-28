package org.example.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NullPredicateDemo
{
  public static void main(String[] args)
  {
    List<String> list = List.of("S1", "S2", "S3");

    List<String> l2 = list.stream()
      .filter(s1 -> s1.length() > 3)
      .collect(Collectors.toList());

    System.out.println(Arrays.toString(l2.toArray()));
  }
}
