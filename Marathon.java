import java.util.*;
class Marathon{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Entre the distance of the marathon: ");
		int n=s.nextInt();
		System.out.println("Enter the distance sai covered in fist hour: ");
		int x=s.nextInt();
		System.out.println("Enter the time in which sai need to complete the race: ");
		int h=s.nextInt();
		int y=n/h;

		int a=y+1;
		System.out.println("Required speed for sai to win the marathon is: "+a);
	}
}