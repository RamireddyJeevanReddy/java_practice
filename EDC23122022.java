// OM SAI RAM //

/* Pair with same divisors
An integer n is said to be the divisor of another integer m if m leaves a remainder 0 when divided by n. We define a function : d(N) which is the number of pairs  (a,b) such that, a<b,  a*b=N and both the integers a and b have the same number of divisors.     For 24, we can have the pairs : (2,12), (3,8),(4,6), (1,24),(8,3).  Here in any of the pair, the number of divisors of both the integers in a pair is not the  same. Hence, d(24)=0. For 48, the pairs are : (3,16),(2,24),  (4,12) , (1,48)and (6,8). Here the pair (6,8) is a pair such that both 6 and 8 have 4 divisors.  That is, (6,8) is a pair in which both the integers have same number of divisors. Other pairs of 48, do not have this property. Hence d(48)=1.

Given a positive integer N, Write a code to compute the value of d(N).  For a given number N, if no pairs  (a,b) such that a<b, a*b=N, are possible, your code should output -1
Input format:

Enter the number N

Output format :

Value of d(N)*/

import java.util.Scanner;
public class EDC23122022 {
    public static int numberOfDivisiors(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans=ans+1;
            }
        }
        return ans/2;
    }
    public static boolean linearSerach(int a[],int n,int key){
        boolean ans=false;
        for(int i=0;i<=n;i++){
            if(a[i]==key){
                ans=true;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=-1;
        int a[]=new int[n];
        int key=0;
        for(int i=1;i<=n;i++){
            if(n%i==0 && !linearSerach(a,p,i)){
                p=p+1;
                a[p]=i;
            }
        }
        int pra=0;
        for(int j=0;j<p;j++){
            int min=j;
            for(int i=j+1;i<p+1;i++){
                if(numberOfDivisiors(a[i])==numberOfDivisiors(a[min]) && a[i]*a[min]==n){
                    key=key+1;
                }
                if(a[i]*a[min]==n){
                    pra=pra+1;

                }
            }
        }
        if(pra==0){
            key=-1;
        }
        System.out.println(key);
    }
}
