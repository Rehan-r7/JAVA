import java.util.Scanner;
public class constructor {
    int x;
    constructor()
    {
        x=10;
        System.out.println("Default constructor :-");
        System.out.println("value of x : "+x);
    }
    constructor(int x,int y)
    {
        System.out.println("Parameterized constructor :-");
        System.out.println("value : "+(x+y));
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a,b;
            System.out.print("Enter two values : ");
            a = sc.nextInt();
            b = sc.nextInt();
            constructor c = new constructor();
            constructor ob = new constructor(a,b);
        }
    }
}
