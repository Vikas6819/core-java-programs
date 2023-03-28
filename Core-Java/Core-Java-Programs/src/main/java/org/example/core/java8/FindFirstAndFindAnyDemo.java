package org.example.core.java8;

public class FindFirstAndFindAnyDemo
{
  public static void main(String[] args)
  {
    String s1 = "abcfb";

    Character character = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .findFirst()
      .get();// return first char

    System.out.println(character);

    Character character2 = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .findAny()
      .get();// returns any char

    System.out.println(character2);
  }
}
