public class Ex_excep
{
    int x = 10;
    int y = 2 ;
    void show()
    {
        try {
            System.out.println("Value : "+x/0);
    
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception throw type : "+e);
        }
            }
    public static void main(String[] args) {
        Ex_excep ob = new Ex_excep();
        ob.show();
    }
}