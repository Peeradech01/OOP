import java.awt.*;
import javax.swing.*;

public class StopClock extends JLabel implements Runnable{

    private int time;
    private boolean paused;
    
    private synchronized void checkPaused(){
        while (paused){
            try{
                this.wait();
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        
    
    }
    
    
    public void pauseThread(){
        paused = true;
    
    }
    
    public synchronized void resumeThread(){
        paused = false;
        this.notify();
    
    }
    
    @Override
    public void run() {
        try {
            while (true){
                checkPaused();
                int sec = time%60;
                int min = (time/60)%60;
                int hour = (time/3600)%24;
                Font font = new Font("Serif", Font.ITALIC, 70);
                setFont(font);
                setText(String.format("%02d:%02d:%02d", hour, min, sec));
                Thread.sleep(1000);
                time++;
            }
        }    
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
           
    }    
        
}

    

