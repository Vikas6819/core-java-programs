package programs.string;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharDemo
{
  public static void main(String[] args)
  {
    String s1 = "java";


    Character character = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
      .entrySet().stream()
      .filter(entry -> entry.getValue() == 1L)
      .map(entry -> entry.getKey())
      .findFirst()
      .get();

    System.out.println(character);
  }
}
