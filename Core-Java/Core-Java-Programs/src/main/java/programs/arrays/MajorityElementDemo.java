package programs.arrays;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElementDemo
{
  public static void main(String[] args)
  {
    //majority: element which has occurrence greater than the array size
    int[] array = {1,2,3,4,5,3,3,3,3};

    Arrays.stream(array)
      .boxed()
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream()
      .filter(entry -> entry.getValue() > (array.length)/2)
      .map(entry -> entry.getKey())
      .forEach(System.out::println);

  }
}
