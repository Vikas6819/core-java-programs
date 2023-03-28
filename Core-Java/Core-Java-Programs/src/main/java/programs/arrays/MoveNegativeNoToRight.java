package programs.arrays;

import java.util.Arrays;

public class MoveNegativeNoToRight
{
  public static void main(String[] args)
  {
    int[] array = {-1,-20,30,40,-8,13}; //{-1,-20,-8,30,40,13}

    int[] output = new int[array.length];

    int count = 0;
    for(int i=0; i<array.length; i++)
    {
      if(array[i] < 0)
      {
        output[count] = array[i];
        count++;
      }
    }
    for(int i=0; i<array.length; i++)
    {
      if(array[i] > 0)
      {
        output[count] = array[i];
        count++;
      }
    }
    System.out.println(Arrays.toString(output));
  }
}
