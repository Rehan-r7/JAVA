import java.awt.*;
import java.awt.event.*;
public class app5 implements ActionListener,ItemListener
{
    Frame fr;
    Button bt;
   Panel p;
    TextField tf1,tf2,tf3,tf4;
    Label lb1,lb2,lb3,lb4,lb5,lb6;
    
    Button b1,b3;
    Checkbox chk;
    app5()
    {
        fr = new Frame("AWT GUI APPLICATION");
        fr.setSize(400,400);
        fr.setVisible(true);
        fr.setBackground(Color.GREEN);
        fr.setLayout(new FlowLayout()); 
        p = new Panel(); 
        fr.add(p);
        p.setLayout(new GridLayout(7,2));

        bt = new Button();
        bt.addActionListener(this);

        tf1 = new TextField(60);
        tf2 = new TextField(60);
        tf3 = new TextField(60);
        tf4 = new TextField(60);
      

        lb1 = new Label("ENTER FIRST NUMBER : ");
        lb2 = new Label("ENTER SECOND NUMBER ");
        lb3 = new Label("ENTER THIRD NUMBER ");
        
        lb6 = new Label("SUM OF THREE NUMBERS : ");
      
        lb4 = new Label("#### AVERAGE ####");
        lb5 = new Label("DISPLAY RESULT");
        


       b1 = new Button("SHOW RESULT");
       //b2 = new Button("REFRESH");
       b3 = new Button("EXIT");

      chk = new Checkbox("CLICK TO ENABLE RESULT BUTTON");

       p.add(lb1);
       p.add(tf1);

       p.add(lb2);
       p.add(tf2);

       p.add(lb3);
       p.add(tf3);

       p.add(lb6);
       p.add(tf4);

       p.add(lb4);
       p.add(lb5);     

      
     
       p.add(b3);
       p.add(chk);
       p.add(b1);
       b1.setVisible(false);
       
       //p.add(b3);

       b1.addActionListener(this); 
       b3.addActionListener(this); 
       chk.addItemListener(this);
       //b3.addActionListener(this); 

    }
    @Override
    public void actionPerformed(ActionEvent e) {
      
      String s1,s2;
      int a,b,c,sum=0;
      float f = 0;
      
       if(e.getSource() == b1)
      {
        s1 = tf1.getText();
      s2 = tf2.getText(); //I method    **
      
      a = Integer.parseInt(s1);
      b = Integer.parseInt(s2);
      c = Integer.parseInt(tf3.getText().toString()); // II method
        
      sum = a+b+c;  
      f = (a+b+c)/3;
        
      }
      else if(e.getSource() == b3)
      {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
      }
      else
      {
        System.exit(0);
      }
     String result1 = String.valueOf(sum);
     String result2 = String.valueOf(f);  
      
     tf4.setText(result1);
     lb5.setText(result2);
      
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
            if (e.getSource()==chk) {
                if (chk.getState()==true) {
                    b1.setVisible(true);
                }
                else
                {
                    b1.setVisible(false);
                }
            }
    }
    public static void main(String[] args) {    
      new app5();
    }   
}
