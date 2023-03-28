package org.example.thread.test;

class Task
{
  private int count;
  private static int no = 1;

  public Task(int count)
  {
    this.count = count;
  }

  public synchronized void printEven()
  {
      while(no <= count)
      {
        if(no % 2 != 0)
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
        else
        {
          System.out.println("Printing Even No :: "+ no+ " :: Thread:: "+ Thread.currentThread().getName());
          no++;
          notify();
        }
      }
  }

  public synchronized void  printOdd()
  {
    while(no <= count)
    {
      if(no % 2 == 0)
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
      else
      {
        System.out.println("Printing Odd No :: "+ no+ " :: Thread:: "+ Thread.currentThread().getName());
        no++;
        notify();
      }
    }
  }
}


public class EvenOddDemo
{
  public static void main(String[] args)
  {
    Task task = new Task(15);

    Runnable r1 = () -> {
      task.printEven();
    };

    Runnable r2 = () -> {
      task.printOdd();
    };

    Thread t1 = new Thread(r1, "Even-Thread");
    Thread t2 = new Thread(r2, "Odd-Thread");

    t1.start();
    t2.start();

  }
}
