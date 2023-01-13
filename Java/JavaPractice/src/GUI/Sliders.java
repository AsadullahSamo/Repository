package GUI;

import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.FlowLayout;
import java.awt.Dimension;

class I extends JFrame implements ChangeListener{
    JPanel jp;
    JLabel jl;
    JSlider js;
    public I(){
        jp = new JPanel();
        jl = new JLabel();
        js = new JSlider(0, 100, 50);

        js.setPreferredSize(new Dimension(400, 200));
        js.setPaintTicks(true);
        js.setMinorTickSpacing(10);
        js.setPaintTrack(true);
        js.setMajorTickSpacing(25);
        js.setPaintLabels(true);
        js.setOrientation(SwingConstants.HORIZONTAL);

        add(js);
        add(jl);
        add(jp);

        setVisible(true);
        setSize(420, 420);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        js.addChangeListener(this);
    }
    public void stateChanged(ChangeEvent e){
        jl.setText("°C = "+js.getValue());
    }
}

public class Sliders {
    public static void main(String[] args) {

        I i = new I();

    }
}
