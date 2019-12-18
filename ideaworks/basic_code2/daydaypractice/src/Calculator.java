import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Calculator implements ActionListener {
    JFrame jf = new JFrame();
    JTextField tf = new JTextField();

    public void init()	{
        Container c = jf.getContentPane();
        tf.setHorizontalAlignment(JTextField.RIGHT);
        c.add(tf, "North");
        JPanel pn1 = new JPanel();
        c.add(pn1,"Center");
        pn1.setLayout(new GridLayout(4,4));
        JButton b = new JButton("1");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("2");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("3");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("+");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("4");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("5");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("6");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("-");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("7");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("8");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("9");
        b.addActionListener(this);
        pn1.add(b);b = new JButton("*");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("0");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton(".");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("=");
        b.addActionListener(this);
        pn1.add(b);
        b = new JButton("\\");
        b.addActionListener(this);
        pn1.add(b);
        jf.setSize(200,300);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText(tf.getText()+e.getActionCommand());
    }

    public static void main(String[] args)	{
        new Calculator().init();
    }
}
