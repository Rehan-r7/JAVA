import java.util.*;
public class Ex_list {
    private static Iterator<String> iterator;

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<String>();
        list.add("Rehan");
        list.add("Rohan");
        list.add("Rahul");
        list.add("Rohi");
        list.add("Rohit");
        //list.add("Rohan");
        //String last = list.get(list.size()-1);
        
        list.removeIf(n -> (n.charAt(n.length()-1)== 'i'  ));
        System.out.println(list);
        //list.remove(1);
        iterator = list.iterator();//print a list in sequence(new line i.e \n)
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
    
            }
        // System.out.println(list);
        // System.out.println(list.size());
        
       
    }
}
