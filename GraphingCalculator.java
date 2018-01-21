import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphingCalculator extends JFrame implements ActionListener{
    private JFrame frame;
    private JPanel Constant, Linear, Quadratic, Cubic, Fourth, Fifth, Sixth;
    private JButton B1, B2, B3, B4, B5, B6, B7;
    private JComboBox boxCons, boxLine, boxQuad, boxCube, boxQuar, boxQuin, boxSext;
    private JTextField TF1c, TF1l , TF2l, TF1q, TF2q, TF3q, TF1cu, TF2cu, TF3cu, TF4cu, TF1fourth, TF2fourth, TF3fourth, TF4fourth, TF5fourth, TF1fifth, TF2fifth, TF3fifth, TF4fifth, TF5fifth, TF6fifth, TF1sixth, TF2sixth, TF3sixth, TF4sixth, TF5sixth, TF6sixth, TF7sixth;
    private JLabel L1c, L1l , L2l, L1q, L2q, L3q, L1cu, L2cu, L3cu, L4cu, L1fourth, L2fourth, L3fourth, L4fourth, L5fourth, L1fifth, L2fifth, L3fifth, L4fifth, L5fifth, L6fifth, L1sixth, L2sixth, L3sixth, L4sixth, L5sixth, L6sixth, L7sixth,  LH1, LH2, LH3, LH4, LH5, LH6, LH7;

    public GraphingCalculator() {
    frame = new JFrame("Window");
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    Constant = new JPanel();
    Linear = new JPanel();
    Quadratic = new JPanel();
    Cubic = new JPanel();
    Fourth= new JPanel();
    Fifth= new JPanel();
    Sixth= new JPanel();

    Constant.setLayout(new FlowLayout());
    Linear.setLayout(new FlowLayout());
    Quadratic.setLayout(new FlowLayout());
    Cubic.setLayout(new FlowLayout());
    Fourth.setLayout(new FlowLayout());
    Fifth.setLayout(new FlowLayout());
    Sixth.setLayout(new FlowLayout());

    B1 = new JButton("Graph Constant Function");
    B2 = new JButton("Graph Linear Function");
    B3 = new JButton("Graph Quadratic Function");
    B4 = new JButton("Graph Cubic Function");
    B5 = new JButton("Graph Fourth Degree Function");
    B6 = new JButton("Graph Fifth Degree Function");
    B7 = new JButton("Graph Sixth Degree Function");


    /*BC1 = new JButton("Cycle To Linear");
    BC2 = new JButton("Cycle To Quadratic");
    BC3 = new JButton("Cycle To Cubic");
    BC4 = new JButton("Cycle To Fourth Degree");
    BC5= new JButton("Cycle To Fifth Degree");
    BC6 = new JButton("Cycle To Sixth Degree");
    BC7 = new JButton("Cycle To Constant");*/




    String[] typesOfFunctions = {"Constant", "Linear", "Quadratic",
				 "Cubic", "Quartic", "Quintic", "Sextic"};


    JComboBox boxCons = new JComboBox(typesOfFunctions);
    JComboBox boxLine = new JComboBox(typesOfFunctions);
    JComboBox boxQuad = new JComboBox(typesOfFunctions);
    JComboBox boxCube = new JComboBox(typesOfFunctions);
    JComboBox boxQuar = new JComboBox(typesOfFunctions);
    JComboBox boxQuin = new JComboBox(typesOfFunctions);
    JComboBox boxSext = new JComboBox(typesOfFunctions);



    TF1c = new JTextField(5);
    TF1l = new JTextField(5);
    TF1q = new JTextField(5);
    TF1cu = new JTextField(5);
    TF1fourth = new JTextField(5);
    TF1fifth = new JTextField(5);
    TF1sixth = new JTextField(5);

    TF2l = new JTextField(5);
    TF2q = new JTextField(5);
    TF2cu = new JTextField(5);
    TF2fourth = new JTextField(5);
    TF2fifth = new JTextField(5);
    TF2sixth = new JTextField(5);


    TF3q = new JTextField(5);
    TF3cu = new JTextField(5);
    TF3fourth = new JTextField(5);
    TF3fifth = new JTextField(5);
    TF3sixth = new JTextField(5);


    TF4cu = new JTextField(5);
    TF4fourth = new JTextField(5);
    TF4fifth = new JTextField(5);
    TF4sixth = new JTextField(5);


    TF5fourth = new JTextField(5);
    TF5fifth = new JTextField(5);
    TF5sixth = new JTextField(5);


    TF6fifth = new JTextField(5);
    TF6sixth = new JTextField(5);

    TF7sixth = new JTextField(5);




    LH1 = new JLabel("You are on the Constant Tab");
    LH2 = new JLabel("You are on the Linear Tab");
    LH3 = new JLabel("You are on the Quadratic Tab");
    LH4 = new JLabel("You are on the Cubic Tab");
    LH5 = new JLabel("You are on the Fourth Degree Tab");
    LH6 = new JLabel("You are on the Fifth Degree Tab");
    LH7 = new JLabel("You are on the Sixth Degree Tab");

    L1c = new JLabel("Constant Coefficient");
    L1l = new JLabel("Constant Coefficient");
    L1q = new JLabel("Constant Coefficient");
    L1cu = new JLabel("Constant Coefficient");
    L1fourth = new JLabel("Constant Coefficient");
    L1fifth = new JLabel("Constant Coefficient");
    L1sixth = new JLabel("Constant Coefficient");

    L2l = new JLabel("Linear Coefficient");
    L2q = new JLabel("Linear Coefficient");
    L2cu = new JLabel("Linear Coefficient");
    L2fourth = new JLabel("Linear Coefficient");
    L2fifth = new JLabel("Linear Coefficient");
    L2sixth = new JLabel("Linear Coefficient");


    L3q = new JLabel("Quadratic Coefficient");
    L3cu = new JLabel("Quadratic Coefficient");
    L3fourth = new JLabel("Quadratic Coefficient");
    L3fifth = new JLabel("Quadratic Coefficient");
    L3sixth = new JLabel("Quadratic Coefficient");

    L4cu = new JLabel("Cubic Coefficient");
    L4fourth = new JLabel("Cubic Coefficient");
    L4fifth = new JLabel("Cubic Coefficient");
    L4sixth = new JLabel("Cubic Coefficient");

    L5fourth = new JLabel("Fourth Degree Coefficient");
    L5fifth = new JLabel("Fourth Degree Coefficient");
    L5sixth = new JLabel("Fourth Degree Coefficient");


    L6fifth = new JLabel("Fifth Degree Coefficient");
    L6sixth = new JLabel("Fifth Degree Coefficient");

    L7sixth = new JLabel("Sixth Degree Coefficient");



    B1.addActionListener(this);
    B2.addActionListener(this);
    B3.addActionListener(this);
    B4.addActionListener(this);
    B5.addActionListener(this);
    B6.addActionListener(this);
    B7.addActionListener(this);

    boxCons.addActionListener(this);
    boxLine.addActionListener(this);
    boxQuad.addActionListener(this);
    boxCube.addActionListener(this);
    boxQuar.addActionListener(this);
    boxQuin.addActionListener(this);
    boxSext.addActionListener(this);

    TF1c.addActionListener(this);
    TF1l.addActionListener(this);
    TF1q.addActionListener(this);
    TF1cu.addActionListener(this);
    TF1fourth.addActionListener(this);
    TF1fifth.addActionListener(this);
    TF1sixth.addActionListener(this);

    TF2l.addActionListener(this);
    TF2q.addActionListener(this);
    TF2cu.addActionListener(this);
    TF2fourth.addActionListener(this);
    TF2fifth.addActionListener(this);
    TF2sixth.addActionListener(this);


    TF3q.addActionListener(this);
    TF3cu.addActionListener(this);
    TF3fourth.addActionListener(this);
    TF3fifth.addActionListener(this);
    TF3sixth.addActionListener(this);


    TF4cu.addActionListener(this);
    TF4fourth.addActionListener(this);
    TF4fifth.addActionListener(this);
    TF4sixth.addActionListener(this);


    TF5fourth.addActionListener(this);
    TF5fifth.addActionListener(this);
    TF5sixth.addActionListener(this);


    TF6fifth.addActionListener(this);
    TF6sixth.addActionListener(this);

    TF7sixth.addActionListener(this);



    Constant.add(LH1);
    Constant.add(boxCons);
    Constant.add(L1c);
    Constant.add(TF1c);
    Constant.add(B1);

    Linear.add(LH2);
    Linear.add(boxLine);
    Linear.add(L1l);
    Linear.add(TF1l);
    Linear.add(L2l);
    Linear.add(TF2l);
    Linear.add(B2);

    Quadratic.add(LH3);
    Quadratic.add(boxQuad);
    Quadratic.add(L1q);
    Quadratic.add(TF1q);
    Quadratic.add(L2q);
    Quadratic.add(TF2q);
    Quadratic.add(L3q);
    Quadratic.add(TF3q);
    Quadratic.add(B3);

    Cubic.add(LH4);
    Cubic.add(boxCube);
    Cubic.add(L1cu);
    Cubic.add(TF1cu);
    Cubic.add(L2cu);
    Cubic.add(TF2cu);
    Cubic.add(L3cu);
    Cubic.add(TF3cu);
    Cubic.add(L4cu);
    Cubic.add(TF4cu);
    Cubic.add(B4);


    Fourth.add(LH5);
    Fourth.add(boxQuar);
    Fourth.add(L1fourth);
    Fourth.add(TF1fourth);
    Fourth.add(L2fourth);
    Fourth.add(TF2fourth);
    Fourth.add(L3fourth);
    Fourth.add(TF3fourth);
    Fourth.add(L4fourth);
    Fourth.add(TF4fourth);
    Fourth.add(L5fourth);
    Fourth.add(TF5fourth);
    Fourth.add(B5);


    Fifth.add(LH6);
    Fifth.add(boxQuin);
    Fifth.add(L1fifth);
    Fifth.add(TF1fifth);
    Fifth.add(L2fifth);
    Fifth.add(TF2fifth);
    Fifth.add(L3fifth);
    Fifth.add(TF3fifth);
    Fifth.add(L4fifth);
    Fifth.add(TF4fifth);
    Fifth.add(L5fifth);
    Fifth.add(TF5fifth);
    Fifth.add(L6fifth);
    Fifth.add(TF6fifth);
    Fifth.add(B6);

    Sixth.add(LH7);
    Sixth.add(boxSext);
    Sixth.add(L1sixth);
    Sixth.add(TF1sixth);
    Sixth.add(L2sixth);
    Sixth.add(TF2sixth);
    Sixth.add(L3sixth);
    Sixth.add(TF3sixth);
    Sixth.add(L4sixth);
    Sixth.add(TF4sixth);
    Sixth.add(L5sixth);
    Sixth.add(TF5sixth);
    Sixth.add(L6sixth);
    Sixth.add(TF6sixth);
    Sixth.add(L7sixth);
    Sixth.add(TF7sixth);
    Sixth.add(B7);




    frame.setContentPane(Constant);
    frame.setSize(1400,400);
    frame.setLocation(100,100);
    frame.setVisible(true);
    }

  public void actionPerformed(ActionEvent e) {
	try{   
	JComboBox box = (JComboBox) e.getSource();
	System.out.println(((String)box.getSelectedItem()));
    if (((String)box.getSelectedItem()).equals("Linear")){
			//TF1c.setText("42");
		    frame.setContentPane(Linear);
		    frame.repaint();
            frame.setVisible(true);
	   }

    else if (((String)box.getSelectedItem()).equals("Quadratic")){
	    frame.setContentPane(Quadratic);
      frame.repaint();
      frame.setVisible(true);
    }

    else if (((String)box.getSelectedItem()).equals("Cubic")){
 	    frame.setContentPane(Cubic);
      frame.repaint();
      frame.setVisible(true);
      }

    else if (((String)box.getSelectedItem()).equals("Quartic")){
 	    frame.setContentPane(Fourth);
      frame.repaint();
      frame.setVisible(true);
    }

    else if (((String)box.getSelectedItem()).equals("Quintic")){
 	    frame.setContentPane(Fifth);
      frame.repaint();
      frame.setVisible(true);
    }

    else if (((String)box.getSelectedItem()).equals("Sextic")){
 	    frame.setContentPane(Sixth);
      frame.repaint();
      frame.setVisible(true);
    }

    else if (((String)box.getSelectedItem()).equals("Constant")){
 	    frame.setContentPane(Constant);
      frame.repaint();
      frame.setVisible(true);
    }
    }


	catch (java.lang.ClassCastException error){
    JButton button = (JButton) e.getSource();
    if (button == B1){
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Function test = new Function();
      test.setC(Double.parseDouble(TF1c.getText()));
      test.setX1(0);
      test.setX2(0);
      test.setX3(0);
      test.setX4(0);
      test.setX5(0);
      test.setX6(0);
      CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
      //test.setRoots(check.getRoots());
      test.setData(check.getX());
      test.setData1(check.getY());
      //test.setRoots(check.getRoots());
//test.SetMaxandMin(test.ymax(), test.ymin());
      f.add(test);
      f.setSize(800, 1000);
      f.setLocation(200,200);
      f.setVisible(true);
    }
      else if (button == B2){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Function test = new Function();
        test.setC(Double.parseDouble(TF1l.getText()));
        test.setX1(Double.parseDouble(TF2l.getText()));
        test.setX2(0);
        test.setX3(0);
        test.setX4(0);
        test.setX5(0);
        test.setX6(0);
        CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
        //test.setRoots(check.getRoots());
        test.setData(check.getX());
        test.setData1(check.getY());
        //test.setRoots(check.getRoots());
  //test.SetMaxandMin(test.ymax(), test.ymin());
        f.add(test);
        f.setSize(800, 1000);
        f.setLocation(200,200);
        f.setVisible(true);
      }
    else if (button == B3){
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Function test = new Function();
      test.setC(Double.parseDouble(TF1q.getText()));
      test.setX1(Double.parseDouble(TF2q.getText()));
      test.setX2(Double.parseDouble(TF3q.getText()));
      test.setX3(0);
      test.setX4(0);
      test.setX5(0);
      test.setX6(0);
      CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
      //test.setRoots(check.getRoots());
      test.setData(check.getX());
      test.setData1(check.getY());
      //test.setRoots(check.getRoots());
//test.SetMaxandMin(test.ymax(), test.ymin());
      f.add(test);
      f.setSize(800, 1000);
      f.setLocation(200,200);
      f.setVisible(true);
    }
    else if (button == B4){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Function test = new Function();
        test.setC(Double.parseDouble(TF1cu.getText()));
        test.setX1(Double.parseDouble(TF2cu.getText()));
        test.setX2(Double.parseDouble(TF3cu.getText()));
        test.setX3(Double.parseDouble(TF4cu.getText()));
        CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
        //test.setRoots(check.getRoots());
        test.setData(check.getX());
        test.setData1(check.getY());
        //test.setRoots(check.getRoots());
  //test.SetMaxandMin(test.ymax(), test.ymin());
        f.add(test);
        f.setSize(800, 1000);
        f.setLocation(200,200);
        f.setVisible(true);
      }

    else if (button == B5){
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Function test = new Function();
      test.setC(Double.parseDouble(TF1fourth.getText()));
      test.setX1(Double.parseDouble(TF2fourth.getText()));
      test.setX2(Double.parseDouble(TF3fourth.getText()));
      test.setX3(Double.parseDouble(TF4fourth.getText()));
      test.setX4(Double.parseDouble(TF5fourth.getText()));
      test.setX5(0);
      test.setX6(0);
      CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
      //test.setRoots(check.getRoots());
      test.setData(check.getX());
      test.setData1(check.getY());
      //test.setRoots(check.getRoots());
  //test.SetMaxandMin(test.ymax(), test.ymin());
      f.add(test);
      f.setSize(800, 1000);
      f.setLocation(200,200);
      f.setVisible(true);
    }
    else if (button == B6){
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Function test = new Function();
      test.setC(Double.parseDouble(TF1fifth.getText()));
      test.setX1(Double.parseDouble(TF2fifth.getText()));
      test.setX2(Double.parseDouble(TF3fifth.getText()));
      test.setX3(Double.parseDouble(TF4fifth.getText()));
      test.setX4(Double.parseDouble(TF5fifth.getText()));
      test.setX5(Double.parseDouble(TF6fifth.getText()));
      test.setX6(0);
      CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
      //test.setRoots(check.getRoots());
      test.setData(check.getX());
      test.setData1(check.getY());
      //test.setRoots(check.getRoots());
  //test.SetMaxandMin(test.ymax(), test.ymin());
      f.add(test);
      f.setSize(800, 1000);
      f.setLocation(200,200);
      f.setVisible(true);
    }

    else if (button == B7){
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Function test = new Function();
      test.setC(Double.parseDouble(TF1sixth.getText()));
      test.setX1(Double.parseDouble(TF2sixth.getText()));
      test.setX2(Double.parseDouble(TF3sixth.getText()));
      test.setX3(Double.parseDouble(TF4sixth.getText()));
      test.setX4(Double.parseDouble(TF5sixth.getText()));
      test.setX5(Double.parseDouble(TF6sixth.getText()));
      test.setX6(Double.parseDouble(TF7sixth.getText()));
      CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
      //test.setRoots(check.getRoots());
      test.setData(check.getX());
      test.setData1(check.getY());
      //test.setRoots(check.getRoots());
  //test.SetMaxandMin(test.ymax(), test.ymin());
      f.add(test);
      f.setSize(800, 1000);
      f.setLocation(200,200);
      f.setVisible(true);
    }
    }
    }

    public static void main(String[]args){
	GraphingCalculator g = new GraphingCalculator();
    }
}
