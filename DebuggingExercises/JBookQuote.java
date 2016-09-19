/**
 * Created by jc320658 on 17/09/16.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel quote = new  JLabel("You wanna hit this ranch?");
    JButton button = new JButton("Button");
    JLabel book = new JLabel("It's the Eric Andre Show");
    public JBookQuote()
    {
        super("Book Quote 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(quote);
        add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(book);
        validate();
        repaint();
    }
    public static void main(String[] args)
    {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setSize(600, 150);
        aFrame.setVisible(true);
    }
}