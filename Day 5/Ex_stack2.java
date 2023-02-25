import java.util.*;
public class Ex_stack2 {
 public static void main(String[] args) {
    int choice,data;
    char user;
    try (Scanner sc = new Scanner(System.in)) {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("**----Stack----**");
        do{
            System.out.print("1.PUSH\n2.POP\n3.DISPLAY\nPlease enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 : System.out.print("Enter an Integer to add : ");
                        data = sc.nextInt();
                        st.push(data);
                    break;
                case 2 : st.pop();
                    break;
                case 3 : System.out.println(st);
                    break;
            
                default:System.out.println("Please enter a valid choice!!!");
                    break;
            }
                System.out.print("Do you want to continue: ");
                user = sc.next().charAt(0);
        }while(user != 'n' || user != 'N');
    }

 }   
}
