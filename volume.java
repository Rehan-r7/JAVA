/*define a class compute with overloaded method void add(),int add(int,int) and double(double,double,double)implement this 
program in java*/
/*
wap in java to calculate volume of box using func 
 */
import java.util.Scanner;
 public class volume {
    //int l,b,h,vol;
    Scanner sc = new Scanner(System.in);
    int f1(int l,int b,int h){
        /*l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();*/
        return l*b*h;
        //System.out.println("Volume = "+vol);
    }
    public static void main(String[] args) {
        
        volume ob = new volume();
        //System.out.println("Volume of box = "+ob.f1(2,2,2));
        int r=ob.f1(2, 2, 4);
        System.out.println("volume = "+r);
    }
}

