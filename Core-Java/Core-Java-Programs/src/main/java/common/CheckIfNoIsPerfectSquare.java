package common;

public class CheckIfNoIsPerfectSquare
{
  public static void main(String[] args)
  {
    int no = 25;
    for(int i = 1; i<=no/2; i++)
    {
      if(i*i == no){
        System.out.println("Perfect-Square");
        break;
      }
    }

    // square root


  }
}
