import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        //System.out.println("\nEnter n:");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        //System.out.println("\nEnter p:");
        int p=in.nextInt();
        int b[]=new int[p];
        
        for(int i=0;i<p;i++){
            b[i]=in.nextInt();
        }
        int k=n+p;
        int c[]=new int[k];
        int j=0;
        for(int i=0;i<n;i++){
            c[j]=a[i];
            j=j+1;
        }
        for(int i=0;i<p;i++){
            c[j]=b[i];
            j=j+1;
        }
        for(int i=0;i<k;i++){
            System.out.print(" "+c[i]);
        }
        
    }
}