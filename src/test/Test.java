package test;

public class Test {

	public static void main(String[] args) {

		for(int i=100;i<=500;i++)
		{
			int no=i;
			int count=0;
			for(int i1=1;i1<=no;i1++)
			{
				if(no%i1==0)
				{
					count++;
				}
			}
	
		if(count==2){
			System.out.println(i+"prime");
		}
		else
		{
			System.out.println(i+" not prime");
		}
		}
		
	}

}
