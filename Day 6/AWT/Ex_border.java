import java.awt.*;
public class Ex_border {
    public static void main(String[] args) {
        Frame fr = new Frame();
        fr.setSize(400,400);
        fr.setVisible(true);
        Button b1 = new Button("Top");
        Button b2 = new Button("Bottom");
        Button b3 = new Button("Center");
        Button b4 = new Button("Left");
        Button b5 = new Button("Right");

        BorderLayout ob = new BorderLayout();

        fr.setLayout(ob);
        fr.add(b1,BorderLayout.NORTH);
        fr.add(b2,BorderLayout.SOUTH);
        fr.add(b3,BorderLayout.CENTER);
        fr.add(b4,BorderLayout.WEST);
        fr.add(b5,BorderLayout.EAST);
      
}
}
