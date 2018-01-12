import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FinalProjectGUI extends JFrame implements ActionListener{
    private JFrame frame;
    private JPanel panel0, panel1;
    private JButton t1, t2;
    private JTextField tf1;
    private JLabel l1, l2;
    
    public FinalProjectGUI() {
    frame = new JFrame("Graphing Calculator");
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


    panel0 = new JPanel();
    panel1 = new JPanel();
    panel2 = new JPanel();

    panel0.setLayout(new FlowLayout());

    t1 = new JButton("Linear");
    t2 = new JButton("Quadratic");
    t3 = new JButton("Cubic");
    tf1 = new JTextField(16);
    l1 = new JLabel("Linear");
    l2 = new JLabel("Quadratic");
    l3 = new JLabel("Cubic");

    t1.addActionListener(this);
    tf1.addActionListener(this);
    t2.addActionListener(this);
    t3.addActionListener(this);
    
    panel0.add(t1);
    panel0.add(tf1);
    panel0.add(l1);
    panel1.add(t2);
    panel1.add(l2);
    panel2.add(t3);
    panel2.add(l3);
    
    frame.setContentPane(panel0);
    frame.setSize(500,500);
    frame.setLocation(100,100);
    frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
	JButton button = (JButton) e.getSource();
	if (button == t1){
		frame.setContentPane(panel1);
		frame.repaint();
		frame.setVisible(true);
	}
	else if (button == t2){
	    frame.setContentPane(panel0);
	}
    }

    public static void main(String[]args){
	PanelButtons g = new PanelButtons();
    }
}
