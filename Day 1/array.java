//Array 
import java.util.Scanner;
public class array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ar[][] = new int[2][2];
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			System.out.print("Enter values : ");
			ar[i][j]=sc.nextInt();
			}
			
		} 
		System.out.println("Array : ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
	
			System.out.print(ar[i][j]+"\t");
			
			}
			System.out.println("");
		} 		
	}
} 