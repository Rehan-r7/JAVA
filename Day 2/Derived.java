import java.util.Scanner;
class Base
{
    String name;
    int age;

    Scanner sc = new Scanner(System.in);
    void getdata()
    {
     
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
    }
    void showdata()
    {
        System.out.println("Name : "+name);
        System.out.println("Name : "+age);
    }
}
class Derived extends Base
{
    Scanner scan = new Scanner(System.in);
    String email;
    void get_eid()
    {
        System.out.print("Enter your email Id : ");
        email = scan.nextLine();
    }
    void show_eid()
    {
        System.out.println("Email ID : "+email);
    }
    public static void main(String[] args) 
    {
        
        Derived d = new Derived();
        System.out.println("Enter your Details :- ");
        d.getdata();
        d.get_eid();
        System.out.println("Showing your Details :- ");
        d.show_eid();
        d.showdata();
    }
}
