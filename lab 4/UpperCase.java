public class UpperCase{
	public static void main(String[] args) {
		String sc=args[0];
		if(sc.charAt(0)>='A' && sc.charAt(0)<='Z')
		{
			System.out.println("UpperCase");
		}
		else
		{
			System.out.println("LowerCase");
		}
	}
}