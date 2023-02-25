public class Ex_wrapper2 {
    public static void main(String[] args) {
        Float a = new Float(3.2);//Works in older versions
        float f1 = a.floatValue();//Explicitly
        float f2 = a;//Unboxing ** Implicitly

        System.out.println(a+" "+f1+" "+f2);

    }
}
