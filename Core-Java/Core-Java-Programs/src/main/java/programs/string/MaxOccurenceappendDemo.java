package programs.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurenceappendDemo
{
  public static void main(String[] args)
  {
    String s1 = "aaabbbcc";

    String output = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream()
      .map(Object::toString)
      .collect(Collectors.joining())
      .replace("=", "");
    System.out.println(output);


    s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream()
      .sorted((entry1, entry2) -> {
        if(entry1.getValue() == entry2.getValue())
        {
          entry1.getKey().compareTo(entry2.getKey());
        }
        else
        {
         if(entry1.getValue() > entry2.getValue())
           return -1;
         else
           return 1;

         }
        return 0;
      })
      .forEach(System.out::println);
  }
}
