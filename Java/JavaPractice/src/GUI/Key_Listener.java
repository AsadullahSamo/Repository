package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class N extends JFrame implements KeyListener{
    JLabel label;
    ImageIcon image;
    public N(){
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        image = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Rocket.jpg");

        label = new JLabel(image);
        label.setBounds(0, 0, 100, 100);
        setBackground(Color.BLACK);
        getContentPane().setBackground(Color.BLACK);


        addKeyListener(this);
        setVisible(true);
    }  // end of constructor

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'w' -> label.setLocation(label.getX(), label.getY()-10);
            case 's' -> label.setLocation(label.getX(), label.getY()+10);
            case 'a' -> label.setLocation(label.getX()-10, label.getY());
            case 'd' -> label.setLocation(label.getX()+10, label.getY());
        }
    }      // keyTyped --> Invoked when a key is typed. Used KeyChar, char output

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 38 -> label.setLocation(label.getX(), label.getY()-10);
            case 40 -> label.setLocation(label.getX(), label.getY()+10);
            case 37 -> label.setLocation(label.getX()-10, label.getY());
            case 39 -> label.setLocation(label.getX()+10, label.getY());
        }
    }    // keyPressed --> Invoked when a physical key is pressed down. Uses KeyCode, int output (like Right, left, up, down arrow)

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("You released key char " + e.getKeyChar());    // press any button to see effect
//        System.out.println("The keycode number of "+ e.getKeyChar()+" is "+e.getKeyCode());
    }  // keyReleased --> called whenever a button is released
}   // end of class N

public class Key_Listener {
    public static void main(String[] args) {

        N n = new N();

    }
}
