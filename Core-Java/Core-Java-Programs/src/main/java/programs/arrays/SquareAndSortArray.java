package programs.arrays;

import java.util.Arrays;

public class SquareAndSortArray
{
  public static void main(String[] args)
  {
    int[] array = {-6,-1,2,4,5,7};

    Arrays.stream(array)
      .boxed()
      .map(no -> no * no)
      .sorted()
      .forEach(System.out::println);


  }
}
