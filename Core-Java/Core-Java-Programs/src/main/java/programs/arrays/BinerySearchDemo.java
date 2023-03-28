package programs.arrays;

import java.util.Arrays;

public class BinerySearchDemo
{
  public static void main(String[] args)
  {
    int[] array = {10, 20, 30, 50, 100};
    int search = 30;
    Arrays.sort(array);
    int high = array.length-1;
    int low = 0;
    System.out.println(searchIndex(array, low, high, search));
  }

  public static int searchIndex(int[] array, int low, int high, int search)
  {
      if(high >= low)
      {
        int mid = low + ((high-low)/2);

        if(array[mid] == search)
          return mid;
        else if (search > array[mid])
        {
          return searchIndex(array, low+1, high, search);
        }
        else if (search < array[mid])
        {
          return searchIndex(array, low, high-1, search);
        }
      }
    return -1;
  }
}
