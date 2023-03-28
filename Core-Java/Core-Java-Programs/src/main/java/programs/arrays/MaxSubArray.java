package programs.arrays;

public class MaxSubArray
{
  public static void main(String[] args)
  {
    int[] array = {6, -3, -10, 0, 2};
    System.out.println(maxProduct(array));
  }

  private static int maxProduct(int[] array)
  {
    int max = array[0];
    int min = array[0];
    int result = max;

    for (int i = 1; i < array.length; i++)
    {
      int current = array[i];
      if (current == 0)
        current = 1;
      max = Math.max(max * current, max);// 6,
      min = Math.min(min * current, min);// -18, 180
      System.out.println(max + "  " + min);
      result = Math.max(max, min);//6
    }

    return result;
  }
}
