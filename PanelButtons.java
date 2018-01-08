import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelButtons extends JFrame implements ActionListener{
    private JFrame frame;
    private JPanel panel0;
    private JButton t1;
    private JTextField tf1;
    private JLabel l1;
    
    public PanelButtons() {
    frame = new JFrame("Window");
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


    panel0 = new JPanel();

    panel0.setLayout(new FlowLayout());

    t1 = new JButton("Button");
    tf1 = new JTextField(16);
    l1 = new JLabel("This is a label");


    t1.addActionListener(this);
    tf1.addActionListener(this);


    panel0.add(t1);
    panel0.add(tf1);
    panel0.add(l1);

    frame.setContentPane(panel0);
    frame.setSize(500,500);
    frame.setLocation(100,100);
    frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
	JButton button = (JButton) e.getSource();
	if (button == t1){
	    tf1.setText("You pressed the button");
	}
    }

    public static void main(String[]args){
	PanelButtons g = new PanelButtons();
    }
}
