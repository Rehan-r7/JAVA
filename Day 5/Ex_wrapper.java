public class Ex_wrapper
{
    public static void main(String[] args) 
    {
        int a = 20;
        //** Converting int to Integer**
        Integer i = Integer.valueOf(a);//Explicitely by the programmer
        Integer j = a;//Implicitly by the JVM **Autoboxing**
        System.out.println(a+" "+i+" "+j);
    }
}