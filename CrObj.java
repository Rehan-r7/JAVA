import java.util.Scanner;
public class CrObj {
    int x;
    public static void main(String[] args) {
        CrObj ob = new CrObj();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter the value : ");
            ob.x = sc.nextInt();
        }
        System.out.println("value of x = "+ob.x);
    }
}
