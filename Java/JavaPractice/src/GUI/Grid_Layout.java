package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

class A extends JFrame{
    public A(){
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3, 10, 10));
        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
        add(new JButton("6"));
        add(new JButton("7"));
        add(new JButton("8"));
        add(new JButton("9"));

    }
}

public class Grid_Layout {
    public static void main(String[] args) {

//        GridLayout --> places components in the grid of cells. Each component takes all the available space of the cell, and each cell has same size
        A a = new A();
    }
}
