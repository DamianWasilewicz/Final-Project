import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwitchUsingButtons extends JFrame implements ActionListener{
    private JFrame frame;
	private JPanel panel0, panel1, panel2, panel3;
    private JButton t1, t2, t3;
    private JTextField tf1, tf2, tf3;
    private JLabel l1, l2, l3;
    
    public SwitchUsingButtons() {
        frame = new JFrame("Window");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


	panel0 = new JPanel();
	panel1 = new JPanel();
	panel2 = new JPanel();
	panel3 = new JPanel();

    panel0.setLayout(new FlowLayout());

	t1 = new JButton("First Tab");
    tf1 = new JTextField(12);
	l1 = new JLabel("This is the first tab");
	t2 = new JButton("Second Tab");
	tf2 = new JTextField(12);
	l2 = new JLabel("This is the second tab");
	t3 = new JButton("Third Tab");
    tf3 = new JTextField(12);
	l3 = new JLabel("This is the third tab");

        t1.addActionListener(this);
        tf1.addActionListener(this);
        t2.addActionListener(this);
        tf2.addActionListener(this);
        t3.addActionListener(this);
        tf3.addActionListener(this);

    panel0.add(t1);
	panel0.add(t2);
	panel0.add(t3);

	panel1.add(t1);
	panel1.add(t2);
	panel1.add(t3);
	panel1.add(tf1);
	panel1.add(l1);
	
	panel2.add(t1);
	panel2.add(t2);
	panel2.add(t3);
	panel2.add(tf2);
	panel2.add(l2);
	
	panel3.add(t1);
	panel3.add(t2);
	panel3.add(t3);
	panel3.add(tf3);
	panel3.add(l3);

	frame.setContentPane(panel1);
    frame.setSize(500,500);
    frame.setLocation(100,100);
	frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
	JButton button = (JButton) e.getSource();
	if (button == t1){
	    frame.remove(panel0);
		frame.setContentPane(panel1);
	}
	else if (button == t2){
	    frame.remove(panel1);
		frame.setContentPane(panel2);
	}
	else if (button == t3){
	    frame.remove(panel2);
		frame.setContentPane(panel3);
	}
    }

    public static void main(String[]args){
	SwitchUsingButtons g = new SwitchUsingButtons();
    }
}
