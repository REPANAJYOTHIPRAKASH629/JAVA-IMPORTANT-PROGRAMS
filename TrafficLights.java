import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventObject;

public class TrafficLights implements ItemListener
{
    JFrame f;
    JLabel l;
    JRadioButton red,green,orange;
    JPanel panel;
    TrafficLights()
    {
        f = new JFrame("Traffic Light Signal");
        l = new JLabel();
        l.setBounds(200,10,200,30);
        l.setFont(new Font("alphia",Font.ITALIC,30));
        f.add(l);
        red = new JRadioButton("Red");
        green = new JRadioButton("Green");
        orange = new JRadioButton("Orange");
        ButtonGroup bg = new ButtonGroup();
        bg.add(red);
        bg.add(green);
        bg.add(orange);
        panel = new JPanel();
        panel.setBounds(150,50,200,30);
        panel.add(red);
        panel.add(green);
        panel.add(orange);
        red.addItemListener((ItemListener) this);
        green.addItemListener(this);
        orange.addItemListener(this);
        f.add(panel);
        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void itemStateChanged(ItemEvent ie)
    {
        JRadioButton rb = (JRadioButton)((EventObject) ie).getSource();
        String s = rb.getText();
        if(s.equals("Red"))
        {
            l.setForeground(Color.RED);
            l.setText(s);
        }
        if(s.equals("Green"))
        {
            l.setForeground(Color.GREEN);
            l.setText(s);
        }
        if(s.equals("Orange"))
        {
            l.setForeground(Color.ORANGE);
            l.setText(s);
        }
    }
    public static void main(String args[])
    {
        TrafficLights e = new TrafficLights();
    }
}