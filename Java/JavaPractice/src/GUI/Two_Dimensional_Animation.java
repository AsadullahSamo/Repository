package GUI;
import javax.swing.*;
import java.awt.*;

class R extends JFrame{
    myPanel panel;
    public R(){
        panel = new myPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(panel);
        pack();
        setVisible(true);
    }

}    // end of class R
class myPanel extends JPanel{
    Image image;
    public myPanel(){
        image = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Check.jpg").getImage();
        setPreferredSize(new Dimension(500, 500));
    }
    public void paint(Graphics g){                // this paint method is called automatically behind the scenes whenever, we create a JFrame component
        Graphics2D g2D = (Graphics2D) g;     // Casting Graphics to Graphics2D

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));          // thickness of line
//        g2D.drawLine(0, 0, 500, 500);      // Drawing a line from top corner to bottom-right corner (as starting pt of frame is 0, and ending is 500)

//        g2D.drawRect(0, 0, 100, 200);
//        g2D.fillRect(0, 0, 100, 200);   // to fill rectangle

//        g2D.setPaint(Color.orange);
//        g2D.drawOval(0, 0, 100, 100);
//        g2D.fillOval(0, 0, 100, 100);

//        g2D.setPaint(Color.red);
////        g2D.drawArc(0, 0, 100, 100, 0, 180);       // half circle because angle is 180, if start angle is also 180 it would be counter clockwise
//        g2D.fillArc(0, 0, 100, 100, 0, 180);
//        g2D.setPaint(Color.white);
//        g2D.fillArc(0, 0, 100, 100, 180, 180);

//        int [] xPoints = {150, 250, 350};
//        int [] yPoints = {300, 150, 300};
//        g2D.drawPolygon(xPoints, yPoints, 3);
//        g2D.setPaint(Color.yellow);
//        g2D.fillPolygon(xPoints, yPoints, 3);

        g2D.setFont(new Font("Ink Free", Font.BOLD, 15));
        g2D.setPaint(Color.magenta);
        g2D.drawString("You are a winner", 50, 50);

//        g2D.drawImage(image, 0, 0, null);
    }
}

public class Two_Dimensional_Animation {
    public static void main(String[] args) {

        R r = new R();

    }
}
