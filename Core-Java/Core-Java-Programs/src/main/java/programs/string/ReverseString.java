package programs.string;

public class ReverseString
{
  public static void main(String[] args)
  {
    String[] sArray = "i like this program very much".split(" ");

    String ans = "";

    for (int i = sArray.length-1; i>=0; i--)
    {
      ans += sArray[i] + " ";
    }
    System.out.println(ans);
  }
}
