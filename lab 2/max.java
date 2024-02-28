import java.util.*;
public class max{
	public static void main(String[] args) {
		int a=10;
		int b=8;
		int c=6;
		if (a>b) 
		{
			if (a>c) 
			{
				System.out.println("a max");
				System.out.println(a);
			}
			else
			{
				System.out.println("c max");
			}
		}
		else
		{
			if(b>c)
			{
			System.out.println("b max");
			}
			else
			{
			System.out.println("c max");
			}

		}
	}
}