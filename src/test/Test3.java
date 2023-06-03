package test;

public class Test3 {
 public static void main(String[] args) {
	

	int num=121;
	int temp=0;
	int no=num,sum=0;
	while(no>0)
	 {
		 temp=no%10;
		 sum=(sum*10)+temp;
		 no=no/10;
	 }
	 if(num==sum)
	 {
		 System.out.println("palindrome");
	 }
	 else {
		 System.out.println("not palindrome");
	 }
}
}