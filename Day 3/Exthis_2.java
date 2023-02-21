public class Exthis_2 {
   Exthis_2()//By constructor
   {
    this.show();
   }
    void display()//By another method
   {
    System.out.println("Hello I am display method");
    this.show();
   }
    void show()
    {
        System.out.println("Hello I am show method");
    }
    public static void main(String[] args) {
        Exthis_2 ob = new Exthis_2();
        ob.display();
    }
}
