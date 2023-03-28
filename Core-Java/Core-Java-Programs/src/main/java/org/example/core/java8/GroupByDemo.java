package org.example.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;



public class GroupByDemo
{
  public static void main(String[] args)
  {
      String s1 = "[{()}]";
      String s2 = "}{][";// }{][,
    //System.out.println(isValidParenthis(s1));// valid
    System.out.println(isValidParenthis(s2));// invalid
  }
  private static boolean isValidParenthis(String s1)
  {

    Stack<Character> stack = new Stack<>();

    char[] charArray = s1.toCharArray();

    if(charArray.length % 2 != 0)
      return false;

    for(Character ch : charArray)
    {

      if(stack.isEmpty() && ch == ')'|| ch == '}' || ch == ']')
        return false;
      if(ch == '(' || ch == '{' || ch == '[')
        stack.push(ch);
      else if (ch == ')'|| ch == '}' || ch == ']')//    ,, [{(
      {
        if(ch == stack.peek())
          stack.pop();
      }
    }
    return  stack.isEmpty();
  }
}
