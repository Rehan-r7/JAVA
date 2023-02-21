//wap in java for three integer variables print the result
import java.util.Scanner;
public class Variable{
    int x,y,z;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Variable ob = new Variable();
            //System.out.print("Enter three values : ");
                // ob.x = sc.nextInt();
                // ob.y = sc.nextInt();
                // ob.z = sc.nextInt();
                ob.x = 10;
                ob.y = 20;
                ob.z = 30;

            System.out.println("Values are : "+ob.x+"  "+ob.y+"  "+ob.z);
        }
    }
}