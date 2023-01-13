package GUI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class K extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem load, save, exit;
    ImageIcon loadIcon, saveIcon;
    public K(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(420, 420);


        mb = new JMenuBar();
         fileMenu = new JMenu("File");
         editMenu = new JMenu("Edit");
         helpMenu = new JMenu("Help");

        load = new JMenuItem("Load");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        fileMenu.add(load);    fileMenu.add(save);      fileMenu.add(exit);

        loadIcon = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\load.jpg");
        saveIcon = new ImageIcon("C:\\Users\\asads\\OneDrive\\Desktop\\Images\\save.jpg");

//        fileMenu.setIcon(loadIcon);       fileMenu.setIcon(saveIcon);
        mb.add(fileMenu);
        mb.add(editMenu);
        mb.add(helpMenu);
        // Shortcuts for menus
        fileMenu.setMnemonic(KeyEvent.VK_F);     // alt + f for file
        helpMenu.setMnemonic(KeyEvent.VK_H);      // alt + h for help
        editMenu.setMnemonic(KeyEvent.VK_E);      // alt + e for edit
        // Shortcuts for menuItems
        load.setMnemonic(KeyEvent.VK_L);    // l for load
        save.setMnemonic(KeyEvent.VK_S);    // s for save
        exit.setMnemonic(KeyEvent.VK_E);   // e for exit

        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        setJMenuBar(mb);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==load){
                System.out.println("You load the file...");
            } else if(e.getSource()==save){
                System.out.println("You saved the file...");
            }
            else {
                System.out.println("You Exit from file");
            }
        }    // end of method actionPerformed

}    // end of class K



public class Menu_Bars {
    public static void main(String[] args) {

        K k = new K();
    }
}
