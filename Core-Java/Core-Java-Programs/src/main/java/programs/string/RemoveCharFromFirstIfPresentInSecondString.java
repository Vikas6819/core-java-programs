package programs.string;

public class RemoveCharFromFirstIfPresentInSecondString
{
  public static void main(String[] args)
  {
    String s1 = "India is great";
    String s2 = "in";
    String ans ="";

    if(s1.contains(s2))
    {
      ans = s1.replace("In", " ");
    }
    System.out.println(ans);
  }
}
