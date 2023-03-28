package programs.string.test;

import java.util.HashSet;
import java.util.Set;

public class CommonCharsDemo

{
  public static void main(String[] args)
  {
    String s1 = "AC";
    String s2 = "ABCDEF";
    System.out.println(commonCharacters(s1, s2));
  }

  private static String commonCharacters(String s1, String s2)
  {
    Set<Character> set  = new HashSet<>();
    StringBuilder builder = new StringBuilder();
    for(Character ch :  s2.toCharArray())
    {
        set.add(ch);
    }
    for(int i=0; i<s1.length(); i++)
    {
      if(set.contains(s1.charAt(i)))
        builder.append(s1.charAt(i)).append(" ");
    }
    return builder.toString();
  }
}
