package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;

class label extends JFrame{
    public label(){
        ImageIcon image = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Coding.jpg");

        JLabel jl = new JLabel();
        jl.setText("Asadullah Samo");
        jl.setIcon(image);    //  to set image as icon
        add(jl);
        jl.setHorizontalTextPosition(JLabel.CENTER);   // to set text on center of image (other option are LEFT or RIGHT)
        jl.setVerticalTextPosition(JLabel.TOP);       // TOP or BOTTOM or CENTER
        jl.setForeground(new Color(77, 45, 98));    // to set Font color
        jl.setFont(new Font("MV Boli", Font.ITALIC, 25));  // set font of text
        jl.setIconTextGap(100);     // to gap font from image

        jl.setBackground(Color.black);                    // set background color
        jl.setOpaque(true);                              //  display background color  (these two methods should be used together)
        Border border  = BorderFactory.createLineBorder(Color.green, 3);
        jl.setBorder(border);
        jl.setVerticalAlignment(JLabel.CENTER);         // set vertical position of icon+text within label
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setBounds(0, 0, 250, 250);

        setVisible(true);
//        setSize(500, 500);
//        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

    }   // end of constructor

}    // end of class label

public class Labels {
    public static void main(String[] args) {

//        JLabel --> A GUI display area for a string of text, an image OR both
        label l = new label();

    }   // end of main() method
}       // end of program
