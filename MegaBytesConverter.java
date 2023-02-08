// OM SAI RAM //
import java.util.*;
public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int n){
        int megabytes=0;
        int remainder=n;
        if(n<=0){
            System.out.println("Invalid Value");
        }
        else{
            while(remainder-1024>0){
                remainder=remainder-1024;
                megabytes=megabytes+1;
            }
            System.out.println(n+" KB = "+megabytes+" MB and "+remainder+" KB");
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int kilobytes=s.nextInt();
        printMegaBytesAndKiloBytes(kilobytes);
    }
}
