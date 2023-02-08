// OM SAI RAM //

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour ){
        double ans=kilometersPerHour/1.5;
        long fin=(long)ans;
        return fin;
    }
    public static void printConversion(double kilometerPerHour){
        long ans=toMilesPerHour(kilometerPerHour);
        if(ans>=0){
            System.out.println(kilometerPerHour+" km/h = "+ans+" mi/h");
        }
        else{
            System.out.println("Invalid Value");
        }
    }
    public static void main(String args[]){
       // System.out.println(printConversion(-25.42d));
        printConversion(75.114d);
    }
}
