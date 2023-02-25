import javax.swing.*;
public class Ex_tab {
    JFrame fr;
    JPanel jp1,jp2;
    JTabbedPane jt;
    Ex_tab()
    {
        fr = new JFrame();
        fr.setSize(600,600);
        fr.setVisible(true);
        jp1 = new JPanel();
        jp2 = new JPanel();

        fr.add(jp1);
        fr.add(jp2);

        jt = new JTabbedPane();
        
        jt.addTab("HOME", jp1);
        jt.addTab("SECURITY", jp2);

        fr.add(jt);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new Ex_tab();
    }
}
