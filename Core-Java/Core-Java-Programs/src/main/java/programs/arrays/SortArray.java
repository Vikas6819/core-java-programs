package programs.arrays;

import java.util.Arrays;

public class SortArray
{
  public static void main(String[] args)
  {
    String[] array = {"Banana","Grapes","Apple"};


    Arrays.stream(array)
      .map(String::toString)
      .sorted()
      .forEach(System.out::println);
  }
}
