import javax.swing.*;

public class Ex_Joption {

    JFrame fr;

    Ex_Joption() {
        fr = new JFrame("J OPTION PANE EXAMPLE");
        fr.setSize(600, 600);
        fr.setVisible(true);
        String name = JOptionPane.showInputDialog(fr, "Please enter your name : ");
        JOptionPane.showMessageDialog(fr, "Your name is " + name);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Ex_Joption();
    }
}
