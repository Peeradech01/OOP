import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PoringConstructor implements ActionListener{
    private JFrame main_frame;
    private JButton button_add;
    private int count;
    
    public PoringConstructor(){
        main_frame = new JFrame();
        main_frame.setLocationRelativeTo(null);
        main_frame.setLayout(new FlowLayout());
        button_add = new JButton("Add");
        main_frame.add(button_add);
        
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.pack();
        main_frame.setVisible(true);
    
        button_add.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ev){
        if (ev.getSource().equals(button_add)){
            new Poring(count+1);
            count ++;
        }
    }
    
        
    
    public static void main(String[] arge){
        new PoringConstructor();
    }
}
