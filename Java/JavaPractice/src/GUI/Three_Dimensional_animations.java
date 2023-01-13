package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class S extends JFrame{
    myPanel2 panel2;
    public S(){
        panel2 =  new myPanel2();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel2);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
class myPanel2 extends JPanel implements ActionListener {
    final int panel_width = 500, panel_height = 500;
    Image enemy;
    Image space;
    Timer timer;
    int xVelocity = 1, yVelocity = 2, x = 0, y = 0;
    myPanel2(){
        setPreferredSize(new Dimension(panel_width, panel_height));
        setBackground(Color.black);
        enemy = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\enemy.jpg").getImage();
        space = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Space.png").getImage();

        timer = new Timer(10, this);
        timer.start();    // after 1 second we can perform any action, written in actionPerformed
    }

    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(space, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=panel_width-enemy.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        if(y>=panel_width-enemy.getWidth(null) || y<0){
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();          //  to call paint() method after every sec
    }
}

public class Three_Dimensional_animations {
    public static void main(String[] args) {

        S s = new S();

    }
}
