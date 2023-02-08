import java.util.*;
class Teamplayers{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total number of players ");
		int t=s.nextInt();
		System.out.println("Enter the number of teams needed: ");
		int n=s.nextInt();
		int x=t/n;
		int y=t%n;
		System.out.println("The number of teams with "+n+" players in each teams can me formed is: "+x);
		System.out.println("The number od people left out is: "+y);
	}
}
