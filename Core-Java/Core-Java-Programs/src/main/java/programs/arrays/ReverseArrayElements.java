package programs.arrays;

import java.util.Arrays;

public class ReverseArrayElements
{
  public static void main(String[] args)
  {
    int[] array = {1,4,5};
    int[] newArray = new int[array.length];
    int count = 0;

    for(int i=array.length-1; i>=0; i--)
    {
      newArray[count] = array[i];
      count++;
    }

    System.out.println(Arrays.toString(newArray));



  }
}
