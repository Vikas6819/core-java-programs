package programs.string.test;

import java.util.Stack;

public class BracketsDemo
{
  public static void main(String[] args)
  {
    String s1 = "([{}])";

    char[] charArray = s1.toCharArray();
    Stack<Character> stack = new Stack<>();
    System.out.println(checkValidParenthisis(charArray, stack));
  }

  private static boolean checkValidParenthisis(char[] charArray, Stack<Character> stack)
  {
    if(charArray.length %2 != 0)
      return false;
    for(int i = 0; i< charArray.length; i++)
    {
       if(charArray[i] == '{' || charArray[i] == '[' || charArray[i] == '(')
         stack.push(charArray[i]);
       else if (charArray[i] == '}' || charArray[i] == ']' || charArray[i] == ')')
       {
         stack.pop();
       }
    }
    return stack.isEmpty();
  }
}
