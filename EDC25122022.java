// OM SAI RAM //

import java.util.Scanner;

/*Difference of the sum of alternate digits (D)
Given a positive integer 'x' (with even number of digits in it), write an algorithm and the subsequent code to compute the difference between  the sum of the digits occuring in the alternate positions (starting from the first position) and the sum of the digits occuring in the alternate positions,starting from the last rightmost position of 'x'

For example, consider the number  8975.  The sum of the digits that occur in the alternate positions from the first position is 8+7=15.  The sum of the digits that occur in the alternate positions, starting from the rightmost position is 5+9 = 14. Difference between the two sums is 1 (=15-14).  Similarly, for the number 5798, the difference between  two sums, is 1.

Note: Read the input as a number and do entire processing as  a number

C++ compilers can compile C code also

Input format

First line contains the positive integer

Output format :

First line should contain the difference between  the sum of the digits occuring in the alternate positions (starting from the first position) and the sum of the digits occuring in the alternate positions (startting from the last rightmost position).

*/
public class EDC25122022 {
    public static int length(int a){
        int count=0;
        while(a!=0){
            count=count+1;
            a=a/10;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=length(n);
        //p=p+1;
        int a[]=new int[p];
        for(int i=p-1;i>=0;i--){
            a[i]=n%10;
            n=n/10;
        }
        int sumleft=0;
        int sumRight=0;
        for(int i=0;i<p;i=i+2){
            sumleft=sumleft+a[i];
        }
        for(int i=p-1;i>=0;i=i-2){
            sumRight=sumRight+a[i];
        }
        if(sumleft>sumRight){
            System.out.println(sumleft-sumRight);
        }
        else if(sumleft<sumRight){
            System.out.println(sumRight-sumleft);
        }
        else{
            System.out.println(sumleft-sumRight);
        }
//        System.out.println(p);
//        System.out.println(sumRight);
//        for(int i=0;i<p;i++){
//            System.out.print(a[i]+" ");
//        }
    }
}
