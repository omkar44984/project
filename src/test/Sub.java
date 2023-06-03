package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Sub {
	
	static HashMap<String, Integer> h=new HashMap<>();
	public static void addData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sub");
		String sub=sc.next();
		System.out.println("enter the marks");
		int mark=sc.nextInt();
		h.put(sub,mark);
	}
	public static void disdata()
	{
		
	}
}
