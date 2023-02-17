public class Ex_excep_4 {
    void f1() throws NullPointerException
    {
        System.out.println("Sample");
    }
    void f2() //throws NullPointerException *Doesn't have any effect on the output 
    {f1();}
    void f3() throws NullPointerException
    {f2();}
    public static void main(String[] args) {
        Ex_excep_4 ob = new Ex_excep_4();
        ob.f3();
    }
}
