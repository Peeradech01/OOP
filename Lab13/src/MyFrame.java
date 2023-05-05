import java.awt.*;
import javax.swing.*;
import javax.swing.WindowConstants;

public class MyFrame {
    
    public static void main(String[] arge){
        JFrame frame = new JFrame();
        MyClock clock = new  MyClock();
        Thread thread = new Thread(clock);
        thread.start();
        
        frame.setLayout(new FlowLayout());
	frame.add(clock);
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setVisible(true);
        
    }
    
    
}
