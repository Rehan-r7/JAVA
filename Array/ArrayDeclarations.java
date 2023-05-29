import java.util.Scanner;
public class ArrayDeclarations{
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the size of the Array 3 : ");
        int size = sc.nextInt();
        int a1[] = new int[5];
        int a2[] = {1,2,3,4,5};
        int a3[] = new int[size]; 
        a1[0] = 5;
        a1[1] = 4;
        a1[2] = 3;
        a1[3] = 2;
        a1[4] = 1;
        System.out.println("\nArray-1 : ");
        for(int i = 0;i<5;i++)
        {
            System.out.print(a1[i]+" ");
        }
        System.out.println("\nArray-2 : ");

        for(int i = 0;i<5;i++)
        {
            System.out.print(a2[i]+" ");
        }
        System.out.print("\nEnter the elements in Array-3 : ");
        for(int i = 0;i<size;i++)
        {
            a3[i] = sc.nextInt();
        }
        System.out.println("Array-3 : ");

        for(int i = 0;i<5;i++)
        {
            System.out.print(a3[i]+" ");
        }
    }
    }
}
