package GUI;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Color;

class frame extends JFrame{
    public frame(){
        setVisible(true);
        setSize(420, 420);
        setLayout(new FlowLayout());
        setTitle("JFrame Title goes here");      // sets title of jframe
        setResizable(false);                    // prevent frame from resizing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon ic = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Gear.png");
        setIconImage(ic.getImage());          // Change icon of frame

        getContentPane().setBackground(Color.blue);     // change color of background // OR we can use Color.green etc
    }      // end of constructor
}    // end of class frame

public class GUI_JFrame {
    public static void main(String[] args) {

        frame f = new frame();
    }      // end of main() method
}         //  end of program
