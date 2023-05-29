import java.util.Scanner;
public class Search2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Row and Column size : ");
            int row = sc.nextInt(); 
            int col = sc.nextInt();
            int arr[][] = new int[row][col];
            
            //input
            System.out.print("Enter the Elements in the Array :-\n");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter an element to search : ");
            int x = sc.nextInt();
            //search given element
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if(arr[i][j] == x)
                    System.out.println("Element found at index arr["+i+"]["+j+"]");
                }
            }
        }
    }
}
