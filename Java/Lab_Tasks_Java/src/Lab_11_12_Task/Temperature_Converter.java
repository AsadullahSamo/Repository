package Lab_11_12_Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Converter extends JFrame implements ActionListener {
    JTextField textField;
    JLabel label;
    JButton button;
    public Converter(){

        setSize(620, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Enter the temperature in celsius: ");
        label.setBounds(100, 50, 75, 25);

        textField = new JTextField(20);
        textField.setBounds(100, 100, 75, 25);

        button = new JButton("Convert");
        button.setBounds(150, 50, 75, 25);


        add(label);
        add(textField);       add(button);

        button.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            float celsius = Float.parseFloat(textField.getText());
            float farenheit = (celsius*9)/5 + 32;
            label.setText(farenheit+"");

        }
    }
}
public class Temperature_Converter {
    public static void main(String[] args) {

        Converter converter = new Converter();

    }
}
