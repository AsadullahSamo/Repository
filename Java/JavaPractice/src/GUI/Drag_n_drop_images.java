package GUI;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class P extends JFrame{
    DragPanel dragPanel = new DragPanel();
    public P(){
        setLayout(null);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(dragPanel);
    }     // end of constructor
}    // end of class P

class DragPanel extends JPanel{
    ImageIcon image = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Pizza.jpg");
    final int width = image.getIconWidth();
    final int height = image.getIconHeight();
    Point imageCorner, prevPt;
    DragPanel(){
        imageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();

        addMouseListener(clickListener);
        addMouseMotionListener(dragListener);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point CurrentPt = e.getPoint();
            imageCorner.translate((int)(CurrentPt.getX() - prevPt.getX()), (int)(CurrentPt.getY() - prevPt.getY()));
            prevPt = CurrentPt;
            repaint();
        }
    }
}

public class Drag_n_drop_images {
    public static void main(String[] args) {

        P p = new P();

    }
}
