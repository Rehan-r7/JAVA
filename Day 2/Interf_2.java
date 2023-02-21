/*wap in java implement interface create three interface i1,i2,i3.
i3 inherited to i2 and i2 inherited to i1 create a class PQR this class inherited to i3*/
interface I1
{
    void f1();
}
interface I2 extends I1
{
    void f2();  
}
interface I3 extends I2
{
    void f3();
}
class Interf_2 implements I3
{
    public void f1()
    {System.out.println("Hello  I am f1 in I1");}
    public void f2()
    {System.out.println("Hello  I am f2 in I2");}
    public void f3()
    {System.out.println("Hello  I am f3 in I3");}
    public static void main(String[] args) {
        Interf_2 ob = new Interf_2();
        ob.f1();
        ob.f2();
        ob.f3();

    }
}
