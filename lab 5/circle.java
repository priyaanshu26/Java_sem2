public class circle{
	public static void main(String[] args) {
		circleArea cir =new circleArea ();
		cir.print(5);
	}
}
class circleArea{
	int r;
	void print (int r){
		double area = 3.14*r*r;
		System.out.println(area);

	}
}