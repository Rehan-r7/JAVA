//calci by if_else && switch 
import java.util.Scanner;
public class calci
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sum,ch;
		char user;
		int a,b;
		System.out.print("Enter two values : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("1.Add\n2.Subtract\n3.Multiply\n4.Division\n");	
		System.out.print("Enter your choice : ");
		ch = sc.nextInt();	
		
		/*if(ch==1)
		{
			sum = a+b;
			System.out.print("\n");
			System.out.print("Sum : "+sum);
		}
		else if(ch==2)
		{
			sum = a-b;
			System.out.print("\n");
			System.out.print("Sum : "+sum);
		}
		else if(ch==3)
		{
			sum = a*b;
			System.out.print("\n");
			System.out.print("Sum : "+sum);
		}
		else if(ch==4)
		{
			if(a>b)
			{
			sum = a/b;
			System.out.print("\n");
			System.out.print("Sum : "+sum);
			}
			else
			{
				System.out.print("A should be greater than B");
			}	
		}
		else
		{
			System.out.print("Invalid value!!!!");
		}*/
		switch(ch)
		{
			case 1 :	sum = a+b;
				System.out.print("\n");
				System.out.print("Sum : "+sum);break;
			case 2 :	sum = a-b;
				System.out.print("\n");
				System.out.print("Sum : "+sum);
				break;
			case 3 :	sum = a*b;
				System.out.print("\n");
				System.out.print("Sum : "+sum);
				break;
			case 4 :	sum = a/b;
				System.out.print("\n");
				System.out.print("Sum : "+sum);
				break;
			default :  System.out.print("Invalid value!!!!");break;
		}
	
	}
} 