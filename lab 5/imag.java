class Img{
	int a;
	int b;
	Img(){
		this.a=10;
		this.b=10;
	}
	Img(int a, int b){
		this.a=a;
		this.b=b;
	}
	void add(Img c){
		int tT1=this.a+c.a;
		int tT2=this.b+c.b;
		System.out.println(tT1+" "+tT2);
	}

}
public class Imag{
	public static void main(String[] args) {
		Img t1=new Img();
		Img t2=new Img(25,12);
		t1.add(t2);
	}
}