package test;

public class Test2 {

	public static void main(String[] args) {
		
		String s1="mada";
		char ch;
		
		String temp="";
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			temp=ch+temp;
		}
		if(s1.equals(temp)) {
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
