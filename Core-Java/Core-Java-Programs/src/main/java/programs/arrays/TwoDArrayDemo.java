package programs.arrays;

import java.util.stream.Stream;

public class TwoDArrayDemo
{
  public static void main(String[] args)
  {
    int[][] arr = { { 1, 2 }, { 3, 4 } };

    Stream.of(arr)
      .forEach(System.out::println);
  }
}
