/* define interface I1 with show method define classes c1 with data members String name,
  class c2 with data memnber int age and class c3 with data member String email all three 
  classes will implement I1 
 */
/*create three packages p1,p2,p3 create another class and import classes of all packages
 */
 interface I1{
    void show();
}
class c1 implements I1
{
  String name = "Rehan khan";
    public void show()
   {
    System.out.println("Hello I am I1 in c1");
    System.out.println("Name : "+name);
   }
}
class c2 implements I1
{
  int age=19;
 
  public void show()
  {
    System.out.println("Hello I am I1 in c2");
    System.out.println("Age : "+age);
  }
}

class c3 implements I1
 {
  String email="rehakan@gmail.com";   
  public void show()
  {
    System.out.println("Hello I am I1 in c3");
    System.out.println("Email : "+email);
  }
  
  public static void main(String[] args) {
    I1 ref;
    c1 ob1 = new c1();
    c2 ob2 = new c2();
    c3 ob3 = new c3();
    ref = ob1;
    ref.show();
    ref = ob2;
    ob2.show();
    ref = ob3;    
    ob3.show();
 }
}
