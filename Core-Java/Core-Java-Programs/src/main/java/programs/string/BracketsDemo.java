package programs.string;

import java.util.Stack;

public class BracketsDemo
{
  public static void main(String[] args)
  {
    String s1 = "([{}])";
    System.out.println(checkForBalancedBrackets(s1));
  }

  public static boolean checkForBalancedBrackets(String s1)
  {
    Stack<Character> stack = new Stack<>();
    if (s1.toCharArray().length % 2 != 0)
    {
      return false;
    }
    for (Character ch : s1.toCharArray())
    {
      if (ch == '(' || ch == '{' || ch == '[')
        stack.push(ch);
      else if (!stack.empty() && (ch == ')' || ch == '}' || ch == ']'))
      {
        stack.pop();
      }
    }
    return stack.empty();
  }
}
