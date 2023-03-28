package org.example.thread;

class MyTask extends Thread{

  @Override
  public void run()
  {
      for(int i=1 ; i<=5 ;i++)
      {
        System.out.println("Current Thread :: "+ Thread.currentThread().getName() + "  :"+ i);
      }
  }
}



public class ThreadDemo
{
  public static void main(String[] args) throws InterruptedException
  {
    MyTask t1 = new MyTask();
    t1.setName("Thread-1");
    MyTask t2 = new MyTask();
    t2.setName("Thread-2");
    MyTask t3 = new MyTask();
    t3.setName("Thread-3");


    t2.start();
    t2.join();
    t1.start();
    t1.join();
    t3.start();
    t3.join();


    System.out.println("Done");
  }


}
