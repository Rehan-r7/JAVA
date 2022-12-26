

public class copy {
    int l,b,h;
    int f1(int x,int y,int z)
    {
        l=x;
        b=y;
        h=z;
        return (l*b*h);
    }
    public static void main(String[] args) {
        copy ob = new copy();
        System.out.println("volume = "+ob.f1(2, 3, 4));
    }
}
