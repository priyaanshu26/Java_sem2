import java.util.*;
public class try1{
	public static void main(String[] args) {
		int a=1;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
				{
				if(i==0 || i==5 || j==0  || j==5)
				{
				System.out.print(a++ + "  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println(" ");
			
		}
	}
}