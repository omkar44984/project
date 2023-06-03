package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int arr[]={1,2,3,4,5};
	System.out.println("enter the no how many time rotate");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int temp=arr[0];
		for(int j=0;j<arr.length-1;j++)
		{
			arr[j]=arr[j+1];
		}
		arr[arr.length-1]=temp;
	}
	System.out.println(Arrays.toString(arr));
}
}
