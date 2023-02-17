public class Ex_throw2 {
    void f1()
    {
        try {
            throw new NullPointerException("W");
    
        } catch (Exception e) {
            
            try {
                throw e;
    
            } catch (Exception e2) {
                System.out.println("Exception Re-throw : "+e2);
                // TODO: handle exception
            }
                    }
        
    }   
    public static void main(String[] args) {
        Ex_throw ob = new Ex_throw();
        //System.out.println("he");

        ob.f1();
    }
}
