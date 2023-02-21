class Base
{
    void show()
    {
        System.out.println("Hello I am show method of base class");
    }
}
class exe1 extends Base
{
    void show()
    {
        super.show();
        System.out.println("Hello I am show method of sub class ");
    }    
    public static void main(String[] args) {
        exe1 ob = new exe1();
        ob.show();
    }
}
