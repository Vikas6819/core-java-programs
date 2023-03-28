package programs.arrays;

public class ArraySumDemo
{
  public static void main(String[] args)
  {
    int[] array = {10,50,30,40,20};
    int sum = 50;


    for(int i =0; i<array.length; i++)
    {

      int no = sum - array[i];
      for(int j=i+1; j<array.length; j++)
      {
        if(no == array[j])
        {
          System.out.println(array[i]+" "+array[j]);
        }
      }
    }

  }
}
