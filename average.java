//write a java program to compute avarage of three numbers and perform necessary typecasting 
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        double n1,n2,n3;
        int av;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter three numbers : ");
            n1=sc.nextInt();
            n2=sc.nextInt();
            n3=sc.nextInt();
        }
        //add=(n1+n2+n3)
        av=(int)((n1+n2+n3)/3);
        System.out.println("Average = "+av);
    }
}
