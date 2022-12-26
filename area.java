//call by reference 
import java.util.Scanner;
public class area {
   int Rectarea(int x,int y)
    {
       return (x*y);
    }
    public static void main(String[] args) {
        int p,q;
        area ob = new area();
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter a : ");
                p=sc.nextInt();
                System.out.print("Enter b : ");
                q=sc.nextInt();
            }
            System.out.println("Area : "+ob.Rectarea(p,q));
    }
}
