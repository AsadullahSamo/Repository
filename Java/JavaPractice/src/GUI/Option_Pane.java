package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class D extends JFrame{
    public D(){
//        JOptionPane.showMessageDialog(null, "Java is OOP language", "Java Option pane", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Really", "Java Option pane", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Your computer has a virus", "Java Option pane", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Call Tech Support", "Java Option pane", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Java is OOP language", "Java Option pane", JOptionPane.PLAIN_MESSAGE);
//
//        int answer = JOptionPane.showConfirmDialog(null, "Do you like programming", "Confirmation", JOptionPane.YES_NO_OPTION);
//        System.out.println("Button returned "+answer);
//        String name = JOptionPane.showInputDialog("What is your name");
//        System.out.println("Hello "+name);

        ImageIcon image = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\Coding.jpg");

        String [] responses = {"No, I'm not!", "What", "Yes"};
        JOptionPane.showOptionDialog(null, "You are awesome!", "Title", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, image, responses, 0);
    }
}

public class Option_Pane {
    public static void main(String[] args) {

//        JOptionPane --> pop up a standard dialogue box that prompts user for a value OR inform them for something
          D d = new D();
    }
}
