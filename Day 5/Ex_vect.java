import java.util.*;

public class Ex_vect {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>(3,2);
        vec.add(2); 
        vec.add(4); 
        vec.add(5); 
        vec.add(6); 
        vec.add(8); 
        vec.add(9); 
        System.out.println(vec);
        System.out.println("Capacity : "+vec.capacity());
        System.out.println("Size : "+vec.size());
    }
}
