package programs.arrays;

import java.util.Arrays;

public class MaxDifferenceDemo
{
  public static void main(String[] args)
  {
    //int[] array = {10,20,2,90,40};
    int array[]={44,66,99,77,33,22,55};


    Integer max = Arrays.stream(array)
      .boxed()
      .max(Integer::compareTo)
      .get();

    Integer min = Arrays.stream(array)
      .boxed()
      .min(Integer::compareTo)
      .get();

    System.out.println("Max Difference:: "+ (max-min));
    System.out.println(maxNo(array));
  }

  public static int maxNo(int[] array)
  {
    // int[] array = {10,20,2,90,40};
    int max = array[0];

    for (int i= 1; i< array.length; i++)
    {

      if(max < array[i])
      {
        max = array[i];
      }
    }
    return max;

  }
}
