import java.util.*;
public class calculator{
	public static void main(String[]args){
		Scanner A=new Scanner(System.in);
		double a=A.nextDouble();
		double b=A.nextDouble();
		String c=A.next();
		if(c.equals("+")){
			System.out.println(a+b);
		}
		else if(c.equals("-"))
		{
			System.out.println(a-b);
		}
		else if(c.equals("/"))
		{
			System.out.println(a/b);
		}

	}
}