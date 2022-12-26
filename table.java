import java.util.Scanner;
public class table {
    int n;
    public static void main(String[] args) {
        //int n;
        table obj = new table();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            obj.n = sc.nextInt();
        }
        for(int i=1;i<11;i++)
        {
            System.out.println(obj.n+"*"+i+"="+(obj.n*i));
        }
     }
}
