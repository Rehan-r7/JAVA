import java.util.Scanner;;
public class func {
    int a;
    void getdata()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            a=sc.nextInt();
        }
    }
    int logic()
    {
        int r;
        int sum=0;
        while(a!=0)
        {
            r=a%10;
            sum+=r;
            a=a/10;

        }
        return sum;
    }
    public static void main(String[] args) {
        func ob = new func();
        ob.getdata();
        System.out.println("Value is : "+ob.logic());
    }
}
