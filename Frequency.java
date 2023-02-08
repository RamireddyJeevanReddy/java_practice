// OM SAI RAM //

import java.util.*;
class Frequency{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		char a[]=new char[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.charAt(i);
		}
		int key=0;
		for(int j=0;j<n;j++){
			key=1;
			int min=j;
			b[min]=1;
			for(int i=j+1;i<n;i++){
				if(a[min]==a[i] && a[min]!='0'){
					// 
					key=key+1;
					a[i]='0';
				}
			}
			if(a[min]!='0'){
				System.out.println(a[min]+":"+key);
			}
		}
		// for(int i=0;i<n;i++){
		// 	System.out.println(a[i]+":"+key);
		// }
	}
}