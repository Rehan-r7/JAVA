/*define a class student with data members String name,int age, float cgpa, member methods getdata and showdata 
for taking input and displaying output rest. initialize object of this class and read the value from 
user and print the result implement this scenario in java */
import java.util.Scanner;
public class student{
    
    String name;
    int age;
    float cgpa;
    
    Scanner sc = new Scanner(System.in);
    void getData(){
         
        System.out.println("*--Please enter student details--*");
        System.out.print("Please enter your name : ");
        name = sc.next();
        System.out.print("Please enter your Age : "); 
        age = sc.nextInt();
        System.out.print("Please enter your CGPA : ");
        cgpa = sc.nextFloat();
    }
    
    void showData(){
        System.out.println("\nShowing the enterd information :- ");
        System.out.println("Name = " +name);
        System.out.println("Age = " +age);
        System.out.println("CGPA = " +cgpa);
    }
    
    public static void main(String args[]) {
      student ob = new student();
      ob.getData();
      ob.showData();
    }
}
