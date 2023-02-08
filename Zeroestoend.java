// OM SAI RAM //
 import java.util.*;
 class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                b[j]=a[i];
                j=j+1;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                b[j]=a[i];
                j=j+1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
 }