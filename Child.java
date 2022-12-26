/*define a class base with member methods define sublcass chlid inherite the property of base class child
modifies the defnition of show method proof that for derived method show method two different definition 
exist both the class*/
class Base
{
    void show()
    {
        System.out.println("I am Base class!");
    }
}

class Child extends Base
{
    void show()
        {
            System.out.println("I am Child class!");
        }
        public static void main(String[] args) {
            Base b;
            Base ob1 = new Base();
            Base ob2 = new Child();
            b=ob1;b.show();
            b=ob2;b.show();
        }
}

