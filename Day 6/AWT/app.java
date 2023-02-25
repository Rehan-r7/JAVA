import java.awt.*;


public class app {
    public static void main(String[] args) {
        Frame fr = new Frame("AWT GUI APPLICATION");
        Panel p = new Panel();
        fr.setLayout(new FlowLayout());

        p.setLayout(new GridLayout(6,2));

        fr.setSize(400,400);
        fr.setVisible(true);

        fr.add(p);

        Label lb1 = new Label("Enter First Number : ");
        Label lb2 = new Label("Enter Second Number : ");
        Label lb3 = new Label("Enter Third Number : ");
        Label lb4 = new Label("#### AVERAGE ####");
        Label lb5 = new Label("Display the Result here....");

        TextField tf1 = new TextField(40);
        TextField tf2 = new TextField(40);
        TextField tf3 = new TextField(40);

        Button bt1 = new Button("COMPUTE");
        Button bt2 = new Button("REFRESH");
        Button bt3 = new Button("EXIT");

        p.add(lb1);
        p.add(tf1);
        System.out.println("");
        p.add(lb2);
        System.out.println("");
        p.add(tf2);
        System.out.println("");
        p.add(lb3);
        p.add(tf3);
        p.add(lb4);
        p.add(lb5);
        p.add(bt1);
        p.add(bt2);
        p.add(bt3);

    }
}
