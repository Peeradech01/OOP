import java.awt.*;
import javax.swing.*;

public class Runtime extends JLabel implements Runnable{
    private int time;
    
    @Override
    public void run() {
        while (true){
            int sec = time%60;
            int min = (time/60)%60;
            int hour = (time/3600)%24;
            Font font = new Font("Serif", Font.ITALIC, 70);
            setFont(font);
            setText(String.format("%02d:%02d:%02d", hour, min, sec));
            try {
		Thread.sleep(1000);
            }
            catch (InterruptedException e) {
		e.printStackTrace();
            }
            time ++;
        
        }
        
    }
    
}
