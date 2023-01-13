package GUI;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.FlowLayout;
class F extends JFrame{
    JCheckBox c1;
    JButton jb;
    ImageIcon Xicon;
    ImageIcon checkIcon;
    public F() {
        Xicon = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Check.png");
        checkIcon = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Close.jpg");

        jb = new JButton("Submit");
        c1 = new JCheckBox("I'm not a robot");
        c1.setFocusable(false);
        c1.setFont(new Font("Georgia", Font.ITALIC, 15));
        c1.setIcon(checkIcon);
        c1.setSelectedIcon(Xicon);
        add(c1);
        add(jb);

        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        jb.addActionListener(e -> {
            if(e.getSource()==jb){
                System.out.println(c1.isSelected());
            }
        });

    }
}

public class Checkbox {
    public static void main(String[] args) {

        F f = new F();
    }
}
