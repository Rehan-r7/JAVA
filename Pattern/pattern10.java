import java.util.Scanner;
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int s = 1;s<= n-i; s++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
