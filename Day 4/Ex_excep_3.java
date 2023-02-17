import java.util.Scanner;
public class Ex_excep_3 {
    public static void main(String[] args) {
        int a = 0,b = 0,c = 0,d = 0,f = 0,g = 0,h=0,  r = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter three  Unique values : ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.print("Enter two alues : ");
            d = sc.nextInt();
            f = sc.nextInt();
        }
        
        g = a + b + c;

        System.out.println("Numerator is "+g);
        h =d-f;
        System.out.println("Denominator is : "+h);

        try {
            if (h == 0) {
                throw new ArithmeticException("Denominator cannot be zero");
            }    
            else
            {
                r = g/h;
                System.out.println(r);
            }
            
        } catch (ArithmeticException e) {
           
            System.out.println("Exception Caught ! ");
            System.out.println(e.getMessage());
        }
        
    }
}
