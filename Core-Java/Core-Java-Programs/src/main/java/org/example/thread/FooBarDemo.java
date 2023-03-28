package org.example.thread;

import java.util.concurrent.Semaphore;

class MyTask2
{

  private int count;
  Semaphore foo = new Semaphore(1);
  Semaphore bar = new Semaphore(0);

  MyTask2(int count)
  {
    this.count = count;
  }

  public void printFoo(Runnable fooPrint) throws InterruptedException
  {
    foo.acquire();
    fooPrint.run();
    bar.release();
  }

  public void printBar(Runnable barPrint) throws InterruptedException
  {
    bar.acquire();
    barPrint.run();
    foo.release();
  }
}


public class FooBarDemo
{
  public static void main(String[] args)
  {
    Runnable r1 = () -> {
      System.out.println("Foo");
    };

    Runnable r2 = () -> {
      System.out.println("Bar");
    };
  }
}
