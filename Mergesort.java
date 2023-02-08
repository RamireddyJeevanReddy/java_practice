// OM SAI RAM //

import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter the number of elements in 1st array: ");
		int n1=s.nextInt();
		int a[]=new int[n1];
		for(int i=0;i<n1;i++){
			a[i]=s.nextInt();
		}
		System.out.println("\nEnter the number of elements in the 2nd array: ");
		int n2=s.nextInt();
		int b[]=new int[n2];
		for(int i=0;i<n2;i++){
			b[i]=s.nextInt();
		}
		// for(int i=0;i<n1;i++){
		// 	System.out.println(a[i]+" ");
		// }
		int k=n1+n2;
		int fin[]=new int[k];
		int d1=0;
		int d2=0;
		int f=0;
		while(d1<n1 && d2<n2){
		    if(a[d1]>b[d2]){
		        fin[f]=b[d2];
		        d2=d2+1;
		        f=f+1;
		    }
		    else if(a[d1]<b[d2]){
		        fin[f]=a[d1];
		        d1=d1+1;
		        f=f+1;
		    }
		}
		if(d1!=n1){
		    while(d1<n1){
		        fin[f]=a[d1];
		        f=f+1;
		        d1=d1+1;
		    }
		}
		if (d2!=n2){
		    while(d2<n2){
		        fin[f]=b[d2];
		        f=f+1;
		        d2=d2+1;
		        
		    }
		}
		for (int i=0;i<k;i++){
		    System.out.println(fin[i]+" ");
		}
	}
}