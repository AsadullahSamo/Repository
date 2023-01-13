package GUI;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Color;
class B extends JFrame{
    public B(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 500);


        JLayeredPane jlp = new JLayeredPane();
        jlp.setBounds(0, 0, 500, 500);

        JLabel jl1 = new JLabel();
        jl1.setBounds(50,50, 200, 200);
        jl1.setBackground(Color.red);
        jl1.setOpaque(true);

        JLabel jl2 = new JLabel();
        jl2.setBounds(100,100, 200, 200);
        jl2.setBackground(Color.green);
        jl2.setOpaque(true);

        JLabel jl3 = new JLabel();
        jl3.setBounds(150,150, 200, 200);
        jl3.setBackground(Color.blue);
        jl3.setOpaque(true);

        jlp.add(jl1, Integer.valueOf(1));
        jlp.add(jl2, Integer.valueOf(0));
        jlp.add(jl3, Integer.valueOf(2));
        add(jlp);
    }
}


public class LayeredPane {
    public static void main(String[] args) {

        B b = new B();

    }
}
