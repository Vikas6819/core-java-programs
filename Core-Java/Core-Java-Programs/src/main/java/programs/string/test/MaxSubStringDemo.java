package programs.string.test;

import java.util.ArrayList;
import java.util.List;

public class MaxSubStringDemo
{
  public static void main(String[] args)
  {
    String s1 = "abc";
    List<String> list = new ArrayList<>();
    String output = "";
    int count = 0;

    while (count <= s1.length()-1)
    {
      for (int i = count; i< s1.length(); i++)
      {
          output += s1.charAt(i);
          list.add(output);
      }
      count ++;
      output = "";
    }
    System.out.println(list);

  }
}
