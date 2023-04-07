import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
public class CalculatorSample implements ActionListener{
    private JFrame fr;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn15, bn16;
    private JPanel pn;
    private JTextField tf;
    
    private double num1;
    private double num2;
    private String operator;
    private double result;
    
    public CalculatorSample(){
        fr = new JFrame("MY Calculator");
        tf = new JTextField();
        tf.setHorizontalAlignment(JTextField.RIGHT);
        pn = new JPanel();
        bn1 = new JButton("7");
        bn2= new JButton("8");
        bn3 = new JButton("9");
        bn4 = new JButton("+");
        bn5 = new JButton("4");
        bn6 = new JButton("5");
        bn7 = new JButton("6");
        bn8 = new JButton("-");
        bn9 = new JButton("1");
        bn10 = new JButton("2");
        bn11 = new JButton("3");
        bn12 = new JButton("x");
        bn13 = new JButton("0");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        bn16 = new JButton("/");
        fr.setLayout(new BorderLayout());
        pn.setLayout(new GridLayout(4, 4));
        
        pn.add(bn1);
        pn.add(bn2);
        pn.add(bn3);
        pn.add(bn4);
        pn.add(bn5);
        pn.add(bn6);
        pn.add(bn7);
        pn.add(bn8);
        pn.add(bn9);
        pn.add(bn10);
        pn.add(bn11);
        pn.add(bn12);
        pn.add(bn13);
        pn.add(bn14);
        pn.add(bn15);
        pn.add(bn16);
        
        fr.add(tf, BorderLayout.NORTH);
        fr.add(pn, BorderLayout.CENTER);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 350);
        fr.setVisible(true);
        
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bn10.addActionListener(this);
        bn11.addActionListener(this);
        bn12.addActionListener(this);
        bn13.addActionListener(this);
        bn14.addActionListener(this);
        bn15.addActionListener(this);
        bn16.addActionListener(this);
        
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        ArrayList op = new ArrayList();
        op.add("+");
        op.add("-");
        op.add("x");
        op.add("/");
        op.add("=");
        op.add("c");
        
        if(!op.contains(e.getActionCommand())){
            tf.setText(tf.getText()+e.getActionCommand());
        
        }
        else{
            if(e.getSource().equals(bn4)){
                num1 = Integer.parseInt(tf.getText());
                operator = "+";
                tf.setText("");
            }
            else if (e.getSource().equals(bn8)){
                num1 = Integer.parseInt(tf.getText());
                operator = "-";
                tf.setText("");
            }
            else if (e.getSource().equals(bn12)){
                num1 = Integer.parseInt(tf.getText());
                operator = "x";
                tf.setText("");
            }
            else if (e.getSource().equals(bn16)){
                num1 = Integer.parseInt(tf.getText());
                operator = "/";
                tf.setText("");
            }
            else if (e.getSource().equals(bn14)){
                tf.setText("");
            }
            else if (e.getSource().equals(bn15)){ // =
                num2 = Integer.parseInt(tf.getText());
                if(operator.equals("+")){
                    result = num1+num2;
                }
                else if (operator.equals("-")){
                    result = num1-num2;
                }
                else if (operator.equals("x")){
                    result = num1*num2;
                }
                else if (operator.equals("/")){
                    result = num1/num2;
                }
                tf.setText(result+"");
                
                
            }
            
        
        
        }
    }   
    
}
