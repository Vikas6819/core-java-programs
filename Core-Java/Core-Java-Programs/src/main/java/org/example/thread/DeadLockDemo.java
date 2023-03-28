package org.example.thread;


public class DeadLockDemo
{
  public static void main(String[] args)
  {
    String s1 = "abc";
    String s2 = "xyz";
    Runnable myRunnable1 = () -> {

      synchronized (s1)
      {
        System.out.println("Thread-1 locked s1");
        try
        {
          Thread.sleep(5000);
        }
        catch (InterruptedException exception)
        {
          exception.printStackTrace();
        }
        synchronized (s2)
        {
          System.out.println("Thread-1 locked s2");
        }
      }
    };

    Runnable myRunnable2 = () -> {

      synchronized (s1)
      {
        System.out.println("Thread-2 locked s2");
        try
        {
          Thread.sleep(6000);
        }
        catch (InterruptedException exception)
        {
          exception.printStackTrace();
        }
        synchronized (s2)
        {
          System.out.println("Thread-2 locked s1");
        }
      }
    };

    Thread t1 = new Thread(myRunnable1);
    Thread t2 = new Thread(myRunnable2);

    t1.start();
    t2.start();

  }
}
