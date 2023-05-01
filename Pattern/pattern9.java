import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i<=n;i++)
        {
            for(int space = 1;space<=n-i;space++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
