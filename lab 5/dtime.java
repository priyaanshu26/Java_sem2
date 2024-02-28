class Time{
	int hour;
	int min;
	Time(){
		this.hour=10;
		this.min=50;
	}
	Time(int hour, int min){
		this.hour=hour;
		this.min=min;
	}
void add(Time t){
	int h=this.hour + t.hour;
	int m=this.min + t.min;
	if(m>60){
		m=m-60;
		h=h+1;
	}
	System.out.println(h+":"+m);
}
}
public class dtime{
	public static void main(String[] args){
		Time t1= new Time();
		Time t2= new Time(6,30);
		t1.add(t2);
	}
}
