package org.example.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo
{
  public static void main(String[] args)
  {
    List<List<String>> list = List.of(List.of("abc", "cbg", "vdc", "ghet"), List.of("pqr", "xyd", "kij", "kjy"));

    System.out.println("Before ==> "+ Arrays.toString(list.toArray()));

    List<String> collect = list.stream()
      .flatMap(strs -> strs.stream())
      .collect(Collectors.toList());

    System.out.println("After"+ collect);
  }
}
