import java.util.Scanner;;
public class volume_func {
    int vol(int x,int y,int z)
    {return (x*y*z);}
    public static void main(String[] args) {
        volume_func ob = new volume_func();
        try (Scanner sc = new Scanner(System.in)) {
            int l,b,h;
            System.out.println("Please enter the Dimensions :- ");
            System.out.print("ENTER LENGTH : ");
            l = sc.nextInt();
            System.out.print("ENTER BREADTH : ");
            b = sc.nextInt();
            System.out.print("ENTER HEIGHT : ");
            h = sc.nextInt();
            System.out.print("Volume of given box is : "+ob.vol(l,b,h));
        }
    }
}
