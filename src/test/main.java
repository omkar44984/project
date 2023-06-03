package test;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("1.Add data");
		System.out.println("2.Display data");
		System.out.println("3.Calculate per");
		System.out.println("4.exit");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		switch (a) 
		{
		case 1: {
			
			Sub.addData();
			break;
		}
		case 2: {
					
					
					break;
				}
		case 3: {
			
			
			break;
		}
		case 4: {
			
			
			break;
		}
		default:
		{
			System.out.println("invalid input");
		}
		
	}
}
}
