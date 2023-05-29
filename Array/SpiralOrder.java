import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Row and Column size : ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int arr[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int row_start = 0;
            int row_end = r - 1;
            int col_start = 0;
            int col_end = c - 1;

            while (row_start <= row_end && col_start <= col_end) {

                // 1
                for (int col = col_start; col <= col_end; col++) {
                    System.out.print(arr[row_start][col] + "-> ");
                }

                row_start++;

                // 2
                for (int row = row_start; row <= row_end; row++) {
                    System.out.print(arr[row][col_end] + "-> ");
                }

                col_end--;

                // 3
                for (int col = col_end; col >= col_start; col--) {
                    System.out.print(arr[row_end][col] + "-> ");
                }

                row_end--;

                // 4
                for (int row = row_end; row >= row_start; row--) {
                    System.out.print(arr[row][col_start] + "-> ");
                }

                col_start++;
            }
        }
    }
}
