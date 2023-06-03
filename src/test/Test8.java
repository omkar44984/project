package test;

public class Test8 {

	public static void main(String[] args) {
		int no=1;
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		
		if(count==2){
			System.out.println("prime");
		}
		else
		{
			System.out.println(" not prime");
		}
	}
}
