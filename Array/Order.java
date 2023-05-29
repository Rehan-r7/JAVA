import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int A[] = new int[size];
            
            for (int i = 0; i < A.length; i++) {
                A[i] = sc.nextInt();
            }
            // Checking the Order i.e Ascending or Descending
            boolean check = true;
            for (int i = 0; i < A.length-1; i++) {
                if(A[i] > A[i+1])
                check = false;
            }
            if(check)
            System.out.println("Given Array is in Ascending Order");

            else
            System.out.println("Not Ascending");
        }
    }
}
