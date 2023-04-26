import java.util.Scanner;

public class half_p {
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println("");
        }
        // Inverted
        System.out.println("Inverted form : ");
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" * ");
            }

            System.out.println("");
        }
    }
}
