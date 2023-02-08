import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the depth of the well: ");
		int z=s.nextInt();
		System.out.println("Enter the number of meters frog jumps up: ");
		int x=s.nextInt();
		System.out.println("Enter the number of meters the frog slips: ");
		int y=s.nextInt();
		int sum=0;
		int days=0;
		for(int i=0;i<z;i++){
			if(sum<z){
				sum=sum+(x-y);
				days=days+1;
			}
		}
		System.out.println("The number of days required for the frog to get out the well is: "+days);
	}
}