import java.awt.*;
public class Ex_panel {
    public static void main(String[] args) {
        Frame fr = new Frame();
        Panel p = new Panel();
        Label lb = new Label("Hello World");
        TextArea ta = new TextArea("TextArea",10,30,60);
        TextField tf = new TextField("TextField",50);
  
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.add(p);
        p.add(lb);
        p.add(tf);
        p.add(ta);
       

    }
}
