package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.security.KeyStore;

class Q extends JFrame{
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    JLabel label;

    public Q(){
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        // if we want to associate keystrokes with events, these are the steps below
        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
        label.getActionMap().put("upAction", upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
        label.getActionMap().put("downAction", downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        add(label);
        setVisible(true);
    }

    public class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-10);
        }      // inner class for performing action
    }
    public class DownAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
        }      // inner class for performing action
    }
    public class LeftAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY());
        }      // inner class for performing action
    }
    public class RightAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10, label.getY());
        }      // inner class for performing action
    }

}    // end of class Q

public class Key_bindings {
    public static void main(String[] args) {

//        Key_bindings --> Binds an action to a keystroke
//                        Don't require you to click a component to focus it
//                        All swing components use key bindings
//                        Increased flexibility compared to key listeners
//                        Can assign keystrokes to individual swing components
//                        more difficult to utilize and set up
        Q q = new Q();

    }
}
