package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class E extends JFrame implements ActionListener{
    JTextField tf;
    JButton jb;
    public E(){
        jb = new JButton("Submit");
        tf = new JTextField(15);
        tf.setFont(new Font("Consolas", Font.ITALIC, 15));
        tf.setForeground(Color.green);
        tf.setBackground(Color.BLACK);
        tf.setCaretColor(Color.white);
        add(jb);
        add(tf);

        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        jb.addActionListener(this);
        // end of method actionPerformed
    }
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==jb){
                System.out.println("Hi, "+tf.getText());
                jb.setEnabled(false);
                tf.setEditable(false);
            }
        }
}     // end of class E

public class TextField {
    public static void main(String[] args) {

        E e = new E();

    }
}
