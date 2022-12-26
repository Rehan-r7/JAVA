import java.util.Scanner;;
public class leap {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of days : ");
            n=sc.nextInt();
        }
        if(n==365 || n==366)
        {
        
            if (n==366) 
        {
            System.out.println("Given year is leap year");    
        }
        else
        {
            System.out.println("Given year is not a leap year");
        }
        }
        else
        {
            System.out.println("please enter correct input.....");
        }
    
    }
}
