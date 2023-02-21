class A
{
    void f1()
    {
        System.out.println("Hi I am class A");
    }
}

class B extends A 
{   
    void f2()
    {
        System.out.println("Hi I am class B");

    }
    public static void main(String[] args) {
        B ob = new B();
        ob.f1();
        ob.f2();

    }
}
