import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ChatDemo {
    private JFrame fr;
    private JTextField tf;
    private JTextArea ta;
    private JButton Submit, Reset;
    private JPanel pn;
    
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
    
    
    }
    
    public static void main(String arge[]){
        new ChatDemo();
    }
}
