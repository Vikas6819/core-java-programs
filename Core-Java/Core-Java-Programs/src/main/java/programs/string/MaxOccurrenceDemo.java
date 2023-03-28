package programs.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurrenceDemo
{
  public static void main(String[] args)
  {
    String s1 = "java";

    Map.Entry<Character, Long> characterLongEntry = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream()
      .max(Map.Entry.comparingByValue())
      .get();

    System.out.println(characterLongEntry.getKey()+"  "+characterLongEntry.getValue());
  }
}
