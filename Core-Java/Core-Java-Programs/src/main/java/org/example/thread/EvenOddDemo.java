package org.example.thread;

class Job
{
  private int counter = 1;

  private int count;

  Job(int count)
  {
    this.count = count;
  }

  public void evenPrint()
  {
    synchronized (this)
    {
      while (count > counter)
      {
        if (counter % 2 != 0)
        {
          try
          {
            wait();
          }
          catch (InterruptedException e)
          {
            throw new RuntimeException(e);
          }
        }
        System.out.println(Thread.currentThread().getName() + ":: count :: " + counter);
        counter++;
        notify();
      }
    }

  }

  public void oddPrint()
  {
    synchronized (this)
    {
      while (count > counter)
      {
        if (counter % 2 == 0)
        {
          try
          {
            wait();
          }
          catch (InterruptedException e)
          {
            throw new RuntimeException(e);
          }
        }
        System.out.println(Thread.currentThread().getName() + ":: count :: " + counter);
        counter++;
        notify();
      }
    }

  }
}


public class EvenOddDemo
{
  public static void main(String[] args)
  {
    Job job = new Job(15);

    Runnable r1 = () -> {
      job.evenPrint();
    };

    Runnable r2 = () -> {
      job.oddPrint();
    };

    Thread t1 = new Thread(r1, "Even-Thread");
    Thread t2 = new Thread(r2, "Odd-Thread");

    t1.start();
    t2.start();
  }
}
