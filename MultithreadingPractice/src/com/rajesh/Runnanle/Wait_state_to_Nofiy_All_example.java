package com.rajesh.Runnanle;

public class Wait_state_to_Nofiy_All_example {
   public synchronized void printnumbers() throws InterruptedException
   {
	   for(int i=1;i<=5;i++)
	   {
		   System.out.println(Thread.currentThread().getName()+" :"+i);
		   wait();
	   }
   }
   public synchronized void wakeup()
   {
	   System.out.println(Thread.currentThread().getName() + " is calling notify()");
	   notify(); 
   }
   
   public static void main(String[] args) {
	   Wait_state_to_Nofiy_All_example obj=new Wait_state_to_Nofiy_All_example();
	   Thread t1=new Thread(()->{
		   try {
			obj.printnumbers();
		   } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	   },"thread-A");
	   
	   Thread t2=new Thread(()->{
		   obj.wakeup();
	   },"thread -B");
	   t1.start();
	   t2.start();
}
}
