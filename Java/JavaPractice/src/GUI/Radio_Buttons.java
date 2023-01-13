package GUI;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class G extends JFrame implements ActionListener {
    JRadioButton jb1, jb2, jb3;
    ImageIcon pizza, burger;
    public G(){
        pizza = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Pizza.jpg");
        burger = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Burger.jpg");

        jb1 = new JRadioButton("Pizza");
        jb2 = new JRadioButton("Burger");
        jb3 = new JRadioButton("French Fries");

        jb1.setIcon(pizza);
        jb2.setIcon(burger);
        add(jb1);
        add(jb2);
        add(jb3);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb1)
            System.out.println("You ordered Pizza!");
        else if(e.getSource()==jb2)
            System.out.println("You ordered Burger!");
        else
            System.out.println("You ordered French Fries!");
    }
}

public class Radio_Buttons {
    public static void main(String[] args) {

        G f = new G();

    }
}
