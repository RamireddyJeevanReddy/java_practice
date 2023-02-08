import java.util.*;
class Student{
    int total=0;
    float avg;
    void res(String s,int a,int b,int c,int d,int e){
        total=a+b+c+d+e;
        avg=(float)total/5;
        System.out.println(s+" Total: "+total);
        System.out.println("Average: "+avg);
    }
}
class Dummy{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        int e=s.nextInt();
        Student a1=new Student();
        a1.res(s1,a,b,c,d,e);
    }
}