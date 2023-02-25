import java.awt.*;
import java.awt.event.*;

public class app4 implements ItemListener, ActionListener {
   Frame fr;
   Panel p1, p2, p3, p4;
   Checkbox chk1, chk2;
   CheckboxGroup cbg;
   Choice ch;
   List l;
   Button b;
   Label l1, l2, l3;

   app4() {
      fr = new Frame();

      p1 = new Panel();
      p2 = new Panel();
      p3 = new Panel();
      p4 = new Panel();

      cbg = new CheckboxGroup();

      chk1 = new Checkbox("Male", cbg, false);
      chk2 = new Checkbox("Female", cbg, false);

      b = new Button("EXIT");

      ch = new Choice();

      l1 = new Label();
      l2 = new Label();
      l3 = new Label();

      l = new List();

      fr.setSize(600, 600);
      fr.setVisible(true);
      fr.setLayout(new FlowLayout());
      fr.setLayout(new GridLayout(4, 1));

      fr.add(p1);
      fr.add(p2);
      fr.add(p3);
      fr.add(p4);

      p1.setBackground(Color.CYAN);
      p1.add(chk1);
      p1.add(chk2);
      p1.add(l1);
     

      ch.addItem("choice item 1");
      ch.addItem("choice item 2");
      ch.addItem("choice item 3");

      p2.setBackground(Color.yellow);
      p2.add(ch);
      p2.add(l2);
     

      l.add("List Item 1");
      l.add("List Item 2");
      l.add("List Item 3");

      p3.setBackground(Color.orange);
      p3.add(l);
      p3.add(l3);
      

      p4.add(b);

      chk1.addItemListener(this);
      chk2.addItemListener(this);
      ch.addItemListener(this);
      l.addItemListener(this);

      b.addActionListener(this);

   }

   public void itemStateChanged(ItemEvent e) {
      if (e.getSource() == chk1) {
         l1.setText(chk1.getLabel());
      }
      if (e.getSource() == chk2) {
         l1.setText(chk2.getLabel());
      }

      if (e.getSource() == ch) {
         l2.setText(ch.getSelectedItem());
      }
      if (e.getSource() == l) {
         l3.setText(l.getSelectedItem());
      }
   }

   public void actionPerformed(ActionEvent e) {

      if (e.getSource() == b) {
         System.exit(0);
      }
   }

   public static void main(String[] args) {
      new app4();
   }

}
