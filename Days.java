import java.util.*;
class Days{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		int y=s.nextInt();
		System.out.println("Enter the nuber of weeks: ");
		int w=s.nextInt();
		System.out.println("Enter the number of dyas");
		int d=s.nextInt();
		d=d+(w*7);
		d=d+((y*52)*7);
		System.out.println("The total number of days: "+d);
	}
}