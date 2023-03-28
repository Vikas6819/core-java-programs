package programs.string;

public class VowelsDemo
{
  public static void main(String[] args)
  {
    String s1 = "aeiuba";

    long count = s1.chars()
      .mapToObj(cha -> Character.valueOf((char) cha))
      .filter(cha -> (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u'))
      .count();

    System.out.println(count);
  }
}
