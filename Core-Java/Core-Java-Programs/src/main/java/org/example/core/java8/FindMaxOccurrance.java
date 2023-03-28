package org.example.core.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaxOccurrance
{
  public static void main(String[] args)
  {
      String s1 = "abcvdfgyrfdscffcv";

/*
      //without java 8
      char[] chars = s1.toCharArray();
      Map<Character, Integer> map = new HashMap<>();
      for (char ch : chars)
      {
        if(map.containsKey(ch))
        {
          map.put(ch, map.get(ch)+1);
        }
        else {
          map.put(ch, 1);
        }
      }
      System.out.println("Map : "+ map);

    Set<Map.Entry<Character, Integer>> entries = map.entrySet();
    int maxCount = 0;
    char ch = 0;
    for (Map.Entry<Character,Integer> entry : entries)
    {
        if(entry.getValue() >= maxCount)
        {
          ch = entry.getKey();
          maxCount = entry.getValue();
        }
    }
    System.out.print(ch+"=======>>>>"+ maxCount);*/

    // Using Java 8

    Map<Character, Long> collect = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.print("=======>>>>"+ collect);

    Map.Entry<Character, Long> characterLongEntry = collect.entrySet()
      .stream()
      .max(Map.Entry.comparingByValue())
      .get();

    System.out.println(characterLongEntry.getKey() + "" + characterLongEntry.getValue());
  }
}