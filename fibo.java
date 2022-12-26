//wap in java to print fibonacci series
import java.util.Scanner;
public class fibo {
    int num,a=0,b=1,c;
    void logic()
    {
        for(int i=0;i<=num;i++){
            System.out.print(a+"\t");
            c=a+b;
            a=b;
            b=c;
        }
        //System.out.println("fibonacci series = "+f);
    }
    public static void main(String[] args) {
        fibo ob = new fibo();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter a value : ");
            ob.num=sc.nextInt();
        }
        ob.logic();

    }
}
