import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphingCalculator extends JFrame implements ActionListener{
    private JFrame frame;
    private JPanel Constant, Linear, Quadratic, Cubic, Fun;
    private JButton B1, B2, B3, B4, BC1, BC2, BC3, BC4, BG1;
    private JTextField TF1c, TF1l , TF2l, TF1q, TF2q, TF3q, TF1cu, TF2cu, TF3cu, TF4cu;
    private JLabel L1c, L1l , L2l, L1q, L2q, L3q, L1cu, L2cu, L3cu, L4cu, LH1, LH2, LH3, LH4;

    public GraphingCalculator() {
    frame = new JFrame("Window");
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    Constant = new JPanel();
    Linear = new JPanel();
    Quadratic = new JPanel();
    Cubic = new JPanel();
    Fun= new JPanel();

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

    BG1 = new JButton("GRAPH IT");

    TF1c = new JTextField(5);
    TF1l = new JTextField(5);
    TF1q = new JTextField(5);
    TF1cu = new JTextField(5);
    TF2l = new JTextField(5);
    TF2q = new JTextField(5);
    TF2cu = new JTextField(5);
    TF3q = new JTextField(5);
    TF3cu = new JTextField(5);
    TF4cu = new JTextField(5);

    LH1 = new JLabel("You are on the Constant Tab");
    LH2 = new JLabel("You are on the Linear Tab");
    LH3 = new JLabel("You are on the Quadratic Tab");
    LH4 = new JLabel("You are on the Cubic Tab");

    L1c = new JLabel("Constant Coefficient");
    L1l = new JLabel("Constant Coefficient");
    L1q = new JLabel("Constant Coefficient");
    L1cu = new JLabel("Constant Coefficient");
    L2l = new JLabel("Linear Coefficient");
    L2q = new JLabel("Linear Coefficient");
    L2cu = new JLabel("Linear Coefficient");
    L3q = new JLabel("Quadratic Coefficient");
    L3cu = new JLabel("Quadratic Coefficient");
    L4cu = new JLabel("Cubic Coefficient");

    B1.addActionListener(this);
    B2.addActionListener(this);
    B3.addActionListener(this);
    B4.addActionListener(this);

    BC1.addActionListener(this);
    BC2.addActionListener(this);
    BC3.addActionListener(this);
    BC4.addActionListener(this);

    BG1.addActionListener(this);

    TF1c.addActionListener(this);
    TF1l.addActionListener(this);
    TF2l.addActionListener(this);
    TF1q.addActionListener(this);
    TF2q.addActionListener(this);
    TF3q.addActionListener(this);
    TF1cu.addActionListener(this);
    TF2cu.addActionListener(this);
    TF3cu.addActionListener(this);
    TF4cu.addActionListener(this);


    Constant.add(LH1);
    Constant.add(BC1);
    Constant.add(L1c);
    Constant.add(TF1c);
    Constant.add(B1);

    Linear.add(LH2);
    Linear.add(BC2);
    Linear.add(L1l);
    Linear.add(TF1l);
    Linear.add(L2l);
    Linear.add(TF2l);
    Linear.add(B2);

    Quadratic.add(LH3);
    Quadratic.add(BC3);
    Quadratic.add(L1q);
    Quadratic.add(TF1q);
    Quadratic.add(L2q);
    Quadratic.add(TF2q);
    Quadratic.add(L3q);
    Quadratic.add(TF3q);
    Quadratic.add(B3);

    Cubic.add(LH4);
    Cubic.add(BC4);
    Cubic.add(L1cu);
    Cubic.add(TF1cu);
    Cubic.add(L2cu);
    Cubic.add(TF2cu);
    Cubic.add(L3cu);
    Cubic.add(TF3cu);
    Cubic.add(L4cu);
    Cubic.add(TF4cu);
    Cubic.add(B4);
    Cubic.add(BG1);


    frame.setContentPane(Constant);
    frame.setSize(1400,400);
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

	   else if (button == BC2){
	    frame.setContentPane(Quadratic);
      frame.repaint();
      frame.setVisible(true);

    }
    else if (button == BC3){
 	    frame.setContentPane(Cubic);
      frame.repaint();
      frame.setVisible(true);
      }


    else if (button == BC4){
 	    frame.setContentPane(Constant);
      frame.repaint();
      frame.setVisible(true);


    }
    else if (button == BG1){
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Function test = new Function();
      test.setC(Double.parseDouble(TF1cu.getText()));
      test.setX1(Double.parseDouble(TF2cu.getText()));
      test.setX2(Double.parseDouble(TF3cu.getText()));
      test.setX3(Double.parseDouble(TF4cu.getText()));
      CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3());
      test.setRoots(check.getRoots());
      test.setData(check.getX());
      test.setData1(check.getY());
      //test.setRoots(check.getRoots());
//test.SetMaxandMin(test.ymax(), test.ymin());
      f.add(test);
      f.setSize(1000, 1000);
      f.setLocation(200,200);
      f.setVisible(true);




    }
    }

    public static void main(String[]args){
	GraphingCalculator g = new GraphingCalculator();
	g.setVisible(true);
    }
}
