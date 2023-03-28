package programs.string.test;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesRemoval
{
  public static void main(String[] args)
  {
    String s1 = "abcad";
    System.out.println(s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream()
      .filter(entry -> entry.getValue() == 1L)
      .map(entry -> entry.getKey())
      .map(Objects::toString)
      .collect(Collectors.joining()));

    //first non-repeating char
    System.out.println(s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
      .entrySet().stream()
      .filter(entry -> entry.getValue() == 1L)
      .map(entry -> entry.getKey())
      .findFirst());
  }
}
