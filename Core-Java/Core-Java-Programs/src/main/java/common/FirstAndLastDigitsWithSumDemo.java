package common;

public class FirstAndLastDigitsWithSumDemo
{
  public static void main(String[] args)
  {
    int no = 234;

    int last = no%10;
    System.out.println("Last:: "+ last);
    int first = no;
    while(first > 10 )
    {
      first = first/10;
    }
    System.out.println("First:: "+ first);
    System.out.println("Sum:: "+ (first+last));
  }
}
