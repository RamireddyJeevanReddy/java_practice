import java.util.*;
class Jeevan{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int m=s.nextInt();
        System.out.println("Enter the value of m: ");
        int n=s.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];
        System.out.println("Enter the value of first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        
        }
        System.out.println("Enter the value of second matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=s.nextInt();
            }
        }



        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=a[i][j]*b[i][j];
            }
        }
         System.out.println("The matrix with the values of the subtration is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
        
        
        
    }
}