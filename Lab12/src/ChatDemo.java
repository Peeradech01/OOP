import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JTextField tf;
    private JTextArea ta;
    private JButton Submit, Reset;
    private JPanel pn;
    private File file;
    
    
    public ChatDemo(){
        fr = new JFrame("ChatDemo");
        tf = new JTextField();
        ta = new JTextArea( 20, 45);
        ta.setEditable(false);
        Submit = new JButton("Submit");
        Reset = new JButton("Reset");
        pn = new JPanel();
        
        fr.setLayout(new BorderLayout());
        pn.setLayout(new FlowLayout());
        fr.add(tf, BorderLayout.CENTER);
        fr.add(ta, BorderLayout.NORTH);
        pn.add(Submit);
        pn.add(Reset);
        fr.add(pn, BorderLayout.SOUTH);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
        file = new File("ChatDemo.dat");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    
        Submit.addActionListener(this);
        Reset.addActionListener(this);
        fr.addWindowListener(this);
        
        
    }
    
    
    public void actionPerformed(ActionEvent ev){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.print(dtf.format(LocalDateTime.now()));
        if (ev.getSource().equals(Submit)){
            ta.setText(ta.getText()+ "\n" +dtf.format(LocalDateTime.now())+" : "+ tf.getText());
            tf.setText("");
        }
        else if (ev.getSource().equals(Reset)){
            ta.setText("");
        
        }   
    }
    
    public void windowOpened(WindowEvent e) {
            if (file.exists()) {
            String data = "";
            try (FileReader fr = new FileReader(file)) {
                int chr;
                while ((chr = fr.read()) != -1) {
                    data += (char) chr;
                }
                System.out.println(data);
                ta.setText(data);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
                System.out.println("File not found.");
            }
    }
    
    
    public void windowClosing(WindowEvent e) {
        try (FileWriter fw = new FileWriter(file)) {
            String data = ta.getText();
            for (int i = 0; i < data.length(); i++) {
                fw.write(data.charAt(i));
                }
            System.out.println("Save data");
        } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    
    
    public static void main(String arge[]){
        new ChatDemo();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
