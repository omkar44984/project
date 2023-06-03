package test;

public class Test7 {

	public static void main(String[] args) {
	
	int no=153,temp,num=no,num2=no,sum=0;
	int count=0;
	while(no>0)
	{
		temp=no%10;
		count++;
		no=no/10;
	}
	
	while(num>0)
	{
		temp=num%10;
		int mul=1;
		for(int i=0;i<count;i++)
		{
			mul=mul*temp;
		}
		num=num/10;
		sum=sum+mul;
	}
	
	if(sum==num2)
	{
		System.out.println("armstrong");
	}
	else
	{
		System.out.println(" not armstrong");
	}
	
	
	}
}
