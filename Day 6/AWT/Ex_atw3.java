import java.awt.*;
public class Ex_atw3 {
    public static void main(String[] args) {
        Frame fr = new Frame();                 //*Only one method can be called through Frame*
        //Label lb = new Label("Heloo");
        //TextArea ta = new TextArea(10,50);
        TextField tf = new TextField("hi",50);
        fr.setSize(1000,700);
        fr.setVisible(true);
        //fr.add(lb);
        //fr.add(ta);
        fr.add(tf);
    }
}
