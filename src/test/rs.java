package test;

import java.util.Scanner;

public class rs {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter amount");
		int amt=sc.nextInt();
		int rs500=0,rs200=0,rs100=0;
		
		rs500=amt/500;
		amt=amt%500;
		rs200=amt/200;
		amt=amt%200;
		rs100=amt/100;
		amt=amt%100;
		int rs50 = amt/50;
		amt=amt%50;
		int rs20 = amt/20;
		amt=amt%20;
		int rs10 = amt/10;
		amt=amt%10;
		int rs5 = amt/5;
		amt=amt%5;
		int rs2 = amt/2;
		amt=amt%2;
		int rs1 = amt/1;
		amt=amt%1;
		
		
		System.out.println("RS 500: "+rs500);
		System.out.println("RS 200: "+rs200);
		System.out.println("RS 100: "+rs100);
		System.out.println("RS 50: "+rs50);
		System.out.println("RS 20: "+rs20);
		System.out.println("RS 10: "+rs10);
		System.out.println("RS 5: "+rs5);
		System.out.println("RS 2: "+rs2);
		System.out.println("RS 1: "+rs1);

		
	}
}
