package programs.arrays;

import java.util.Arrays;

public class PrintEvenNoStrings
{
  public static void main(String[] args)
  {
    String s1 = "Hell world abc pqrs";

    Arrays.stream(s1.split(" "))
      .map(String::new)
      .filter(str -> str.length() %2 == 0)
      .forEach(System.out::println);

    Arrays.stream(s1.split(" "))
      .map(String::new)
      .map(str -> str.substring(0,1).toUpperCase())
      .forEach(System.out::println);
  }
}
