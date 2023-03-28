package programs.string;

import java.util.Arrays;

public class LongestCommonPrefixDemo
{
  public static void main(String[] args)
  {
    String[] array = {"geeksforgeeks", "geeks", "geek", "geezer"};


    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    int min = Math.min(array[0].length(), array[array.length-1].length());
    System.out.println("Min Length:: "+min);
    int i = 0;
    while (i < min && array[0].charAt(i) == array[array.length-1].charAt(i))
      i++;

    String prefix = array[0].substring(0,i);
    System.out.println(prefix);
  }
}
