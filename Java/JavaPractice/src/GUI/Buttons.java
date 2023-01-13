package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class button extends JFrame implements ActionListener{

    JButton jb;
    JLabel jl;
    public button(){
        ImageIcon image = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Coding.jpg");
        ImageIcon image2 = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Gear.png");
        jb = new JButton();
        jb.setBounds(200, 100, 50, 50);

        jl = new JLabel();
        jl.setBounds(150, 250, 250, 250);
        jl.setVisible(false);
        jl.setIcon(image2);

        setVisible(true);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jb.setText("Print");
        jb.setBackground(Color.green);
        jb.setFocusable(false);
//        jb.setIcon(image);
        jb.setBorder(BorderFactory.createEtchedBorder());
        jb.setFont(new Font("Conic Sans", Font.ITALIC, 15));

        add(jb);
        add(jl);

        jb.addActionListener(this);
    }  // end of constructor
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb) {
            System.out.println("Hello, World!");
            jb.setEnabled(false);
            jl.setVisible(true);
        }
    }
}    // end of class buttons

public class Buttons {
    public static void main(String[] args) {

        button b1 = new button();

    }
}
