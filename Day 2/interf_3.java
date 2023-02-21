interface I1
{
    void f1();
}
abstract class abt implements I1
{
    public void f1()
    {
        System.out.println("Hello I am f1 (of Interface) in Abstract class ");
    }
    abstract void f2();
}
class interf_3 extends abt
{
    void f2()
    {
        System.out.println("Hello I am f2 (of abstract) in subclass ");
    }
    public static void main(String[] args) {
        interf_3 ob = new interf_3();
        ob.f1();
        ob.f2();
     }
}
