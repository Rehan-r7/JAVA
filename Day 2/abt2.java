abstract class Eg {
    abstract void f1();
    void f2()
    {
        System.out.println("Hello I am f2 in class Eg");
    }
}
class A extends Eg{
    void f1()
    {
        System.out.println("Hello I am F1 in class A");
    }
}
class abt2 extends Eg
{
    void f1()
    {
        System.out.println("Hello I am f1 in class abt");
    }
    public static void main(String[] args) {
        Eg ref;
       
        A ob1 = new A();
        ref = ob1;
        ref.f1();
        ref.f2();
        
        abt2 ob2 = new abt2();
        ref = ob2;
        ref.f1();
        ref.f2();      
       
      
    }
}
