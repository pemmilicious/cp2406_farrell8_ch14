/**
 * Created by jc320658 on 19/09/16.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton b = new JButton("Press to change fact");
    JLabel f1 = new JLabel("The Ottoman Empire’s Sultan Ibrahim I had 280 of his concubines drowned in the ocean after one of them slept with another man.");
    JLabel f2 = new JLabel("In medieval times people were put to death for being witches. One anthropologist conjectures as many as 600,000 “witches” lost their lives.                     ");
    JLabel f3 = new JLabel("Mexican General Santa Anna had an elaborate state funeral for his amputated leg.");
    JLabel f4 = new JLabel(" Tens of thousands of baby girls were abandoned each year in China because of the country’s one-child policy.    ");
    JLabel f5 = new JLabel("Before the mid-19th century dentures were commonly made with teeth pulled from the mouths of dead soldiers");
    int counter = 0;
    public JHistoricalFacts()
    {
        super("Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(b);
        add(f1);
        b.addActionListener(this);
    }
    public static void main(String[] args)
    {
        JHistoricalFacts rFrame = new JHistoricalFacts();
        rFrame.setSize(900,100);
        rFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++counter;
        if(counter == 5)
            counter = 0;
        if(counter == 1)
        {
            remove(f1);
            add(f2);
        }
        else
        if(counter == 2)
        {
            remove(f2);
            add(f3);
        }
        else
        if(counter == 3)
        {
            remove(f3);
            add(f4);
        }
        else
        if(counter == 4)
        {
            remove(f4);
            add(f5);
        }
        else
        {
            remove(f5);
            add(f1);
        }

        validate();
        repaint();
    }

}