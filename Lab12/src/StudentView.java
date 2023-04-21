import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StudentView {
    
    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;
    private JButton Deposit;
    private JButton Withdraw;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public StudentView(){
        fr = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        Deposit = new JButton("Deposit");
        Withdraw = new JButton("Withdraw");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField(String.valueOf(0));
        tf3.setEditable(false);
        
        label1 = new JLabel("  ID :");
        label2 = new JLabel("  Name :");
        label3 = new JLabel("  Money :");
        
        fr.setLayout(new BorderLayout());
        pn1.setLayout(new GridLayout(3, 2));
        pn1.add(label1);
        pn1.add(tf1);
        pn1.add(label2);
        pn1.add(tf2);
        pn1.add(label3);
        pn1.add(tf3);
        fr.add(pn1, BorderLayout.CENTER);
        pn2.setLayout(new FlowLayout());
        pn2.add(Deposit);
        pn2.add(Withdraw);
        fr.add(pn2, BorderLayout.SOUTH);
        
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        new StudentView(); 
    }
    
    
}
