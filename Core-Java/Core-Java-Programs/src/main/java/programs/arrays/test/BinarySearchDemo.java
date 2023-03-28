package programs.arrays.test;

public class BinarySearchDemo
{
  public static void main(String[] args)
  {
    int[] array = {10, 20, 30, 50, 100};
    int search = 30;
    System.out.println(searchIndex(array, 0, array.length-1, search));
  }

  private static int searchIndex(int[] array, int low, int high, int search)
  {
    int mid = low + (high - low)/2;

    while (high >= low)
    {
      if(array[mid] == search)
        return mid;
      else if (array[mid] < search)
      {
        return searchIndex(array, low+1, high, search);
      }
      else if (array[mid] > search)
      {
        return  searchIndex(array, low, high-1, search);
      }
      else
        return -1;
    }
    return -1;

  }
}
