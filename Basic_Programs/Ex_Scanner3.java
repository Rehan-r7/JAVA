import java.util.Scanner;
public class Ex_Scanner3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a; float b; double c; String  sh;
		System.out.println("enter input : ");
		a=scan.nextInt();
		System.out.println("enter input : ");
		b=scan.nextFloat();
		System.out.println("enter input : ");
		c=scan.nextDouble();	
		System.out.println("enter input : ");
		sh=scan.next();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(sh);
	}
}
