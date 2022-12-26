import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n,count=0;
        try (Scanner sc = new Scanner(System.in)) {
           
            System.out.print("Enter a number to check whether it is prime or not : ");
            n=sc.nextInt();
        }
            
            for(int i=1;i<=n;i++)
            {
                if (n%2==0) {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("Number is prime");
            }
            else
            {
                System.out.println("Not a prime number");
            }
    }
}
