package org.example.thread.test;

import java.util.LinkedList;

class Job
{
  private LinkedList<Integer> list = new LinkedList<>();
  private static int capacity = 2;

  public void produce() throws InterruptedException
  {
    int value = 0;
    while (true) {
      synchronized (this)
      {
        // producer thread waits while list
        // is full
        while (list.size() == capacity)
          wait();

        System.out.println("Producer produced-"
          + value);

        // to insert the jobs in the list
        list.add(value++);

        // notifies the consumer thread that
        // now it can start consuming
        notify();

        // makes the working of program easier
        // to  understand
        Thread.sleep(1000);
      }
    }
  }

  public synchronized void consume()
  {
    while (true)
    {
      if (list.size() == 0)
      {
        System.out.println("List Is Empty");
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
        System.out.println("Consuming a value:: " + list.removeFirst() + " :: Thread :: " + Thread.currentThread().getName());
        notify();
        try
        {
          Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
          throw new RuntimeException(e);
        }
      }
    }
  }


}

public class ProducerConsumerDemo
{
  public static void main(String[] args)
  {
    Job job = new Job();

    Runnable r1 = () -> {
      try
      {
        job.produce();
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    };

    Runnable r2 = () -> {
      job.consume();
    };

    Thread t1 = new Thread(r1, "Thread-Produce");
    Thread t2 = new Thread(r2, "Thread-Consume");

    t1.start();
    t2.start();
  }
}
