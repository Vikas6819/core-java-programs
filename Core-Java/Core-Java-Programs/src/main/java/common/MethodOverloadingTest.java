package common;

class Test
{
  void method1(int a)
  {
    System.out.println("method1 -A");
  }
  static void method1(int a, int b)
  {
    System.out.println("method1 -B");

  }
  void method1(double d)
  {
    System.out.println("method1 -C");

  }
  static  void method1(double d, String s)
  {
    System.out.println("method1 -D");

  }
}



public class MethodOverloadingTest
{
  public static void main(String[] args)
  {
    Test t1 = new Test();
    t1.method1(2.0); //method-C
    t1.method1(2); //method -A
  }
}
