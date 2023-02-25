import java.awt.*;
import java.awt.event.*;
public class app3 implements ActionListener
{
    Frame fr;
    Panel p;
    TextField tf1,tf2,tf3,tf4;
    TextArea ta;
    Label lb1,lb2,lb3,lb4,lb5;
    Button b1;
    
    app3()
    {
        fr = new Frame("Registration form ");
        fr.setSize(400,400);
        fr.setVisible(true);
        fr.setBackground(Color.GREEN);

        p = new Panel();
        fr.add(p);
        fr.setLayout(new FlowLayout());   
        p.setLayout(new GridLayout(6,2));

        lb1 = new Label("Enrollment no. : ");
        lb2 = new Label("Name : ");
        lb3 = new Label("Branch : ");
        lb4 = new Label("Semester : ");
        lb5 = new Label("Information : ");

        tf1 = new TextField(60);
        tf2 = new TextField(60);
        tf3 = new TextField(60);
        tf4 = new TextField(60);

        ta = new TextArea(null,5,5,6);
        b1 = new Button("Submit" );

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

        b1.addActionListener(this);
    }
   // @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1)
       {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        String s3 = tf3.getText();
        String s4 = tf4.getText();
        String s5 = "Details are : ";

        ta.setText(s5+"\n"+s1+"\n"+s2+"\n"+s3+"\n"+s4);
       }
    }
    public static void main(String[] args) {
        
        app3 ob = new app3();
    }
   
}
