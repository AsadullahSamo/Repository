package GUI;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;

class J extends JFrame{
    JProgressBar jp;
    public J(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(420, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jp = new JProgressBar();
        jp.setValue(0);
        jp.setBounds(0, 0, 420, 50 );
        jp.setStringPainted(true);
        jp.setForeground(Color.red);
        jp.setBackground(Color.black);
        jp.setFont(new Font("Consolas", Font.BOLD, 15));

        add(jp);
        fill();

    }
    public void fill(){
        int counter = 0;
        while(counter<=100){
            jp.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 1;
        }
        jp.setString("Done!");
    }

}    // end of class J

public class Progress_Bar {
    public static void main(String[] args) {
//        Progress Bar --> Visual aid to let the user know that some process is going in
        J j = new J();
    }
}
