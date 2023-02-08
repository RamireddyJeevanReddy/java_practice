// OM SAI RAM //

import java.util.Scanner;

public class ReadingInputChallenge {
    public static void compute(){
        Scanner s=new Scanner(System.in);
        boolean valid=false;
        do {

            int a[] = new int[5];
            int n = 5;
            try {
                for (int i = 0; i < n; i++){
                    System.out.println("Enter number #" + i + ":");
                    a[i] = s.nextInt();
                }
                valid = isValid(a);
            }catch (NumberFormatException badinput){
                System.out.println("only numbers are allwed try again");
            }
        }while(!valid);
        System.out.println("Finally You Are right");


    }
    public static boolean isValid(int a[]){
        boolean ans=true;
        for(int i=0;i<5;i++){
            if(a[i]<0){
                ans=false;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        compute();
    }
}
