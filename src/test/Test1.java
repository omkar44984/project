package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t1=new TreeSet<>();
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(4);
		t1.add(5);
		System.out.println(t1);
		Iterator i=t1.iterator();
		
		for(int a=0;a<t1.size();a++) {
			System.out.println(i.next());
		}
		
	}
}
