public class Exthis
{
    int x;
    int y;

    void show()
    {
        int x= 1;
        int y = 2;

        this.x=10;
        this.y=20;
        System.out.println("Value : "+x+" "+y+" "+this.x+" "+this.y);    
    }
    void show(int x,int y)
    {
        this.x = x;
        this.y = y;
        System.out.println(this.x+"   "+this.y);
    }
    public static void main(String[] args) {
        Exthis ob = new Exthis();
        System.out.println("Constructor : -");
        ob.show();
        System.out.println("Parameterized Method():-");
        ob.show(5, 8);
    }
}