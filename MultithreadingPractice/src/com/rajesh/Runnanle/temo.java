package com.rajesh.Runnanle;
class A

{
	public void show()
	{
		System.out.println("i am rajesh sohani");
	}
	
	
}

class B extends A
{
	public void show()
	{
		System.out.println("hii i am java");
		
	}
}
public class temo {
   public static void main(String[] args) {
	A obj=new B();
	obj.show();
}
}
