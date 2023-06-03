package test;

public class Test5 {

	public static void main(String[] args) {
		
		int num=153,no=num,temp=0,sum=0;
		while(no>0)
		{
			temp=no%10;
			int fact=1;
			for(int i=1;i<temp;i++)
			{
				fact=fact*1;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(sum==num)
		{
			System.out.println("strong");
		}
		else
		{
			System.out.println(" not strong");
		}
		
		
	}

}
