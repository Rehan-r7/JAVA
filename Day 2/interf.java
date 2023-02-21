interface A
{
    void f1();
    void f2();
}
class interf implements A
{
    public void f1()
    {
        System.out.println("Hello I am f1 in interf");
    }
    public void f2()
    {
        System.out.println("Hello I am f2 in interf");
    }
    public static void main(String[] args) {
        interf ob = new interf();
        ob.f1();
        ob.f2();
    }
}