import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ex_tab2 implements ActionListener
{
    JFrame fr;
    JPanel jp1,jp2,jp3,jp4,jp5,jp6;
    JButton jb1,jb2;
    JTabbedPane jt;
    JLabel jl1,jl2,jl3,jl4;
    JTextField tf1,tf2,tf3;
    JTextArea ta;
    Ex_tab2()
    {
        fr = new JFrame();
        fr.setSize(600,600);
        fr.setVisible(true);

        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        jp5 = new JPanel();
        jp6 = new JPanel();

      // jp4.setLayout(new GridLayout(3,1));
        
        fr.add(jp1);
        fr.add(jp2);
        fr.add(jp3);
        fr.add(jp4);

        

        jl1 = new JLabel("NAME : ");
        jl2 = new JLabel("BRANCH : ");
        jl3 = new JLabel("SEMESTER : ");
        jl4 = new JLabel("DETAILS : ");

        tf1 = new JTextField(30);
        tf2 = new JTextField(30);
        tf3 = new JTextField(30);

        ta = new JTextArea(10,20);

        jb1 = new JButton("SHOW");
        jb2 = new JButton("EXIT");
      
        jp1.add(jl1);
        jp1.add(tf1);

        jp2.add(jl2);
        jp2.add(tf2);

        jp3.add(jl3);
        jp3.add(tf3);

       
       // jp4.add(ta);
       
       jp4.setLayout(new GridLayout(2,1));
       jp4.add(jp5);
        jp4.add(jp6);
       
        jp5.add(jl4);
        jp5.add(ta);
        jp6.add(jb1);
        jp6.add(jb2);

        jt = new JTabbedPane();
        
        jt.addTab("NAME",jp1);
        jt.addTab("BRANCH",jp2);
        jt.addTab("SEMESTER",jp3);
        jt.addTab("RESULT",jp4);

        fr.add(jt);        

       jb1.addActionListener(this);
       jb1.addActionListener(this);

       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jb1) {
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            String s3 = tf3.getText();
            
            ta.setText(s1+"\n"+s2+"\n"+s3);
        }
        if (e.getSource() == jb2)
         {
            fr.dispose();    
        }
        
    }
    public static void main(String[] args) {
        new Ex_tab2();
    }
    
}
