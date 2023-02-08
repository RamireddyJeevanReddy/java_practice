import java.util.Scanner;

class PositiveNegitiveZero {
    public static void checkNumber(int n){
        if(n>0){
            System.out.println("positive");
        }
        else if(n<0){
            System.out.println("negitive");
        }
        else System.out.println("zero");
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        checkNumber(k);
    }
}
