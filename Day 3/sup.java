class superclass
{
    int num;
    void f1()
    {
       System.out.println("Hello I am f1 of superclass"); 
    }
}
class sup extends superclass
{
    int num;
    void show()
    {
        super.num = 20;
        super.f1();
        num=10;
        System.out.println("Value(subclass) : "+num+" \nValue(superclass) : "+super.num);
    }
    public static void main(String[] args) {
        sup ob = new sup();
        ob.show();
    }
}
