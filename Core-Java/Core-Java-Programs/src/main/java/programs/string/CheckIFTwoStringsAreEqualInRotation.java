package programs.string;

import java.util.Arrays;

public class CheckIFTwoStringsAreEqualInRotation
{
  public static void main(String[] args)
  {
    String s1 = "XYZ";
    String s2 = "ZXYQ";

    char[] s1Array = s1.toCharArray();
    char[] s2Array = s2.toCharArray();

    Arrays.sort(s1Array);
    Arrays.sort(s2Array);

    if (Arrays.compare(s1Array, s2Array) == 0)
      System.out.println("Valid");
    else
      System.out.println("InValid");

  }
}
