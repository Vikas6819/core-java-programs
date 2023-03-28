package programs.string;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateCharsDemo
{
  public static void main(String[] args)
  {
    String s1 = "abcabd";

    s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream()
      .filter(entry -> entry.getValue() != 1L)
      .map(entry -> entry.getKey())
      .forEach(System.out::println);


  }
}
