import java.util.Scanner;
public class add {
    int x;
    int y;
    int sum;
    
    public static void main(String[] args) {
   add obj = new add();
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter First number : ");
        obj.x = sc.nextInt();
        System.out.print("Enter Second number : ");
        obj.y= sc.nextInt();
        obj.sum=obj.x+obj.y;
            }
    System.out.println("Sum = "+obj.sum);
  }  
}
