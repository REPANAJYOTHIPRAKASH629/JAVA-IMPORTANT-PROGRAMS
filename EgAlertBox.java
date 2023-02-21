import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class EgAlertBox implements ActionListener
{
    JTextField t1,t2,restf,etf;
    JFrame f,f1;
    JPanel p,p1;
    EgAlertBox()
    {
        f=new JFrame("Arithemetic operations");
        JLabel l=new JLabel("First Number");
        t1=new JTextField();
        JLabel l1=new JLabel("Second Number");
        t2=new JTextField();
        JButton bd=new JButton("/");
        restf=new JTextField();
        p=new JPanel(new GridLayout(4,1));
        p.add(l);
        p.add(t1);
        p.add(l1);
        p.add(t2);
        p.add(bd);
        p.add(restf);
        bd.addActionListener(this);
        f.add(p);
        f.setSize(700,400);
        f.setLayout(new GridLayout(4,1));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if (s.charAt(0)=='/')
        {
            try
            {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                restf.setText(""+(a/b));
            }
            catch(Exception e)
            {
                f1=new JFrame("Exception Window");
                p1=new JPanel(new GridLayout(1,1));
                etf=new JTextField();
                etf.setText(""+e);
                p1.add(etf);
                f1.add(p1);
                f1.setSize(400,200);
                f1.setLayout(new GridLayout(4,1));
                f1.setVisible(true);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
public static void main(String args[])
{
    EgAlertBox s=new EgAlertBox();
}
}