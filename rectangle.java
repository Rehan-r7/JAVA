//wap in java to calculate area of triangle and rectangle using inheritance take the input from the user
import java.util.Scanner;

class triangle
{
    int h,b;
    double ar;
    static Scanner sc = new Scanner(System.in);
    void getdata()
    {
        System.out.println("TRIANGLE :-");
        System.out.print("Enter the height : ");
        h=sc.nextInt();
        System.out.print("Enter the breadth : ");
        b=sc.nextInt();
        ar=0.5*b*h;
    }
    void display()
    {
        System.out.println("Area of triangle : "+ar);
        
    }
    //System.out.println();
}

public class rectangle extends triangle 
{
    public static void main(String[] args) {
        int l,b,ar;
        triangle ob = new triangle();
        ob.getdata();
        ob.display();
        System.out.println("");
        System.out.println("RECTANGLE :-");
        System.out.print("Enter length : ");
        l=sc.nextInt();
        System.out.print("Enter breadht : ");
        b=sc.nextInt();
        ar=l*b;
        System.out.println("Area of Reactangle : "+ar);

    }
}
