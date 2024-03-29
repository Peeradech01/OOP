import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;
    private JTextField tf1;
    private JLabel label1;
    private JTextField tf2;
    private JLabel label3;
    private JButton bn1;
    private JButton bn2;
    private JButton bn3;
    private Account account;
    
    public TellerGUI() {
        account = new Account(0, "del");
        fr = new JFrame("Teller GUI");
        pn1 = new JPanel();
        pn2 = new JPanel();
        tf1 = new JTextField();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        label1 = new JLabel("Balance");
        tf2 = new JTextField(String.valueOf(account.getBalance()));
        tf2.setEditable(false);
        label3 = new JLabel("Amount");
        
        fr.setLayout(new GridLayout(2, 1));
        pn1.setLayout(new GridLayout(2, 2));
        pn1.add(label1);
        pn1.add(tf2);
        pn1.add(label3);
        pn1.add(tf1);
        
        fr.add(pn1);
        
        pn2.setLayout(new FlowLayout());
        pn2.add(bn1);
        pn2.add(bn2);
        pn2.add(bn3);
        
        fr.add(pn2);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250, 190);
        fr.setVisible(true);
        
        bn1.addActionListener(this);
        bn2.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(bn1)){
            if((Double.parseDouble(tf1.getText()))>= 0){
                account.setBalance(account.getBalance()+((Double.parseDouble(tf1.getText()))));
                tf2.setText(account.getBalance()+"");
                
            }
        }
        
        else if (e.getSource().equals(bn2)){
            if((Double.parseDouble(tf1.getText()))>= 0){
                account.setBalance(account.getBalance()-((Double.parseDouble(tf1.getText()))));
                tf2.setText(account.getBalance()+"");
                
            }       
        }
        
    }
        
}
    
    
    
    
    

