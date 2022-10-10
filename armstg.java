import java.util.Scanner;;
public class armstg {
    public static void main(String[] args) {
        int n,temp,arm=0,r;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            n = sc.nextInt();
        }
        temp=n;
        while (n>0) {
            r=n%10;
            arm+=(r*r*r);
            n=n/10;
        }
        if (temp==arm) 
        {
            System.out.println("Number is armtrong");    
        }
        else
        {
            System.out.println("Not a armstrong number");
        }
    }
}
