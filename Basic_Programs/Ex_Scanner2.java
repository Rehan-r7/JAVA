import java.util.Scanner;
public class Ex_Scanner2{
    int x;
    public static void main(String[] args) {
       Ex_Scanner2 ob = new Ex_Scanner2();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter the value : ");
            ob.x = sc.nextInt();
        }
        System.out.println("value of x = "+ob.x);
    }
}
