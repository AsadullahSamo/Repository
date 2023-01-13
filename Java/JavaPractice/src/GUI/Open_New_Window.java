package GUI;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class C extends JFrame implements ActionListener {
    JButton jb;
    public C(){

        jb = new JButton("Call B File");
        jb.setBounds(0, 0, 100, 50);
        setVisible(true);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jb);
        jb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb)
            new B();
            dispose();
    }

}     // end of class C

public class Open_New_Window {
    public static void main(String[] args) {

        C c = new C();

    }
}
