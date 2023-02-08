// OM SAI RAM //
 import java.util.*;
 class Encoding{
     static void sort(String s){
         int n=s.length();
         char a[]=new char[n];
         for(int i=0;i<n;i++){
             a[i]=s.charAt(i);
         }
         for(int j=0;j<n-1;j++){
             int min=j;
             for(int i=j+1;i<n;i++){
                 if(a[min]>a[i]){
                     char temp=a[min];
                     a[min]=a[i];
                     a[i]=temp;
                 }
             }
         }
         for(int i=0;i<n;i++){
             System.out.print(a[i]);
         }
         System.out.print(" ");
     }
     public static void main(String args[]){
         Scanner s=new Scanner(System.in);
         String st=s.nextLine();
         int n=st.length();
         char a[]=new char[n];
         int space=0;
         for(int i=0;i<n;i++){
             if(st.charAt(i)==32){
                 space=space+1;
             }
         }
         space=space+1;
         String b[]=new String[space];
         b=st.split(" ");
         for(int i=0;i<space;i++){
             sort(b[i]);
         }
     }
 }