package programs.arrays;

import java.util.Arrays;

public class InsertAnElementAtSpecificPosition
{
  public static void main(String[] args)
  {
    int[] array = new int[5];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4; //0 :4

    int position = 2;
    int num = 5;

    for(int i = array.length-1; i> position; i--)
    {
      array[i] = array[i-1]; //4: 4, 3:3
    }
    array[position] = num;

    System.out.println(Arrays.toString(array));
  }
}
