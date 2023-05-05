import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Poring implements MouseListener{
    private JFrame frame;
    private JLabel label, image_label;
    private ImageIcon poring;
    private PoringRunnable run;
    
    public Poring(int count){
        frame = new JFrame();
        frame.setVisible(true);
        label = new JLabel(Integer.toString(count));
        label.setFont(new Font("Monospace", Font.BOLD, 15)); //setfont label
        image_label = new JLabel();
        poring = new ImageIcon("poring.png");
        frame.setLayout(new FlowLayout());
        image_label.setIcon(poring);
        frame.add(image_label);
        frame.add(label);
        
        run = new PoringRunnable(frame);
        Thread thread = new Thread(run);
        thread.start();
        frame.setResizable(false);
        
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(180, 145);
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	frame.setLocation((int) (Math.random() * (dimension.getWidth() - frame.getWidth())), (int) (Math.random() * (dimension.getHeight() - frame.getHeight())));
        image_label.addMouseListener(this);
    }   
    
    
    @Override
    public void mouseClicked(MouseEvent ev) {}
        
    @Override
    public void mousePressed(MouseEvent ev) {frame.dispose();}
   
    @Override
    public void mouseReleased(MouseEvent ev) {}
        
    @Override
    public void mouseEntered(MouseEvent ev) {}

    @Override
    public void mouseExited(MouseEvent ev) {}
    
    
    
}

