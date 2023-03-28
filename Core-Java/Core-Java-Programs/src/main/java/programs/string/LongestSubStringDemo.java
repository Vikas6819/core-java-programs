package programs.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringDemo
{
  public static void main(String[] args)
  {
    String s1 = "abcdab"; //BDEFGA

    logic1(s1);
    logic2(s1);
  }


  private static void logic1(String s1)
  {
    Set<Character> set = new HashSet<>();
    int maxLength = 0;
    int left = 0;
    for (int right = 0; right < s1.length(); right++)
    {

      if (!set.contains(s1.charAt(right)))
      {
        set.add(s1.charAt(right));// p,w] w,k,e
        maxLength = Math.max(maxLength, right - left + 1);//3

      }
      else
      {
        while (s1.charAt(left) != s1.charAt(right)) //right=2, left=0,
        {
          set.remove(s1.charAt(left)); //  w
          left++; // 1
        }
        set.remove(s1.charAt(left)); // w
        left++;// 2
        set.add(s1.charAt(right));// w
      }
    }
    System.out.println(maxLength);
    System.out.println(set);
  }

  private static void logic2(String s1)
  {
    Set<Character> set = new HashSet<>();
    String longestTillNow = "";
    String longestOverall = "";

    for(int i = 0; i<s1.length(); i++)
    {
      if(set.contains(s1.charAt(i)))
      {
        longestTillNow = "";
        set.clear();
      }
      set.add(s1.charAt(i));
      longestTillNow += s1.charAt(i);

      if(longestTillNow.length() > longestOverall.length())
      {
        longestOverall = longestTillNow;
      }

    }

    System.out.println(longestOverall);
  }
}
