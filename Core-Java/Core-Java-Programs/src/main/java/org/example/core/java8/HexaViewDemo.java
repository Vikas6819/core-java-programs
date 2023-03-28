package org.example.core.java8;

import java.util.Arrays;

public class HexaViewDemo
{
  public static void main(String[] args)
  {
    String test = "abcdefghijklmnopqrstuvwxyz";
    checkIfStringConatinsAllAlphabets(test);

    String s1 = "race";
    String s2 = "care";

    checkIfTwoStringsAreEquals(s1, s2);

  }

  private static void checkIfTwoStringsAreEquals(String s1, String s2)
  {
    char [] s1Chars = s1.toCharArray();
    char [] s2Chars = s2.toCharArray();

    Arrays.sort(s1Chars);
    Arrays.sort(s2Chars);

    if(Arrays.compare(s1Chars, s2Chars) == 0)
    System.out.println("Valid chars");
    else
      System.out.println("Invalid Chars");
  }

  private static void checkIfStringConatinsAllAlphabets(String test)
  {
    long count = test.chars()
      .filter(cha -> cha >= 'a' && cha <= 'z')
      .distinct()
      .count();

    if(count == 26)
    {
      System.out.println("Valid");
    }
    else
    {
      System.out.println("Invalid");
    }
  }
}
