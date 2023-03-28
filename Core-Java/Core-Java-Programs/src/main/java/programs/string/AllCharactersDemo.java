package programs.string;

public class AllCharactersDemo
{
  public static void main(String[] args)
  {
    String s1 = "abcdefghijklmnopqrstuvwxy";


    long count = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .filter(cha -> cha >= 'a' && cha <= 'z')
      .distinct()
      .count();

    if(count == 26)
      System.out.println("Valid");
    else
      System.out.println("Not Valid");
  }
}
