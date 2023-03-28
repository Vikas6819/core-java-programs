package programs.arrays;

import java.util.Arrays;

public class LeftRotationByOnePositionDemo
{
  public static void main(String[] args)
  {
    int[] array = {10,20,30,40,50}; // {20,30,40,50,10}
    int[] output = new int[array.length];


    int count = 0;
    int second = 1;
    while(count < array.length-1)
    {
      output[count] = array[second];// 20,30,40,50
      second++;
      count++;
      if(count == array.length-1)
      {
        output[count] = array[0];
      }
    }

    System.out.println(Arrays.toString(output));

  }
}
