package org.example.thread.test;

public class DeadLockDemo
{
  public static void main(String[] args)
  {
    String s1 = "Vikas";
    String s2 = "Dhongade";

    Runnable r1 = () -> {
        synchronized (s1)
        {
          System.out.println("Got S1 Object Lock:: "+ Thread.currentThread().getName());
          try
          {
            Thread.sleep(5000);
          }
          catch (InterruptedException e)
          {
            throw new RuntimeException(e);
          }
          System.out.println("Trying to get s2 object lock:: "+ Thread.currentThread().getName());
          synchronized (s2)
          {
            System.out.println("Got s2 Object Lock:: "+ Thread.currentThread().getName());
          }
        }
    };

    Runnable r2 = () -> {
      synchronized (s1)
      {
        System.out.println("Got S1 Object Lock:: "+ Thread.currentThread().getName());
        try
        {
          Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
          throw new RuntimeException(e);
        }
        System.out.println("Trying to get s2 object lock:: "+ Thread.currentThread().getName());
        synchronized (s2)
        {
          System.out.println("Got s2 Object Lock:: "+ Thread.currentThread().getName());
        }
      }
    };

    Thread t1 =  new Thread(r1, "Thread-1");

    Thread t2 =  new Thread(r2, "Thread-2");

    t1.start();
    t2.start();

  }
}
