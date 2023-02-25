import java.awt.*;
import java.awt.event.*;

public class Ex_listen implements KeyListener
 {
    Frame fr;
    Label lb;
    TextArea ta;
    Ex_listen()
    {
        fr = new Frame("My frame");
        lb = new Label();
        ta = new TextArea(5,7);

        fr.setSize(400,400);
        fr.setVisible(true);

        fr.add(lb);
        fr.add(ta);

        ta.addKeyListener(this);
    }
    public void keyPressed(KeyEvent ob)
    {
        ta.setText("Key is pressed ");
    }
    public void keyTyped(KeyEvent ob)
    {
        ta.setText("Key is Typed ");
    }
    public void keyReleased(KeyEvent ob)
    {
        ta.setText("Key is Released ");
    }
    public static void main(String[] args) {
        Ex_listen ob = new Ex_listen();
    }
}
