class superclass
{
    superclass()
    {
        System.out.println("Hello I am constructor of Superclass");
    }
}

class sup_2 extends superclass
{
    sup_2()
    {
        super();
       System.out.println("Hello I am constructor of subclass");  
    }
    public static void main(String[] args) {
        sup_2 ob = new sup_2();
       
    }
}
