package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class O extends JFrame implements MouseListener{
    JLabel label;
    ImageIcon rocket, pizza, save, load;
    public O() {
        setLayout(null);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);

        rocket = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Rocket.jpg");
        pizza =  new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Pizza.jpg");
        save  =  new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\save.jpg");
        load  =  new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\load.jpg");

        label.setIcon(pizza);
        add(label);
        label.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked the mouse");
    } // Invoked when a mouse button has been clicked (pressed and released) on a component

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(rocket);
    } // Invoked when a mouse button is hold

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(save);
    } // Invoked when a mouse button is released on a component

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(load);

    } // Invoked when a mouse enters a component

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(pizza);
    } // Invoked when a mouse EXITS A COMPONENT
}

public class Mouse_Listener {
    public static void main(String[] args) {

        O o = new O();

    }
}
