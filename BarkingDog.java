import java.util.Scanner;

// OM SAI RAM //
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(barking){
            if(hourOfDay<8 && hourOfDay>0){
                if(hourOfDay>22 && hourOfDay<24){
                    return true;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        boolean barking=s.nextBoolean();
        int  hour=s.nextInt();
        if(shouldWakeUp(barking,hour)){
            System.out.println("Wake up!!!");
        }
        else{
            System.out.println("No need To Wakeup!!!");
        }
    }
}
