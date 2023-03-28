package programs.string.test;

public class ReverseString
{
  public static void main(String[] args)
  {
    String[] sArray = "i like this program very much".split(" ");
    String output = "";
    for (int i = sArray.length-1; i>=0; i--)
    {
        output += sArray[i] + " ";
    }
    System.out.println(output);
  }
}
