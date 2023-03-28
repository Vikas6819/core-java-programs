package programs.arrays;

import java.util.Arrays;

public class MoveZerosToEnd
{
  public static void main(String[] args)
  {
    int[] array = {10,0,0,20,40,50,60}; // int[] array = {10,20,40,50,60,0,0};

    int count = 0;

    int[] output = new int[array.length];

    for(int i=0; i<array.length; i++)
    {
      if(array[i] != 0)
      {
        output[count] = array[i];
        count++;
      }
    }
    System.out.println(Arrays.toString(output));
  }
}
