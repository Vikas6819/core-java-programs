package common;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class SingleTone
{
  private static volatile SingleTone s1 = null;

  private SingleTone()
  {
    throw new IllegalArgumentException("Action not allowed");
  }

  public static SingleTone getInstance()
  {
    if (s1 == null)
    {
      synchronized (SingleTone.class)
      {
        if (s1 == null)
          s1 = new SingleTone();

      }
    }
    return s1;
  }
}


public class SingleToneDemo
{
  public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException
  {
    SingleTone s1 = SingleTone.getInstance();
    SingleTone s2 = SingleTone.getInstance();

    System.out.println(s1.hashCode() + "===========" + s2.hashCode());

    /*SingleTone s3 = null;

    Constructor<?>[] constructors = SingleTone.class.getDeclaredConstructors();
    for (Constructor constructor : constructors)
    {
      constructor.setAccessible(true);
      s3 = (SingleTone) constructor.newInstance();
    }

    System.out.println(s3.hashCode());
*/

  }
}
