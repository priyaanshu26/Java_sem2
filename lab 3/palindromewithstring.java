import java.util.*;
public class palindrome
{
	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		System.out.println("enter string");
		String a=A.next();
		String c="";
		for(int i=a.length()-1;i>=0;i--)
		{
			c=c+a.charAt(i);
		}
		System.out.println(c);
		if (a.equals(c)) {
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}

	}
}