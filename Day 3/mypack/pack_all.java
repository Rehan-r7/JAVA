//package packages;
import p1.*;// 1st method 
import p2.A2;// 2nd method  || two steps->step.1
import p3.A3;
public class pack_all {
    public static void main(String[] args) {
        p1.A1 ob1 = new p1.A1();//step.2		
        A2 ob2 = new A2();
        A3 ob3 = new A3();
        ob1.show1(); 
        ob2.show2();
        ob3.show3();
    }
}
