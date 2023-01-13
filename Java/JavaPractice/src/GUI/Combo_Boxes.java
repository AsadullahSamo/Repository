package GUI;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.FlowLayout;

class H extends JFrame{
    JComboBox cb;
    public H() {
        String [] animals = {"Lion", "Leopard", "Eagle"};
        cb = new JComboBox(animals);

        add(cb);
//        cb.setEditable(true);
//        System.out.println(cb.getItemCount());
        cb.addItem("Horse");
        cb.insertItemAt("Buffalo", 2);
//        cb.removeItem("Lion");
//        cb.removeAllItems();
        cb.setSelectedIndex(2);

        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        cb.addActionListener(e -> {
            if(e.getSource()==cb)
                System.out.println(cb.getSelectedItem());
        });
    }
}

public class Combo_Boxes {
    public static void main(String[] args) {

//        JComboBox --> A component that combines buttons or editable field and a drop-down list
        H h = new H();

    }
}
