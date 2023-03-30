import java.awt.*;
import javax.swing.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;
    private JTextField tf;
    private JLabel label1;
    private JTextField tf2;
    private JLabel label3;
    private JButton bn1;
    private JButton bn2;
    private JButton bn3;
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        pn1 = new JPanel();
        pn2 = new JPanel();
        tf = new JTextField();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        label1 = new JLabel("Balance");
        tf2 = new JTextField("6000");
        tf2.setEditable(false);
        label3 = new JLabel("Amount");
        
        fr.setLayout(new GridLayout(2, 1));
        pn1.setLayout(new GridLayout(2, 2));
        pn1.add(label1);
        pn1.add(tf2);
        pn1.add(label3);
        pn1.add(tf);
        fr.add(pn1);
        
        pn2.setLayout(new FlowLayout());
        pn2.add(bn1);
        pn2.add(bn2);
        pn2.add(bn3);
        fr.add(pn2);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250, 190);
        fr.setVisible(true);
    }
    
}
