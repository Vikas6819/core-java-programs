package programs.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PrintNextGreaterElementInArray
{
  public static void main(String[] args)
  {
    int[] array = {10, 11, 5, 4, 7};
    //Collections.reverse(Arrays.asList(array));
    System.out.println(Arrays.toString(array));
    nextgreaterElementInArray(array);
  }

  private static void nextgreaterElementInArray(int[] array)
  {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < array.length; i++)
    {

      for (int j = i + 1; j < array.length; j++)
      {
        if (array[i] < array[j])
        {
          map.put(array[i], array[j]);
          break;
        }
      }
      if (!map.containsKey(array[i]))
        map.put(array[i], -1);
    }
    System.out.println(map);
  }
}
