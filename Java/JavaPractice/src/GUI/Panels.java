package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.Color;

class panel extends JFrame{
    public panel(){
        ImageIcon image = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Coding.jpg");
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);

        setVisible(true);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jl = new JLabel();
        jl.setText("Hi");
        jl.setIcon(image);
        jl.setBounds(100, 100, 200, 200);
        add(redPanel);
        add(bluePanel);
        add(greenPanel);
        greenPanel.add(jl);
    }
}     // end of class panel

public class Panels {
    public static void main(String[] args) {

//        Labels  --> A GUI component that functions as a container to hold other components
        panel p = new panel();
    }
}

