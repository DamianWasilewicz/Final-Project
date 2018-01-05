import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwitchUsingButtons extends JFrame implements ActionListener{
    private Container pane;
    private JButton t1;
    private JTextField tf1;
    private JLabel l1;
    private JButton t2;
    private JTextField tf2;
    private JLabel l2;
    private JButton t3;
    private JTextField tf3;
    private JLabel l3;
    
    public SwitchUsingButtons() {
        this.setTitle("Tabbed Window Using Buttons");
        this.setSize(175,165);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
        pane.setLayout(new FlowLayout());


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

        pane.add(t1);
	pane.add(t2);
	pane.add(t3);
    }

    public void actionPerformed(ActionEvent e) {
	String s = e.getActionCommand();
	if (s.equals("First Tab")){
	    pane.add(tf1);
	    pane.add(l1);
	}
	else if (s.equals("Second Tab")){
	    pane.add(tf2);
	    pane.add(l2);
	}
	else if (s.equals("Third Tab")){
	    pane.add(tf3);
	    pane.add(l3);
	}
    }

    public static void main(String[]args){
	SwitchUsingButtons g = new SwitchUsingButtons();
        g.setVisible(true);
    }
}
