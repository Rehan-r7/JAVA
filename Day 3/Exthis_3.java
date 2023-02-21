public class Exthis_3 {
    Exthis_3()
    {
        this(4);
        System.out.println("Hello I am default constructor ");
        
    }
    Exthis_3(int x)
    {
        System.out.println("Hello I am parameterized constructor");
        System.out.println("value : "+x);
    }
    /*void show()
    {
        this(4);   // You cannot call a constructor in another function it can only be called
                        in another constructor
    }*/
    public static void main(String[] args) {
        Exthis_3 ob = new Exthis_3();
    }
}
