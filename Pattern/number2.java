import java.util.Scanner;
public class number2 {
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i+1; j++) {
                System.out.print(j+" ");
            }

            System.out.println("");
        }
    }
}
