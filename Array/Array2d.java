import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Row and Column size : ");
            int row = sc.nextInt(); 
            int col = sc.nextInt();
            int arr[][] = new int[row][col];
            
            //input
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            //output
           System.out.print("Array :- \n");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j]+" ");
                }
              System.out.println();
            }
        }
    }
}
