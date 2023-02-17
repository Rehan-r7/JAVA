public class Ex_finally {
  int ar[] = new int[]{1,2,3};
  
  void show()
  {
   try {
    System.out.println(ar[10]);
   } catch (Exception e) {
    System.out.println("Exception type : "+e);
    // TODO: handle exception
   }
   finally
   {
    System.out.println("Finally block is always executed ! ");
   }
    
  }
  public static void main(String[] args) {
    Ex_finally ob = new Ex_finally();
    ob.show();
  }

}
