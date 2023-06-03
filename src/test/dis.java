package test;

import java.util.ArrayList;

public class dis {

	int id;
	String name;
	double sal;
	

	public dis(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "dis [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public static void main(String[] args) {
		
		
		
		ArrayList<dis> a=new ArrayList<>();
		
		a.add(new dis(1, "omkar", 45));
		
		for(dis data:a)
		{
			System.out.println(data);
		}
		
	}

	
	
}
