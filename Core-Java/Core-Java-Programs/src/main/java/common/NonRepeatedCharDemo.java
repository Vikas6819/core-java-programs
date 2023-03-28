package common;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharDemo
{
  public static void main(String[] args)
  {
    String s1 = "abca";

    Map.Entry<Character, Long> characterLongEntry = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
      .entrySet().stream()
      .filter(entry -> entry.getValue() == 1L)
      .findFirst().get();

    System.out.println("Key::"+ characterLongEntry.getKey()+ "  Value::"+ characterLongEntry.getValue());


  }
}
