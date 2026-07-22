package com.rajesh.Runnanle;

class MyTask {

    public synchronized void printNumbers() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);

            try {
               // Thread.sleep(1000);
            	wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class LockExample 
{
	public static void main(String[] args) {
		MyTask obj1=new MyTask();
		Thread t1=new Thread(()->{
			obj1.printNumbers();
		},"Thread-1");
		
		Thread t2=new Thread(()->{
			obj1.printNumbers();
		},"Thread-02");
		
		t1.start();
		t2.start();
		}
	
	
}
