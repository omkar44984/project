package test;

import java.util.ArrayList;

public class forloop {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("omkar");
		a1.add("suyog");
		a1.add("pritam");
		
		System.out.println(a1);
		
		for(String data:a1)
		{
			if(a1.contains("omkar"))
			{
				a1.remove("omkar");
			}
		}
		
		for(int i=0;i<a1.size();i++)
		{
			if(a1.contains("omkar"))
			{
				a1.remove("omkar");
			}
		}
		
		
		
	}
}
