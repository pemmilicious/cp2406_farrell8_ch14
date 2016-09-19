/**
 * Created by jc320658 on 19/09/16.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JFrameDisableButton extends JFrame implements ActionListener
{
    int SIZE = 180;
    Container con = getContentPane();
    JButton button = new JButton("pls touch me");
    int presses = 0;
    int maxPresses = 8;
    JLabel label = new JLabel("okay thats enough");
    public JFrameDisableButton()
    {
        super("Frame");
        con.setLayout(new FlowLayout());
        setSize(SIZE, SIZE);
        setVisible(true);
        con.add(button);
        con.add(label);
        label.setVisible(false);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++presses;
        if(presses == maxPresses)
        {
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        JFrameDisableButton aFrame = new JFrameDisableButton();
        aFrame.setSize(260, 150);
        aFrame.setVisible(true);
    }
}

