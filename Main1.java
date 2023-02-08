//OM SAI RAM
import java.util.*;
class Motors{
	String type;
	int price;
	int discount;
	int gst=3;
	int ans;
	public int set(String t,int p){
		type=t;
		price=p;
		return 0;
	}
	public int compute(){
		if(type.charAt(0)=='T' && type.charAt(1)=='a'){
			ans=price;
		}
		else if(type.charAt(0)=='T' && type.charAt(1)=='o'){
			discount=5-gst;
			int tem=price/100;
			ans=price-(discount*tem);
		}
		else if(type.charAt(0)=='R'){
			discount=7-gst;
			int temp=price/100;
			ans=price-(discount*temp);
		}
		else if(type.charAt(0)=='H'){
			discount =8-gst;
			int t=price/100;
			ans=price-(discount*t);
		}
		return ans;
	}
}

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String m=s.nextLine();
		int a=s.nextInt();
		Motors g1=new Motors();
		if(m.charAt(0)=='F'){
			System.out.println("Invalid ");
		}
		else{
			g1.set(m,a);
			System.out.println(g1.compute());
		}
	}
}