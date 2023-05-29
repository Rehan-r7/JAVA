import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the Array :");
            int size = sc.nextInt();
            int A[] = new int[size];
            
            for (int i = 0; i < A.length; i++) {
                A[i] = sc.nextInt();
            }
            
             int min = A[0];
             int max = A[0];
          
            for (int i = 0; i < A.length; i++) {
                if(A[i] < min) 
                min = A[i];
                
                else if(A[i] > max)
                max = A[i];
            }
            System.out.println("Largest : "+max+" & Smallest : "+min);
        }
    }
}
