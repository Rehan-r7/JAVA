import java.awt.*;
public class Ex_chkbox
{
    public static void main(String[] args) {
        Frame fr = new Frame();
        Panel p = new Panel();

        fr.setSize(400,400);
        fr.setVisible(true);

        fr.add(p);

        CheckboxGroup cbg = new CheckboxGroup();

        Checkbox ch1 = new Checkbox("Hi",true);// *Default selected
        Checkbox ch2 = new Checkbox("hello",false,cbg);// checkboxGroup use to group checkboxes in a particular
        Checkbox ch3 = new Checkbox("hlw",false,cbg);
        
        p.add(ch1);
        p.add(ch2);
        p.add(ch3);
    }
}