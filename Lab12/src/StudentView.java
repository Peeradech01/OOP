import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener {
    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;
    private JLabel text_id;
    private JLabel text_name;
    private JLabel text_money;
    private JTextField field_id;
    private JTextField field_name;
    private JTextField field_money;
    private JButton deposit;
    private JButton withdraw;
    private File file;
    private Student std;
    
    public StudentView() {
        fr = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        text_id = new JLabel("   ID :");
        text_name = new JLabel("   Name :");
        text_money = new JLabel("   Money :");
        field_id = new JTextField();
        field_name = new JTextField();
        field_money = new JTextField(0);
        field_money.setEditable(false);
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        
        fr.setLayout(new BorderLayout());
        pn1.setLayout(new GridLayout(3, 2));
        pn2.setLayout(new FlowLayout());
        pn1.add(text_id);
        pn1.add(field_id);
        pn1.add(text_name);
        pn1.add(field_name);
        pn1.add(text_money);
        pn1.add(field_money);
        fr.add(pn1, BorderLayout.CENTER);
        
        pn2.add(deposit);
        pn2.add(withdraw);
        fr.add(pn2, BorderLayout.SOUTH);
        
        file= new File("StudentM.dat");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        fr.addWindowListener(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(deposit)) {
                std.setMoney(std.getMoney() + 100);
                field_money.setText(Integer.toString(std.getMoney()));
                std.setName(field_name.getText());
        std.setID(Integer.parseInt(field_id.getText()));
          } else if (ae.getSource().equals(withdraw)) {
                std.setMoney(std.getMoney() - 100);
                field_money.setText(Integer.toString(std.getMoney()));
                std.setName(field_name.getText());
        std.setID(Integer.parseInt(field_id.getText()));
        }
    }
    
    @Override
    public void windowClosing(WindowEvent we) {
        try {
            FileOutputStream stream = new FileOutputStream(file);
            ObjectOutputStream ops = new ObjectOutputStream(stream);
            ops.writeObject(std);
        } catch (IOException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
    }
    
    @Override
    public void windowOpened(WindowEvent we) {
        if (file.exists()) {
            try {
                FileInputStream stream = new FileInputStream(file);
                ObjectInputStream ips = new ObjectInputStream(stream);
                std = (Student) ips.readObject();
                if (std == null) {
                    std = new Student();
                }
                field_id.setText(String.valueOf(std.getID()));
                field_name.setText(std.getName());
                field_money.setText(String.valueOf(std.getMoney()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    
    public static void main(String arge[]){
        new StudentView();
    }
    
    
    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }
    

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
     
    
}