import java.util.*;
public class Subject{
	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		int a1=A.nextInt();
		int a2=A.nextInt();
		int a3=A.nextInt();
		int a4=A.nextInt();
		int a5=A.nextInt();
		int b;
		b=(a1+a2+a3+a4+a5)/5;
		if(b>=60)
		{
			System.out.println("first division");

		}
		else if(b>=50)
		{
			System.out.println("second division");
		}
			else if(b>=40)
		{
			System.out.println("third division");
		}
				else
		{
			System.out.println("fail");
		}

	}
}