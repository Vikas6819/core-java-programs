package programs.string;

import java.util.ArrayList;
import java.util.List;

public class SubStringDemo
{
  public static void main(String[] args)
  {
    String s1 = "abc";

    List<String> list = new ArrayList<>();

    String sub = "";
    int count = 0;
    System.out.println(s1.length());
    while (count < s1.length())
    {
      for (int i = count; i < s1.length(); i++)
      {
        sub += s1.charAt(i);
        list.add(sub);
      }
      count++;
      sub = "";
    }
    System.out.println(list);


  }
}
