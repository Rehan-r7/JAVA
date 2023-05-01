import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,value=0;
        n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int s = 1;s<=n-i;s++){
                System.out.print(" ");
            }
            value = i;
            for(int j=1;j<=i;j++){
              
                System.out.print(value);
                --value;
            }
        
            for(int k=1;k<=i;k++){
               
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
