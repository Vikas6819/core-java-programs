package common;

import java.time.Duration;
import java.time.LocalDateTime;

public class DiffBetweenTwoDates
{
  public static void main(String[] args)
  {
    LocalDateTime date1 = LocalDateTime.now();
    disp();
    LocalDateTime date2 = LocalDateTime.now();

    Duration duration = Duration.between(date1, date2);
    System.out.println(duration);
  }

  private static void disp()
  {
    System.out.println("A");
    System.out.println("A");
    System.out.println("A");System.out.println("A");
    System.out.println("A");
    System.out.println("A");
    System.out.println("A");System.out.println("A");
    System.out.println("A");
    System.out.println("A");


  }
}
