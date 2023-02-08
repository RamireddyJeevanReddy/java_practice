// OM SAI RAM //

/* Stepped Strings
Two equal length strings S1 and S2 are said to be stepped strings if the difference between the letter position in English alphabet of non space characters is ‘i’ where ‘i’ is the position of the character in the strings excluding spaces in the strings. Letter position of character ‘a’ in English alphabet is 1, letter position of character ‘b’ is 2 and so on.



Given two strings S1 and S2, write a C program to check if S1 and S2 are stepped strings. If the strings are of different length then print  "Length different" and if strings contain non alphabets then print "Strings contain non alphabets" and if strings differ in the position of space then print  "Strings differ in space" and print  "Strings are not stepped" when valid strings are given and they differ in the step value



Input Format

First line contains the string, s

Output Format

Print either Strings are stepped or Length different or Strings differ in space or Strings are not stepped or Strings contain non alphabets*/
import java.util.Scanner;

public class EDC181222 {
    public static boolean lengthDifferent(String s1,String s2){

        boolean ans=true;
        int n1=s1.length();
        int n2=s2.length();
        if(n1==n2){
            ans= true;
        }
        else{
            ans=false;
        }
        return ans;
    }
    public static boolean nonAlfabets(String s1,String s2){
        boolean ans=true;
        int n1=s1.length();
        int n2=s2.length();
        if(n1==n2){
            for(int i=1;i<n1;i++){
                if((s1.charAt(i)>32&&s1.charAt(i)<48)||(s1.charAt(i)>57&&s1.charAt(i)<65)||(s1.charAt(i)>90&&s1.charAt(i)<7)||(s1.charAt(i)>122&&s1.charAt(i)<127)){
                    ans=false;
                    break;
                }
                else if((s2.charAt(i)>32&&s2.charAt(i)<48)||(s2.charAt(i)>57&&s2.charAt(i)<65)||(s2.charAt(i)>90&&s2.charAt(i)<7)||(s2.charAt(i)>122&&s2.charAt(i)<127)){
                    ans=false;
                    break;
                }
            }

        }
        return ans;
    }
    public static boolean spaceDifference(String s1,String s2){
        int key=0;
        int n1=s1.length();
        int n2=s2.length();
        boolean ans=true;
        int anti=0;
        if(n1==n2){
            for(int i=0;i<n1;i++){
                if(s1.charAt(i)==32){
                    if(s2.charAt(i)==32){
                        ans=true;
                    }
                    else{
                        anti=anti+1;
                    }
                }
                else if(s2.charAt(i)==32){
                    if(s1.charAt(i)==32){
                        ans=true;
                    }
                    else{
                        anti=anti+1;
                    }
                }
            }
        }
        if(anti!=0){
            ans=false;
        }
        else{
            ans=true;
        }
        return ans;
    }
    public static boolean stepped(String s1,String s2){

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        s1=s1.replaceAll("\\s", "");
        s2=s2.replaceAll("\\s", "");
        int n1=s1.length();
        int n2=s2.length();
        boolean ans=true;
        int count=0;
        if(n1==n2){
            for(int i=0;i<n1;i++){
                if(s1.charAt(i)!=32 && s2.charAt(i)!=32){
                    int ch1=s1.charAt(i)-96;
                    int ch2=s2.charAt(i)-96;
                    int v=i+1;
                    if(ch2-ch1==v){
                        count=count+1;
                    }

                }
                else {
                    count=count+1;
                }
            }
        }
        if(count==n1){
            ans=true;
        }
        else{
            ans=false;
        }
        return ans;

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        if(!lengthDifferent(s1,s2)){
            System.out.println("Length different");
        }
        else if(!nonAlfabets(s1,s2)){
            System.out.println("Strings contain non alphabets");
        }
        else if(!spaceDifference(s1,s2)){
            System.out.println("Strings differ in space");
        }
        else if(stepped(s1,s2)){
            System.out.println("Strings are stepped");
        }
        else if(!stepped(s1,s2)){
            System.out.println("Strings are not stepped");
        }
    }
}
