package org.example.core.java8;

import java.util.Optional;

public class OptionalDemo
{
  public static void main(String[] args)
  {
    String str = null;

    Optional<String> optional = Optional.ofNullable(str);

    if (optional.isPresent())
          System.out.println("Present");
    else
      System.out.println("Not Present");
  }
}
