import java.util.Scanner;
class Employee {
 int id;
 String firstName;    
 String lastName;
 int salary;
 int count=0;
 Scanner sc = new Scanner(System.in);
 Employee(int id1,String fn,String ln,int sl  )
 {
    id = id1;
    firstName = fn;    
    lastName = ln ;
    salary = sl;
 }
 int getID()
 {
    count++;
    return id; 
}
 String getFirstName()
 {return firstName;}
 String getLastName()
 {return lastName;}
 String getName()
 {return (firstName+""+lastName);}
 int getSalary()
 {return salary;}

 void setSalary()
 {
    int hra,da;
    System.out.print("Enter hra & da : ");
    hra = sc.nextInt();
    da = sc.nextInt();
    salary+=hra+da;
 }
 int getAnnualSalary()
 { 
    return (salary*12);
    }
 int raiseSalary(int percent)
 {
    int p;
    p = (salary*(percent/100));  
    salary+=p;
    return p;
 }
//  String toString()
//  {
//     return 
//  }
 public static void main(String[] args) {
    Employee ob = new Employee(187, "Rehan", "Khan", 10000);
    System.out.println("Showing Details: -");
    System.out.println(ob.getID());
    System.out.println(ob.getFirstName());
    System.out.println(ob.getLastName());
    System.out.println(ob.getName());
    System.out.println(ob.getSalary());
    ob.setSalary();
    System.out.println(ob.getAnnualSalary());
    System.out.println(ob.raiseSalary(10));
    




 }
}
