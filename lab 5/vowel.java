import java.util.*;
class vowel{
	vowel(){
		
	}
	vowel(){

	}
}
public class vowel{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			Scanner s=sc.nextLine();
			if(s.equls("quit")){
				break;
			}
			else{
				vowel v= new vowel(s);
				v.ask(s);
			}
		}
	}
}