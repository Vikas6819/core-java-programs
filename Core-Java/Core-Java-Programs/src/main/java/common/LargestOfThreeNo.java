package common;

public class LargestOfThreeNo
{
  public static void main(String[] args)
  {
    int a = 10;
    int b = 70;
    int c = 80;

    if(a > b && a > c)
      System.out.println(a);
    else if (b > a && b > c)
    {
      System.out.println(b);
    }
    else
      System.out.println(c);
  }
}
