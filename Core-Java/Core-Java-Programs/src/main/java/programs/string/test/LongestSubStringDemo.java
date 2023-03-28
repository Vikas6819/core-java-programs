package programs.string.test;

import java.util.HashSet;

public class LongestSubStringDemo
{
  public static void main(String[] args)
  {
    String s1 = "abcdab"; //BDEFGA
    System.out.println(logic(s1));
  }

  private static String logic(String str)
  {
    HashSet<Character> set = new HashSet<>();
    String s1 = "";
    String s2 = "";

    for (int i=0; i<str.length(); i++)
    {
      char ch = str.charAt(i);

      if(set.contains(ch))
      {
        s1 = "";
        set.clear();
      }
      s1 += ch;
      set.add(ch);

      if(s1.length() > s2.length())
      {
        s2 = s1;
      }

    }
    return s2;
  }
}
