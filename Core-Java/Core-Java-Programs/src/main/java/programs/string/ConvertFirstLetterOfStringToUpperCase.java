package programs.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertFirstLetterOfStringToUpperCase
{
  public static void main(String[] args)
  {
    String s1 = "Learn code with vikas";
    System.out.println(changeToUpperCase(s1));
  }

  public static String changeToUpperCase(String s1)
  {
    /*StringBuilder builder = new StringBuilder();
    char ch = ' ';
    for (int i = 0; i < s1.length(); i++)
    {
      if (ch == ' ' && s1.charAt(i) != ' ')
        builder.append(Character.toUpperCase(s1.charAt(i)));
      else
        builder.append((s1.charAt(i)));
      ch = s1.charAt(i);
    }
    return builder.toString();*/
    return Arrays.stream(s1.split(" "))
      .map(String::new)
      .map(str -> str.substring(0,1).toUpperCase()+str.substring(1))
      .collect(Collectors.joining(" "));
  }
}
