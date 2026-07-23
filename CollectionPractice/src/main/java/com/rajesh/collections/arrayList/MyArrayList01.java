package com.rajesh.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> list=new ArrayList();
        for(int i=0;i<=10;i++)
        {
        	list.add(i);
        }
        System.out.println(list);
        // it what data structi ; it is dunamic
        // is it will add null values 
        // is i add duplicate alues 
        System.out.println(list.size());
        for(int i=0;i<=5;i++)
        {
        	list.add(i);
        }
        System.out.println("duplicate allow");
        System.out.println(list);
        list.add(null);
        System.out.println(list);
        System.out.println("null values are allowed ");
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println("multiple null values are allowed ");
        System.out.println(list);
        System.out.println("remove the 7 index element");
        System.out.println("before remove");
        System.out.println(list);
        list.remove(7);
        System.out.println("after removing");
        System.out.println(list);
        
        System.out.println("creating the new arrray list");
        ArrayList<Integer> list02=new ArrayList();
        list02.add(999);
        list02.add(888);
        list02.add(777);
        System.out.println("adding the two array list");
        list.addAll(list02);
        System.out.println(list);
        System.out.println("Con tains method");
        System.out.println("Check 999 is contain : "+list.contains(999));
        
        
        
 	}

}
