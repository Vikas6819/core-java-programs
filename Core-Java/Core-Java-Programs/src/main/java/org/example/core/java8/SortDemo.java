package org.example.core.java8;

import java.util.List;

public class SortDemo
{
  public static void main(String[] args)
  {
    List<Integer> list = List.of(3,2,7,8,4,4,1);

/*
    list.stream()
      .sorted()
      .forEach(System.out::println);*/

    list.stream()
      .distinct()
      .sorted().forEach(System.out::println);
  }
}
