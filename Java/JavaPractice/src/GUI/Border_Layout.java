package GUI;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

class myFrame extends JFrame{
    public myFrame(){
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();


        setLayout(new BorderLayout());
        // Add border layout before this
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
        add(panel3, BorderLayout.CENTER);
        add(panel4, BorderLayout.EAST);
        add(panel5, BorderLayout.WEST);

    }
}

public class Border_Layout {
    public static void main(String[] args) {

//        BorderLayout --> A border layout place components in five areas: EAST, WEST, NORTH, SOUTH, CENTER
//                        All extra space is placed in center area
        myFrame m = new myFrame();

    }
}
