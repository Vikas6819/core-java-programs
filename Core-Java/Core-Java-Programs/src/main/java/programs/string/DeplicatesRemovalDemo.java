package programs.string;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DeplicatesRemovalDemo
{
  public static void main(String[] args)
  {
    String s1 = "abcad";

    String collect = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .distinct()
      .map(Objects::toString)
      .collect(Collectors.joining());
    System.out.println(collect);

    String collect1 = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream()
      .map(Objects::toString)
      .collect(Collectors.joining())
      .replace("=", "");
    System.out.println(collect1);
  }
}
