public class Ex_throws //Two Ways
 {
void show()//throws NullPointerException **declarative statement
{
  throw new NullPointerException();    //not necessary
}    
public static void main(String[] args) throws NullPointerException 
{                                     /* propagation */
    Ex_throws ob = new Ex_throws();
    ob.show();
}
}
