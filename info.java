import java.util.Scanner;
public class info {
    String name;
    int age;
    double sal;
    public static void main(String[] args) {
        info obj = new info();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name : ");
            obj.name = sc.next();
            System.out.print("Enter your Age : ");
            obj.age = sc.nextInt();
            System.out.print("Enter your Salary : ");
            obj.sal = sc.nextInt();
        }
        System.out.println("Name = "+obj.name);
        System.out.println("Age = "+obj.age);
        System.out.println("Salary= "+obj.sal);


    }
}
