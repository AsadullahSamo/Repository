package GUI;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

class Frame2 extends JFrame{
    public Frame2(){
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        p.setBackground(Color.GRAY);
        p.setPreferredSize(new Dimension(100, 250));
        p.setLayout(new FlowLayout());

        p.add(new JButton("1"));
        p.add(new JButton("2"));
        p.add(new JButton("3"));
        p.add(new JButton("4"));
        p.add(new JButton("5"));
        p.add(new JButton("6"));
        p.add(new JButton("7"));
        p.add(new JButton("8"));
        p.add(new JButton("9"));

        add(p);
    }
}

public class Flow_Layout {
    public static void main(String[] args) {

//        FlowLayout --> place components in horizontal with their preferred size, if horizontal space is small then it arrange items to next row
        Frame2 f = new Frame2();

    }
}
