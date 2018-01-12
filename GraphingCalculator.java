import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphingCalculator extends JFrame implements ActionListener{
    private JFrame frame;
    private JPanel Constant, Linear, Quadratic, Cubic;
    private JButton B1, B2, B3, B4, BC1, BC2, BC3, BC4;
    private JTextField TF1, TF2, TF3, TF4;
    private JLabel L1, L2, L3, L4, LH1, LH2, LH3, LH4;

    public GraphingCalculator() {
    frame = new JFrame("Window");
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    Constant = new JPanel();
    Linear = new JPanel();
    Quadratic = new JPanel();
    Cubic = new JPanel();

    Constant.setLayout(new FlowLayout());
    Linear.setLayout(new FlowLayout());
    Quadratic.setLayout(new FlowLayout());
    Cubic.setLayout(new FlowLayout());

    B1 = new JButton("Graph Constant Function");
    B2 = new JButton("Graph Linear Function");
    B3 = new JButton("Graph Quadratic Function");
    B4 = new JButton("Graph Cubic Function");

    BC1 = new JButton("Cycle To Linear");
    BC2 = new JButton("Cycle To Quadratic");
    BC3 = new JButton("Cycle To Cubic");
    BC4 = new JButton("Cycle To Constant");

    TF1 = new JTextField(16);
    TF2 = new JTextField(16);
    TF3 = new JTextField(16);
    TF4 = new JTextField(16);

    LH1 = new JLabel("You are on the Constant Tab");
    LH1 = new JLabel("You are on the Linear Tab");
    LH1 = new JLabel("You are on the Quadratic Tab");
    LH1 = new JLabel("You are on the Cubic Tab");

    L1 = new JLabel("Constant Coefficient");
    L2 = new JLabel("Linear Coefficient");
    L3 = new JLabel("Quadratic Coefficient");
    L4 = new JLabel("Cubic Coefficient");

    B1.addActionListener(this);
    B2.addActionListener(this);
    B3.addActionListener(this);
    B4.addActionListener(this);

    BC1.addActionListener(this);
    BC2.addActionListener(this);
    BC3.addActionListener(this);
    BC4.addActionListener(this);

    TF1.addActionListener(this);
    TF2.addActionListener(this);
    TF3.addActionListener(this);
    TF4.addActionListener(this);


    Constant.add(LH1);
    Constant.add(BC1);
    Constant.add(L1);
    Constant.add(TF1);
    Constant.add(B1);

    Linear.add(LH2);
    Linear.add(BC2);
    Linear.add(L1);
    Linear.add(TF1);
    Linear.add(L2);
    Linear.add(TF2);
    Linear.add(B2);

    Quadratic.add(LH3);
    Quadratic.add(BC3);
    Quadratic.add(L1);
    Quadratic.add(TF1);
    Quadratic.add(L2);
    Quadratic.add(TF2);
    Quadratic.add(L3);
    Quadratic.add(TF3);
    Quadratic.add(B3);

    Cubic.add(LH4);
    Cubic.add(BC4);
    Cubic.add(L1);
    Cubic.add(TF1);
    Cubic.add(L2);
    Cubic.add(TF2);
    Cubic.add(L3);
    Cubic.add(TF3);
    Cubic.add(L4);
    Cubic.add(TF4);
    Cubic.add(B4);
    frame.setContentPane(Constant);
    frame.setSize(800,500);
    frame.setLocation(100,100);
    frame.setVisible(true);
    }

  public void actionPerformed(ActionEvent e) {
	   JButton button = (JButton) e.getSource();
     if (button == BC1){
		     frame.setContentPane(Linear);
		     frame.repaint();
         frame.setVisible(true);
	   }

	   if (button == BC2){
	    frame.setContentPane(Quadratic);
       frame.repaint();
      frame.setVisible(true);
    }
    if (button == BC3){
 	    frame.setContentPane(Cubic);
       frame.repaint();
      frame.setVisible(true);
    }
    }

    public static void main(String[]args){
	GraphingCalculator g = new GraphingCalculator();
	g.setVisible(true);
    }
}
