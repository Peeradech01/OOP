import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener {
    private JFrame frame;
    private JPanel pn1, pn2;
    private JLabel id_lb, name_lb, money_lb;
    private JTextField id_tf, name_tf, money_tf;
    private JButton deposit_btn, withdraw_btn;
    private File obj_logs;
    private Student std;
    
    public StudentView() {
        frame = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        id_lb = new JLabel("ID :");
        name_lb = new JLabel("Name :");
        money_lb = new JLabel("Money :");
        id_tf = new JTextField("");
        name_tf = new JTextField("");
        money_tf = new JTextField("0");
        deposit_btn = new JButton("Deposit");
        withdraw_btn = new JButton("Withdraw");
        
        money_tf.setEditable(false);
        frame.setLayout(new BorderLayout());
        pn1.setLayout(new GridLayout(3, 2));
        pn2.setLayout(new FlowLayout());
        
        deposit_btn.addActionListener(this);
        withdraw_btn.addActionListener(this);
        frame.addWindowListener(this);
        pn1.add(id_lb);
        pn1.add(id_tf);
        pn1.add(name_lb);
        pn1.add(name_tf);
        pn1.add(money_lb);
        pn1.add(money_tf);
        pn2.add(deposit_btn);
        pn2.add(withdraw_btn);
        frame.add(pn1, BorderLayout.CENTER);
        frame.add(pn2, BorderLayout.SOUTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        obj_logs = new File("StudentM.dat");
        try {
            obj_logs.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(deposit_btn)) {
                std.setMoney(std.getMoney() + 100);
                money_tf.setText(Integer.toString(std.getMoney()));
                std.setName(name_tf.getText());
        std.setID(Integer.parseInt(id_tf.getText()));
          } else if (ae.getSource().equals(withdraw_btn)) {
                std.setMoney(std.getMoney() - 100);
                money_tf.setText(Integer.toString(std.getMoney()));
                std.setName(name_tf.getText());
        std.setID(Integer.parseInt(id_tf.getText()));
        }
    }
    
    @Override
    public void windowClosing(WindowEvent we) {
        try {
            FileOutputStream stream = new FileOutputStream(obj_logs);
            ObjectOutputStream ops = new ObjectOutputStream(stream);
            ops.writeObject(std);
        } catch (IOException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
    }
    
    @Override
    public void windowOpened(WindowEvent we) {
        if (obj_logs.exists()) {
            try {
                FileInputStream stream = new FileInputStream(obj_logs);
                ObjectInputStream ips = new ObjectInputStream(stream);
                std = (Student) ips.readObject();
                if (std == null) {
                    std = new Student();
                }
                id_tf.setText(String.valueOf(std.getID()));
                name_tf.setText(std.getName());
                money_tf.setText(String.valueOf(std.getMoney()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    
    @Override
    public void windowClosed(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
     public void main(String arge[]){
        new StudentView();
    }
    
    
}
