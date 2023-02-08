import java.util.*;
class Luckyprizes{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the registration number: ");
		int num=s.nextInt();
		int k=num;
		int count=0;
		while(num!=0){
			num=num/10;
			count=count+1;
		}
		//System.out.println(count);
		int a[]=new int[count];
		for(int i=(count-1);i>=0;i--){
			a[i]=k%10;
			k=k/10;
		}
	   // for(int i=0;i<count;i++){
	   //     System.out.println(a[i]);
	   // }
		int ans=0;
		int w=0;
		
		for(int i=0;i<count;i++){
			if((a[i]%2) != 0){
			    ans=ans+1;
			}
			else{
			    w=w+1;
			}
		}
		//System.out.println(ans+" "+w);
		
		if(ans==0 && a[0]!=8 && a[count-1]!=8){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}