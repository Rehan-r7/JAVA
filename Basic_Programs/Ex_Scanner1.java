import java.util.Scanner;
public class Ex_Scanner1 {
  public static void main(String[] args) {
    int x;
    String name;
    float f;
    try (Scanner sc = new Scanner(System.in)) {
        x = sc.nextInt();
        name = sc.next();
        f = sc.nextFloat();
    }
    System.out.println(x+"\t"+name+"\t"+f);
  }  
}
