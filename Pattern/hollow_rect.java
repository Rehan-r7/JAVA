import java.util.Scanner;
public class hollow_rect {
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        for(int i = 0 ; i<num-1;i++)
        {
            for(int j =0;j<num;j++)
            {
                if (i==0 || j == 0 || i == num-2 || j == num-1) {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
