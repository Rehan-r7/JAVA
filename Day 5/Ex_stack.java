import java.util.*;
public class Ex_stack {
    private static Iterator<String> iterator;

    public static void main(String[] args) {
        
        Stack<String>stack = new Stack<String>();
    stack.push("Rohi");
    stack.push("Rahul");
    stack.push("Rohan");
    
    System.out.println(stack.peek()); 
    System.out.println(stack);
    stack.pop();
    System.out.println(stack.isEmpty());
    iterator = stack.iterator();
    
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }

    }
    
}
