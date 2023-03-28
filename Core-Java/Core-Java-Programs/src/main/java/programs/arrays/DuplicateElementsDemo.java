package programs.arrays;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsDemo
{
  public static void main(String[] args)
  {
    int[] array = {1,3,4,6,7,3,2,4};
    Arrays.stream(array)
      .boxed()
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet()
      .stream()
      .filter(entry -> entry.getValue() != 1L)
      .map(Object::toString)
      .forEach(System.out::println);
  }
}
