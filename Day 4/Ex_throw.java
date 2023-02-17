public class Ex_throw {
    void f1()
    {
        try {
            throw new NullPointerException("Demo");
    
        } catch (NullPointerException e) {
            
            System.out.println("Exception : "+e);
            // TODO: handle exception

        }
        
    }   
    public static void main(String[] args) {
        Ex_throw ob = new Ex_throw();
        ob.f1();
        /*
         *try {
            ob.f1();
        } catch ((NullPointerException  e) {
            System.out.println("Exception : "+e);
            // TODO: handle exception
        }  
         */
        
    } 
}
