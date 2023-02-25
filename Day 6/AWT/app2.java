import java.awt.*;
public class app2 {
    public static void main(String[] args) {
        Frame fr = new Frame("Registration form ");
        fr.setSize(400,400);
        fr.setVisible(true);
        
        fr.setBackground(Color.GREEN);
        Panel p = new Panel();
        fr.add(p);
    
        fr.setLayout(new FlowLayout());   
        p.setLayout(new GridLayout(6,2));

        Label lb1 = new Label("Enrollment no. : ");
        Label lb2 = new Label("Name : ");
        Label lb3 = new Label("Branch : ");
        Label lb4 = new Label("Semester : ");
        Label lb5 = new Label("Information : ");

        TextField tf1 = new TextField(60);
        TextField tf2 = new TextField(60);
        TextField tf3 = new TextField(60);
        TextField tf4 = new TextField(60);

        TextArea ta = new TextArea(null,5,5,6);

        Button b1 = new Button("Submit");

        p.add(lb1);
        p.add(tf1);

        p.add(lb2);
        p.add(tf2);

        p.add(lb3);
        p.add(tf3);

        p.add(lb4);
        p.add(tf4);

        p.add(lb5);
        p.add(ta);

        p.add(b1);






    }
}
