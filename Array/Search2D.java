import java.util.Scanner;
public class Search2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt(); 
            int col = sc.nextInt();
            int arr[][] = new int[row][col];
            
            //input
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter an element to search : ");
            int x = sc.nextInt();
            //search given element
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i][j] == x)
                    System.out.println("Element found at index arr["+i+"]["+j+"]");
                }
            }
        }
    }
}
