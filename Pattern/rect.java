import java.util.Scanner;
public class rect
{
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        for(int i = 0 ; i<num-1;i++)
        {
            for(int j =0;j<num;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}