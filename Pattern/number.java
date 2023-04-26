import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
              
                System.out.print(j+" ");
            }

            System.out.println("");
        }
    }
}
