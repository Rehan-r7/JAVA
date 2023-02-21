import java.util.Scanner;
class Student {
    String name;
    int age ;
    float cgpa;
    Scanner sc = new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter your Details:- ");
        System.out.print("Enter your Name : ");
        name = sc.nextLine();
        System.out.print("Enter your Age : ");
        age = sc.nextInt();
        System.out.print("Enter your CGPA : ");
        cgpa = sc.nextFloat();
    }
    void showdata()
    {
        System.out.println("Showing Details :-");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("CGPA : "+cgpa);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size;
            System.out.print("Enter the number of students : ");    
            size = sc.nextInt();
            
            Student st[] = new Student[size];

            for(int i=0;i<size;i++)
            {
                st[i] = new Student();
            }    
            for(int i=0;i<size;i++)
            {
                st[i].getdata();
            }
                 
            for(int i=0;i<size;i++)
            {
                st[i].showdata();
            }
        }
       
                   
    }
}
