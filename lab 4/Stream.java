public class Stream{
	public static void main(String[] args) {
		String sc = "stream";
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(sc.charAt(j));
			}
			System.out.println();
		}
	}
}