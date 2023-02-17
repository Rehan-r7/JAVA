public class Ex_excep_2 {
    int ar[] = new int[]{1,2,3}; 
    //ar[4] = 6;
    void show()
    {
        try {
            System.out.println(ar[3]);
        } catch (Exception e) {
            System.out.println("Exception thrown type : "+e);
        }        
    }
    public static void main(String[] args) {
        Ex_excep_2 ob = new Ex_excep_2();
        ob.show();
    }
}
