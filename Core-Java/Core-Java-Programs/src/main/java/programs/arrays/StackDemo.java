package programs.arrays;

import java.util.Arrays;

class Stack
{
  private int[] array;
  private int top = -1;

  Stack(int size)
  {
    array = new int[size];
  }

  public void push(int no)
  {

    if (!(top == array.length-1))
    {
      top++;
      array[top] = no;
    }
    else
      System.out.println("Stack Is Full");

  }

  public int pop()
  {

    if (!(top == -1))
    {
      int count = top;
      top--;
      return array[count];
    }
    else
    {
      System.out.println("Stack Is Empty");
      return -1;
    }

  }

  public void print()
  {
    System.out.println(Arrays.toString(this.array));
  }


}

public class StackDemo
{
  public static void main(String[] args)
  {
    Stack stack = new Stack(5);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);

    stack.print();

    stack.pop();

  }
}
