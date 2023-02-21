//wap in java to take 10 integers values and display the result
import java.util.Scanner;

public class loop
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);	
		int x;
		int i=0;
		while(i!=10)
		{
			System.out.print("Enter value : ");
			x=sc.nextInt();
			System.out.println(" value : "+x);
			i++;		
		}
	}
}