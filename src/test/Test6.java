package test;

public class Test6 {

	public static void main(String[] args) {

		int arr[]= {1,2,3,1,3,3,3};
		int[] temp= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					temp[i]=1;
				}
			}
			if(temp[i]!=-1)
			{
				temp[i]=count;
			}
		}
			for(int i=0;i<arr.length;i++)
			{
				if(temp[i]>1)
				{
					System.out.println(arr[i]);
				}
			}
		for(int j=0;j<arr.length;j++)
		{
			if(temp[j]!=-1)
			{
				System.out.println(arr[j]+"||"+temp[j]);
			}
		}
			
	}

} 
