package org.example.linear;


class Stack
{
  private int[] stackArray;
  private int top = -1;

  public Stack(int size)
  {
    this.stackArray = new int[size];
  }

  public int push(int number)
  {
    if (top == stackArray.length -1)
    {
      System.out.println("Stack Is Full");
      return 0;
    }
    else
    {
      top++;

      stackArray[top] = number;

    }
    return number;
  }

  public int pop()
  {
    if (top == -1)
    {
      System.out.println("Stack Is Empty");
      return 0;
    }
    else
    {
        int returnedPop = top;
        System.out.println("Popping Element: "+ stackArray[returnedPop]);
        top --;
        return stackArray[returnedPop];
    }
  }
}


public class StackDemo
{
  public static void main(String[] args)
  {
    Stack stack = new Stack(5);
    System.out.println(stack.push(1));
    System.out.println(stack.push(2));
    System.out.println(stack.push(3));
    System.out.println(stack.push(4));
    System.out.println(stack.push(5));
    //System.out.println(stack.push(6));
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
