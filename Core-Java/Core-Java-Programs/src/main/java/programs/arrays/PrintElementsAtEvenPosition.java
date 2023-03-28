package programs.arrays;

public class PrintElementsAtEvenPosition
{
  public static void main(String[] args)
  {
    int[] array = {1,4,5,6,7,9,3,4,6};

    for(int i=0; i< array.length; i++)
    {
      if(i %2 == 0)
        System.out.println(array[i]);
    }
  }
}
