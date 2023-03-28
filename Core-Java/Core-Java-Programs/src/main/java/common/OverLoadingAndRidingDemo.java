package common;

class Parent
{

  Parent()
  {
    System.out.println("Parent's No Arg");
  }
  protected void display()
  {
    System.out.println("Parent's Display");
  }
}

class Child extends Parent
{
  Child()
  {
    System.out.println("Child's No Arg");
  }
  protected void display()
  {
    System.out.println("Child's Display");
  }

  public void print()
  {
    System.out.println("Child's print");

  }
}


public class OverLoadingAndRidingDemo
{
  public static void main(String[] args)
  {
    Child p1 = new Child();
    p1.display();
  }

}
