package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class L extends JFrame implements ActionListener{
    JButton jb;
    public L(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(420, 420);

        jb = new JButton("Select File");
        add(jb);

        jb.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\Users\\asads\\OneDrive\\Desktop"));
            System.out.println(fileChooser.showOpenDialog(null));   // select file to open
//            System.out.println(fileChooser.showSaveDialog(null));   // select file to save
            System.out.println(fileChooser.getSelectedFile());
        }
    }
}    // end of class L

public class Choosing_Files {
    public static void main(String[] args) {

        L l = new L();

    }
}
