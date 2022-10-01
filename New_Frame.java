package Lab_11_12_Task;

import javax.swing.*;
import java.awt.*;

class C extends JFrame {
    JLabel jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8;

    JLabel name, roll_no, section, batch, gender, qualification, address, country;
    public C() {
        setSize(620, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.ORANGE);

        jl1 = new JLabel("Name: ");
        jl2 = new JLabel("Roll No: ");
        jl3 = new JLabel("Batch: ");
        jl4 = new JLabel("Section: ");
        jl5 = new JLabel("Gender: ");
        jl6 = new JLabel("Qualification: ");
        jl7 = new JLabel("Address: ");
        jl8 = new JLabel("Country: ");
        name = new JLabel();
        roll_no = new JLabel();
        batch = new JLabel();
        section = new JLabel();
        gender = new JLabel();
        qualification = new JLabel();
        address = new JLabel();
        country = new JLabel();

        jl1.setBounds(50, 50, 75, 25);
        jl2.setBounds(50, 100, 75, 25);
        jl3.setBounds(50, 150, 75, 25);
        jl4.setBounds(50, 200, 75, 25);
        jl5.setBounds(50, 250, 75, 25);
        jl6.setBounds(50, 300, 80, 25);
        jl7.setBounds(50, 350, 75, 25);
        jl8.setBounds(50, 400, 75, 25);

        name.setBounds(150, 50, 150, 25);
        roll_no.setBounds(150, 100, 150, 25);
        batch.setBounds(150, 150, 150, 25);
        section.setBounds(150, 200, 150, 25);
        gender.setBounds(150, 250, 150, 25);
        qualification.setBounds(150, 300, 150, 25);
        address.setBounds(150, 350, 150, 25);
        country.setBounds(150, 400, 150, 25);




//        jl2.setText(roll_no.getText());
//        jl3.setText(batch.getText());
//        jl3.setText(section.getText());

        add(jl1);    add(name);
        add(jl2);    add(roll_no);
        add(jl3);    add(batch);
        add(jl4);    add(section);
        add(jl5);    add(gender);
        add(jl6);    add(qualification);
        add(jl7);    add(address);
        add(jl8);    add(country);


        setVisible(true);
    }
    public void my_update(String str1, String str2, String str3, String str4, String str5, String str6, String str7, String str8){
        name.setText(str1);
        roll_no.setText(str2);
        batch.setText(str3);
        section.setText(str4);
        gender.setText(str5);
        qualification.setText(str6);
        address.setText(str7);
        country.setText(str8);
    }
}     // end of class C
public class New_Frame {
    public static void main(String[] args) {
        C c = new C();
    }


}
