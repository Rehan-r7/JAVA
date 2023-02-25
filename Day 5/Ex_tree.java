import java.util.*;
public class Ex_tree {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num,n;
            System.out.print("Enter the size :  ");
            n = sc.nextInt();        
                    
            
            TreeSet<Integer> t_set = new TreeSet<Integer>();
            System.out.print("Enter the numbers :  ");
            
            for(int i =0 ;i<n;i++)
            {
                num = sc.nextInt();
                t_set.add(num);
            }
                System.out.println(t_set);//Implicitly ascending Order!
                TreeSet<Integer> res = (TreeSet<Integer>)t_set.descendingSet();//*Explicitly*for descending Order
                System.out.println(res);
                
        }
    }
}
