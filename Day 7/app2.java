import java.awt.*;
import java.awt.event.*;
public class app2 implements ActionListener
{
    Frame fr;
    Button bt;
   Panel p;
    TextField tf1,tf2,tf3;
    Label lb1,lb2,lb3,lb4,lb5;
    
    Button b1,b2,b3;
    app2()
    {
        fr = new Frame("AWT GUI APPLICATION");
        fr.setSize(400,400);
        fr.setVisible(true);
        fr.setBackground(Color.GREEN);
        fr.setLayout(new FlowLayout()); 
        p = new Panel(); 
        fr.add(p);
        p.setLayout(new GridLayout(6,2));

        bt = new Button();
        bt.addActionListener(this);

        tf1 = new TextField(60);
        tf2 = new TextField(60);
        tf3 = new TextField(60);
      

        lb1 = new Label("ENTER FIRST NUMBER : ");
        lb2 = new Label("ENTER SECOND NUMBER ");
        lb3 = new Label("ENTER THIRD NUMBER ");
        lb4 = new Label("#### AVERAGE ####");
        lb5 = new Label("DISPLAY RESULT");


       b1 = new Button("COMPUTE");
       b2 = new Button("REFRESH");
       b3 = new Button("EXIT");

       p.add(lb1);
       p.add(tf1);

       p.add(lb2);
       p.add(tf2);

       p.add(lb3);
       p.add(tf3);

       p.add(lb4);
       p.add(lb5);     

       p.add(b1);
       p.add(b2);
       p.add(b3);

       b1.addActionListener(this); 
       b2.addActionListener(this); 
       b3.addActionListener(this); 

    }
    @Override
    public void actionPerformed(ActionEvent e) {
      
      String s1,s2;
      int a,b,c;
      float f = 0;
      
       if(e.getSource() == b1)
      {
        s1 = tf1.getText();
      s2 = tf2.getText(); //I method    **
      
      a = Integer.parseInt(s1);
      b = Integer.parseInt(s2);
      c = Integer.parseInt(tf3.getText().toString()); // II method
        
        f = (a+b+c)/3;
        
      }
      else if(e.getSource() == b2)
      {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
      }
      else
      {
        System.exit(0);
      }
      String result = String.valueOf(f);
      lb5.setText(result);
      
    }
    public static void main(String[] args) {    
      app2 obj = new app2();
    }
   
}
