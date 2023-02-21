abstract class A{
    abstract void f1();
    void f2()
    {
        System.out.println("Hello I am f2");
    }
}
class B extends A//single inheritance
{
    B()//checking inheritance
    {
        System.out.println("Hello I am class B");
    }
    
    void f1()
    {
        System.out.println("Hello I am f1 in B class");
    }
    // public static void main(String[] args) {
    //     abt ob = new abt();
    //     ob.f1();
    //     ob.f2();
    // }
}
class abt extends B//Multilevel inheritance
{
    void f1()
    {
        System.out.println("Hello I am f1 in class abt");
    }
    public static void main(String[] args) {
        
        abt ob = new abt();
        ob.f1();//Last overrriden method is printed no matter if it is inherited or not
        ob.f2();
    }
}
