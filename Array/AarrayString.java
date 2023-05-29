import java.util.Scanner;

public class AarrayString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name[] = new String[2];
            System.out.print("Enter 2 names : ");
            for (int i = 0; i < 2; i++) {
                name[i] = sc.next();
            }
            for (int i = 0; i < 2; i++) {
                System.out.println(name[i]);
            }
        }
    }
}
