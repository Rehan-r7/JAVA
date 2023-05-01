import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            n = sc.nextInt();
            for(int i = 1;i<=n;i++)
            {
                for(int j = 1;j<=i;j++)
                {
                    System.out.print("*");
                }
                for(int space = 1;space<=2*(n-i);space++)
                {
                    System.out.print(" ");
                }
                for(int k = 1;k<=i;k++)
                {
                    System.out.print("*");
                }
               
                System.out.println();
            }
            for(int i = 1;i<=n;i++)
            {
                
                for(int j = 1;j<=n-i+1;j++)
                {
                    System.out.print("*");
                }
                for(int space = 1;space<=2*(i)-2;space++)
                {
                    System.out.print(" ");
                }
                for(int k = 1;k<=n-i+1;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
