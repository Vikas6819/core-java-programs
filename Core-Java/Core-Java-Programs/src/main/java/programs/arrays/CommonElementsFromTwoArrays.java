package programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommonElementsFromTwoArrays
{
  public static void main(String[] args)
  {
    int[] array1 = {1, 2, 3, 4};
    int[] array2 = {5, 4, 7, 3};
    /*HashSet<Integer> set = new HashSet<>();
    for (Integer no : array1)
    {
      set.add(no);
    }

    for(Integer no : array2)
    {
      if(set.contains(no))
      {
        System.out.println(no);
      }
    }*/

    List<Integer> list1 = Arrays.stream(array1)
      .boxed()
      .collect(Collectors.toList());
    List<Integer> list2 = Arrays.stream(array2)
      .boxed()
      .collect(Collectors.toList());

    List<List<Integer>> list3 = new ArrayList<>();
    list3.add(list1);
    list3.add(list2);

    list3.stream()
      .flatMap(list -> list.stream())
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream()
      .filter(entry -> entry.getValue() != 1L)
      .map(integerLongEntry -> integerLongEntry.getKey())
      .forEach(System.out::println);


  }
}
