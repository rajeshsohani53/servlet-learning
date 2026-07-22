package com.rajesh.Runnanle;

public class MultipleThread {
	public static void main(String[] args) {
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				for(int i=20;i<=25;i++)
				{
					System.out.println("Thread Name :"+Thread.currentThread().getName()+"-->"+i);
				}
			}
		});
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=5;i<=10;i++)
				{
					System.out.println("Thread name :"+Thread.currentThread().getName()+" -->"+i);
				}
				
			}
		});
		
		
		
		
		
		t1.setPriority(10);
		t2.setPriority(1);
		t1.setName("thread 5-10 priority 10");
		t2.setName("thread 20-25 priority 1");
		t1.start();
		t2.start();
	}
}
