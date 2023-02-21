import java.util.Scanner;
public class Exfun {

    void f1()
    {
        System.out.println("Hello");
    }
    int f1(int x,int y)
    {
        return (x*y);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a,b;
            Exfun ob1 = new Exfun();
            Exfun ob2 = new Exfun();
            System.out.print("Enter two values : ");
            a=sc.nextInt();
            b=sc.nextInt();
            ob1.f1();
      System.out.println("Product : "+ob2.f1(a, b));
        }
    }
}
