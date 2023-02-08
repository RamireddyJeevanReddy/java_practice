import java.util.*;
class Cndle{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of new candles: ");
		int a=s.nextInt();
		System.out.println("Enter the number of candles can be reused: ");
		int b=s.nextInt();
		int hours=0;
		hours=hours+a;
		hours=hours+b;
		System.out.println("Jinesh can light the room for: "+hours+" hrs");
	}
}