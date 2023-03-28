package programs.string.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstLetterToUpperCase
{
  public static void main(String[] args)
  {
    String s1 = "Learn code with vikas";
    System.out.println(changeToUpperCase(s1));
  }

  private static String changeToUpperCase(String s1)
  {
    return Arrays.stream(s1.split(" "))
      .map(str -> str.substring(0,1).toUpperCase()+str.substring(1))
      .collect(Collectors.joining(" "));

  }
}
