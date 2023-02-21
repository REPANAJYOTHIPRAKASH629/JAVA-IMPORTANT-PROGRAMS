import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ArithmeticOperationsUsingJFrame implements ActionListener {
    JFrame f;
    JLabel num1,num2;
    JButton add,sub,mul,div,mod;
    JTextField num1tf,num2tf,result;
    JPanel panel;
    ArithmeticOperationsUsingJFrame()
    {
        f = new JFrame("Arithmetic Operations Using JFrame");
        num1 = new JLabel("Enter num1 value : ");
        num2 = new JLabel("Enter num2 value : ");
        num1tf = new JTextField();
        num2tf = new JTextField();
        result = new JTextField();
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        mod = new JButton("%");        
        panel = new JPanel(new GridLayout(5,1));
        panel.add(num1);
        panel.add(num1tf);
        panel.add(num2);
        panel.add(num2tf);
        panel.add(add);
        panel.add(sub);
        panel.add(mul);
        panel.add(div);
        panel.add(mod);
        panel.add(result);
        f.add(panel);
        add.addActionListener((ActionListener) this);
        sub.addActionListener((ActionListener) this);
        mul.addActionListener((ActionListener) this);
        div.addActionListener((ActionListener) this);
        mod.addActionListener((ActionListener) this);
        f.setLayout(new GridLayout(1,1));
        f.setSize(600,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();
        char ch = s.charAt(0);
        if(ch == '+')
        {
            int a = Integer.parseInt(num1tf.getText());
            int b = Integer.parseInt(num2tf.getText());
            int c = a+b;
            result.setText("Addition is : "+c);
        }
        if(ch == '-')
        {
            int a = Integer.parseInt(num1tf.getText());
            int b = Integer.parseInt(num2tf.getText());
            int c = a-b;
            result.setText("Substraction is : "+c);
        }
        if(ch == '*')
        {
            int a = Integer.parseInt(num1tf.getText());
            int b = Integer.parseInt(num2tf.getText());
            int c = a*b;
            result.setText("Multiplication is : "+c);
        }
        if(ch == '/')
        {
            int a = Integer.parseInt(num1tf.getText());
            int b = Integer.parseInt(num2tf.getText());
            int c = a/b;
            result.setText("Division is : "+c);
        }
        if(ch == '%')
        {
            int a = Integer.parseInt(num1tf.getText());
            int b = Integer.parseInt(num2tf.getText());
            int c = a%b;
            result.setText("Modulus is : "+c);
        }
    }
    public static void main(String args[])
    {
        ArithmeticOperationsUsingJFrame  e = new ArithmeticOperationsUsingJFrame();        
    }
}