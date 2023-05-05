import javax.swing.*;

public class PoringRunnable implements Runnable{
    private JFrame frame;
    
    public PoringRunnable(JFrame frame){
        this.frame = frame;
           
    }
    
    public void run(){
        while (true) {
            try {
		Thread.sleep(20);
            } 
            catch (InterruptedException e) {
		e.printStackTrace();
            }
            
            var xDirection = Math.random() < 0.5 ? -1 : 1;
            var yDirection = Math.random() < 0.5 ? -1 : 1;


            var currentX = frame.getX();
            var currentY = frame.getY();
            var newX = currentX + (2 * xDirection);
            var newY = currentY + (2 * yDirection);
            frame.setLocation(newX, newY);

	}
   
    }
 


}

