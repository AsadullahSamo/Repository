package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JColorChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class M extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    public M(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(420, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Pick a color");
        label = new JLabel("This is some text");
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setFont(new Font("MV BOli", Font.PLAIN, 50));

        add(button);    add(label);

        button.addActionListener(this);
    }    // end of constructor

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();
            Color color = colorChooser.showDialog(null, "Pick Color", Color.BLACK);
            label.setForeground(color);
//            label.setBackground(color);
        }
    }    // end of method actionPerformed

}      // end of class M

public class Color_Chooser {
    public static void main(String[] args) {

//        JColorChooser --> A GUI mechanism that lets the user choose a color
        M m = new M();

    }
}
