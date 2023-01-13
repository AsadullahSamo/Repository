package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class My extends JFrame{
    JButton button;
    public My(){
        button = new JButton("Choose a file");
        button.setBounds(100, 100, 50, 50);
        setSize(420, 420);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==button){
                    JFileChooser fileChooser = new JFileChooser();
                    File file = new File("E:\\Java");
                    fileChooser.setCurrentDirectory(file);
                    fileChooser.showOpenDialog(null);
                    System.out.println(fileChooser.getSelectedFile());
                }
            }
        });

        setVisible(true);
    }
}

public class abc {
    public static void main(String[] args) {
        My my = new My();
    }
}
