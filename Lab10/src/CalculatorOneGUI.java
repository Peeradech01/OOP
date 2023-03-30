import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel pn;
    private JButton bn1, bn2, bn3, bn4;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf4;
    
    CalculatorOneGUI(){
        fr = new JFrame("Calculator");
        pn = new JPanel();
        bn1 = new JButton("+");
        bn2 = new JButton("-");
        bn3 = new JButton("x");
        bn4 = new JButton("/");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf4 = new JTextField();
        fr.setLayout(new GridLayout(4, 1));
        pn.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        pn.add(bn1);
        pn.add(bn2);
        pn.add(bn3);
        pn.add(bn4);
        
        fr.add(tf1);
        fr.add(tf2);
        fr.add(pn);
        fr.add(tf4);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 200);
        fr.setVisible(true);    
    
    }
    
}
