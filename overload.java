//define a class Compute with overloaded methods void add()  int add(int.int) double add(double,double,double) implement this in java
public class overload {
    int x=10;
    int y=20;
    void add()
    {
        System.out.println("Method-1 void add() :-");
        System.out.println("Sum is : "+(x+y));
    }
    int add(int a,int b)
    {
        System.out.println("\nMethod-2 int add(int,int) :-");
        return (a+b);
    }
    double add(double a,double b,double c)
    {
        System.out.println("\nMethod-3 double add(double,double,double) :-");
        return (a+b+c);
    }
public static void main(String[] args) {
        overload ob = new overload();
        ob.add();
        System.out.println("Sum is : "+ob.add(30, 40) );
        System.out.println("Sum is : "+ob.add(1.5, 1.5, 7));
    }
}
