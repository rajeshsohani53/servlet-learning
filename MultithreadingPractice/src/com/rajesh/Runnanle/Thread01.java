package com.rajesh.Runnanle;

public class Thread01 implements Runnable{
	
	public void run()
	
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("hii i am a thread");
	}
    public static void main(String[] args) {
		Thread t=new Thread(new Thread01());
		t.setName("THread 01");
		t.start();
	}
}
