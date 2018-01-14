import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;

public class PanelButtons extends JFrame implements ActionListener{
    private JFrame frame;
    private JPanel panel0, panel1, panel2;
    private JButton t1, t2;
    private JTextField tf1;
    private JLabel l1, l2, test;
	private TitledBorder title;

    public PanelButtons() {
    frame = new JFrame("Window");
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


    panel0 = new JPanel();
    panel1 = new JPanel();
    panel2 = new JPanel();

    panel0.setLayout(new BorderLayout());

    t1 = new JButton("     Button     ");
    t2 = new JButton("Other Button");
    tf1 = new JTextField(16);
    l1 = new JLabel("This is a label");
    l2 = new JLabel("This is also a label");
    test = new JLabel("Please work");

    t1.addActionListener(this);
    tf1.addActionListener(this);
    t2.addActionListener(this);

    panel0.add(t1, BorderLayout.NORTH);
    panel0.add(tf1, BorderLayout.CENTER);
    panel0.add(l1, BorderLayout.SOUTH);
    panel1.add(t2);
    panel1.add(l2);
    panel2.add(test);
	
	title = BorderFactory.createTitledBorder("Button 1");
	t1.setBorder(title);

    frame.setContentPane(panel0);
	frame.add(panel0);
	frame.add(panel1);
    frame.setSize(500,500);
    frame.setLocation(100,100);
    frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
	JButton button = (JButton) e.getSource();

	//System.out.println(button);
	//System.out.println(t1);
	if (button == t1){
		frame.setContentPane(panel1);
		frame.repaint();
		frame.setVisible(true);
	}
	else if (button == t2){
	    //frame.remove(panel1);
	    frame.setContentPane(panel0);
      frame.repaint();
		frame.setVisible(true);
	    }
	}

    public static void main(String[]args){
		PanelButtons g = new PanelButtons();
    }
}
