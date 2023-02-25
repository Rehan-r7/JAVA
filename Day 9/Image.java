//import java.awt.*;
import javax.swing.*;
public class Image
{
    JFrame jfr;
    JPanel jp;
    JLabel jl;
    JButton jb;
    ImageIcon im;
    Image()
    {
        jfr = new JFrame();
        
        jfr.setSize(600,600);
        jfr.setVisible(true);

        jp = new JPanel();

        jfr.add(jp);

        im = new ImageIcon("s.jpg");
        jl = new JLabel(im);
        jb = new JButton(im);
       
        jp.add(jl);
        jp.add(jb);

    }
    public static void main(String[] args) {
        new Image();
    }
}