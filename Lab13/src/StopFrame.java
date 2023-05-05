import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StopFrame implements MouseListener{
    
    public static boolean isRunning = true;
    public static StopClock clock;
    
    public static void main(String[] arge){
        JFrame frame = new JFrame();
        clock = new StopClock();
        
        Thread thread = new Thread(clock);
        thread.start();
        frame.setLayout(new FlowLayout());
        frame.add(clock);
        frame.setSize(400,150);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        frame.addMouseListener(new StopFrame());
    }

    @Override
    public void mouseClicked(MouseEvent ev) {
        
        if(isRunning){
            clock.pauseThread();
            isRunning = false;
        }
        else{
            clock.resumeThread();
            isRunning = true;
        }
        
    }
        
    @Override
    public void mousePressed(MouseEvent ev) {}
   
    @Override
    public void mouseReleased(MouseEvent ev) {}
        
    @Override
    public void mouseEntered(MouseEvent ev) {}

    @Override
    public void mouseExited(MouseEvent ev) {}
    
    
}
