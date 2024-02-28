import java.util.*;
public class palindromewithstring
{
	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		System.out.println("enter lenght of palindrome number");
		int n=A.nextInt();
		int a=A.nextInt();
		int i;
		int b;
		int c=0;
		int d=a;
		for(i=0;i<n;i++)
		{
			b=a%10;
			c=(c)*10+b;
			a=a/10;
		}
		if (c==d) {
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}

	}
}