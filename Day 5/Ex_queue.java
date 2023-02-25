import java.util.*;

public class Ex_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println("Printing Queue : - ");
        System.out.println(q);
        System.out.println("Removing first element !");
        q.remove();
        System.out.println(q);
        System.out.println("Removing element and printing it : " + q.poll());
        q.removeAll(q);
        System.out.println("Removing all elements ! ");
        System.out.println(q);
    }
}
