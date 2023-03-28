package programs.string.test;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceAppend
{
  public static void main(String[] args)
  {
    String s1 = "aaabbbcc";

    String replace = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream()
      .map(Objects::toString)
      .collect(Collectors.joining())
      .replace("=", "");
    System.out.println(replace);
  }
}
