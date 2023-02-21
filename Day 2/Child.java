class Base1
{
    void show()
    {
        System.out.println("Hi I am base class");
    }
}
class Child extends Base1
{
    void show()
    {
        System.out.println("Hi I am derived class");
    }    
    public static void main(String[] args) {
        /*Base ob1 = new Base();
        Base ob2 = new Child();
        ob1.show();
        ob2.show();*/
        Base1 ref;                  //Run-time polymorphism
        Base1 ob1 = new Base1();
        Child ob2 = new Child();
        ref = ob1;
        ref.show();
        ref = ob2;
        ref.show();    
    }
}
