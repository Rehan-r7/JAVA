/*define a class Base with data memebers string name,int age
and members methods are getBaseData().showBaseData() define sub class child with data members string branch int semester and member methods 
are getChildData() showChildData child is sub class that is derived from base super class initialize an ob of child class and access all its 
members methods as well as member methods of super class to show the existece of inheritance among them implement this in java*/
import java.util.Scanner;
class Base
{
    int age;
    String name;
    Scanner sc = new Scanner(System.in);
  void getBaseData()
  {
      System.out.print("Please enter your name : ");
      name = sc.next();
      System.out.print("Please enter your age : ");
      age = sc.nextInt();
  }
  void showBaseData()
  {
      System.out.println("Name : "+name);
      System.out.println("Age : "+age);
  }
}
class Child extends Base
{
       int sem;
       String branch;
       void getChildData()
       {
           System.out.println("Please enter your Branch : ");
           System.out.println("Please enter your Branch : ");
           branch = sc.next();
           System.out.print("Please enter your Semester : ");
           sem = sc.nextInt();
        }
        void showChildData()
        {
            System.out.println("Branch : "+branch);
            System.out.println("Semester : "+sem);
        }
    public static void main(String[] args) {
        Child ob = new Child();
        ob.getBaseData();
        ob.getChildData();
        ob.showBaseData();
        ob.showChildData();
        //System.out.println("Hello, World!");
    }
}
