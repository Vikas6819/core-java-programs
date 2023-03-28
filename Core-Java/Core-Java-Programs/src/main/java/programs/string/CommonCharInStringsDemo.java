package programs.string;

import java.util.HashSet;

public class CommonCharInStringsDemo
{
  public static void main(String[] args)
  {
    String s1 = "A";
    String s2 = "ABCDEF";
    System.out.println(commonCharacters(s1, s2));
  }
  private static String commonCharacters(String s1, String s2)
  {
    StringBuilder commonChars = new StringBuilder();
    if(s1.length() > 0 && s2.length() > 0)
    {
      String toBeIterated = s1.length() < s2.length() ? s1 : s2;
      String toBEChecked = toBeIterated.equals(s1) ? s2 : s1;
      for(int i = 0; i < toBeIterated.length() ; i++)
      {
        if(toBEChecked.contains(Character.toString(toBeIterated.charAt(i))))
        {
          commonChars.append(toBeIterated.charAt(i));
        }
      }
      return commonChars.toString();
    }
    else
      return "";
  }
  private static String logic2(String s1, String s2)
  {
    HashSet<Character> set = new HashSet<>();
    String toToCheckedAgainst = s1.length() > s2.length() ? s1 : s2;

    for (Character ch : toToCheckedAgainst.toCharArray())
    {
      set.add(ch);
    }
    return null;

  }
}
