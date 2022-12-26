import java.util.Scanner;
public class calci {

    public static void main(String[] args) {
        int cho,n1,n2;
        double sum=0;
        char user;
            try (Scanner sc = new Scanner(System.in)) {
                do{
                System.out.println("Please enter two numbers : ");
                n1=sc.nextInt();
                n2=sc.nextInt();
                System.out.println("Plese select type of calculation : ");
                System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
                cho=sc.nextInt();
                
      
                
                    switch(cho){
                case 1 : sum=n1+n2;
                         System.out.println("SUM : "+sum);   
                    break;
                case 2 : sum=n1-n2;
                System.out.println("SUM : "+sum);
                    break;
                case 3 : sum=n1*n2;
                System.out.println("SUM : "+sum);
                    break;
                case 4 : sum=n1/n2;
                System.out.println("SUM : "+sum);
                    break;
                default : System.out.println("Please select correct option!");
      
   }
   System.out.println("Do you wish to continue : ");
   user = sc.next().charAt(0);
   }while(user !='n' || user =='N');
            }
            //System.out.println("Result : "+sum);
}
    
}
