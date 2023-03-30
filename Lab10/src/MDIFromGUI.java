import java.awt.*;
import javax.swing.*;

public class MDIFromGUI extends JFrame{
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2;
    public MDIFromGUI() {
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Frame 1", true, true, true,true);
        frame2 = new JInternalFrame("Frame 2", true, true, true,true); 
        
        this.pack();
        this.setVisible(true);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        
        
        
        
    }
}
