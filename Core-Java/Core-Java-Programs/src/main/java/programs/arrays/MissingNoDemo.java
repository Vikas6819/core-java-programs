package programs.arrays;

import java.util.Arrays;

public class MissingNoDemo
{
  public static void main(String[] args)
  {
    int[] array = {1, 2, 4, 5, 7, 8, 10};
    Arrays.sort(array);

    for (int i = 0; i < array.length; i++)
    {
      int no = array[i]+1;
      boolean flag = false;
      for (int j = i+1; j < array.length; j++)
      {
            if(no == array[j]){
              flag = true;
              break;
            }
      }
      if (!flag && i < array.length-1)
        System.out.println(no);
    }
  }
}
