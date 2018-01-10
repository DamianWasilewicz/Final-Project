import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelButtons extends JFrame implements ActionListener{
    private JFrame frame;
    private JPanel panel0, panel1;
    private JButton t1, t2;
    private JTextField tf1;
    private JLabel l1, l2;
    
    public PanelButtons() {
    frame = new JFrame("Window");
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


    panel0 = new JPanel();
    panel1 = new JPanel();

    panel0.setLayout(new FlowLayout());

    t1 = new JButton("Button");
    t2 = new JButton("Other Button");
    tf1 = new JTextField(16);
    l1 = new JLabel("This is a label");
    l2 = new JLabel("This is also a label");

    t1.addActionListener(this);
    tf1.addActionListener(this);
    t2.addActionListener(this);

    panel0.add(t1);
    panel0.add(tf1);
    panel0.add(l1);
    panel1.add(t2);
    panel1.add(l2);

    frame.setContentPane(panel0);
    frame.setSize(500,500);
    frame.setLocation(100,100);
    frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
	JButton button = (JButton) e.getSource();
	
	//System.out.println(button);
	//System.out.println(t1);
	if (button == t1){
	    //frame.remove(panel0);
		frame.setContentPane(panel1);
		frame.repaint();
		//tf1.setText("If text shows up, button works");
	}
	else if (button == t2){
	    //frame.remove(panel1);
	    frame.setContentPane(panel0);
	    }
    }

    public static void main(String[]args){
	PanelButtons g = new PanelButtons();
	g.setVisible(true);
    }
}
