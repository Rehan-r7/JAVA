//reference variable
public class ref{
    int x=10;
    public static void main(String[] args) {
        ref r;//refernce creation
       
        ref ob = new ref();
        r=ob;
        System.out.println(r.x);

    }
}
