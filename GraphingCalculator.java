import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphingCalculator extends JFrame implements ActionListener{
    private JFrame frame;

    private JPanel CoverMain, CoverTitle, CoverHeader, CoverBody,
			CalculationInputMain, CalculationInputTitle, CalculationInputHeader, CalculationInputFooter, HelpCalcPane,
			AddPanel, SubtractPanel, MultiplyPanel, DividePanel, ExponentPanel, LogPanel,
			ConstantMain, ConstantTitle, ConstantHeader, ConstantBody, ConstantFooter, HelpConsPane,
			LinearMain, LinearTitle, LinearHeader, LinearBody, LinearFooter, HelpLinePane,
			QuadraticMain, QuadraticTitle, QuadraticHeader, QuadraticBody, QuadraticFooter, HelpQuadPane,
			CubicMain, CubicTitle, CubicHeader, CubicBody, CubicFooter, HelpCubePane,
			FourthMain, FourthTitle, FourthHeader, FourthBody, FourthFooter, HelpQuarPane,
			FifthMain, FifthTitle, FifthHeader, FifthBody, FifthFooter, HelpQuinPane,
			SixthMain, SixthTitle, SixthHeader, SixthBody, SixthFooter, HelpSextPane,
			HyperbolaMain, HyperbolaTitle, HyperbolaHeader, HyperbolaBody, HyperbolaFooter, HelpHypePane,
			errorPanel;

    private JButton CovToCalc,
			AddButton, SubtractButton, MultiplyButton, DivideButton, ExponentButton, LogButton,
			B1, B2, B3, B4, B5, B6, B7, BGHyp,
			BC0, BC1, BC2, BC3, BC4, BC5, BC6, BC7, BHyp,
			HelpCalc, HelpCons, HelpLine, HelpQuad, HelpCube, HelpQuar, HelpQuin, HelpSext, HelpHype,
			back;

    private JTextField Calc1, Calc2, Calc3, Calc4, Calc5, Calc6,
			Add, Subtract, Multiply, Divide, Exponent, LogBase,
			TFHyp,
			TF1c,
			TF1l, TF2l,
			TF1q, TF2q, TF3q,
			TF1cu, TF2cu, TF3cu, TF4cu,
			TF1fourth, TF2fourth, TF3fourth, TF4fourth, TF5fourth,
			TF1fifth, TF2fifth, TF3fifth, TF4fifth, TF5fifth, TF6fifth,
			TF1sixth, TF2sixth, TF3sixth, TF4sixth, TF5sixth, TF6sixth, TF7sixth;

    private JLabel CovTitle, Intro,
			LCalc, LCalc2, HelpCalcLabel,
			L1c, HelpConsLabel,
			L1l, L2l, HelpLineLabel,
			L1q, L2q, L3q, HelpQuadLabel,
			L1cu, L2cu, L3cu, L4cu, HelpCubeLabel,
			L1fourth, L2fourth, L3fourth, L4fourth, L5fourth, HelpQuarLabel,
			L1fifth, L2fifth, L3fifth, L4fifth, L5fifth, L6fifth, HelpQuinLabel,
			L1sixth, L2sixth, L3sixth, L4sixth, L5sixth, L6sixth, L7sixth, HelpSextLabel,
			LH1, LH2, LH3, LH4, LH5, LH6, LH7,
			LHyp, LHypx, LHyp1x, HelpHypeLabel,
			errorMessage;





    public GraphingCalculator() {
    frame = new JFrame("Graphic Calculator");
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);





	//FONT INITIALIZATION
	Font myFont = new Font("Serif", Font.BOLD, 12);
    Font newFont = myFont.deriveFont(40F);





	//JPANEL INITIALIZATION
	CoverMain = new JPanel();
	CoverTitle = new JPanel();
	CoverHeader = new JPanel();
	CoverBody = new JPanel();

    CalculationInputMain = new JPanel();
	CalculationInputTitle = new JPanel();
	CalculationInputHeader = new JPanel();
	AddPanel = new JPanel();
	SubtractPanel = new JPanel();
	MultiplyPanel = new JPanel();
	DividePanel = new JPanel();
	ExponentPanel = new JPanel();
	LogPanel = new JPanel();
	CalculationInputFooter = new JPanel();
	HelpCalcPane = new JPanel();

    ConstantMain = new JPanel();
	ConstantTitle = new JPanel();
	ConstantHeader = new JPanel();
	ConstantBody = new JPanel();
	ConstantFooter = new JPanel();
	HelpConsPane = new JPanel();

    LinearMain = new JPanel();
	LinearTitle = new JPanel();
	LinearHeader = new JPanel();
	LinearBody = new JPanel();
	LinearFooter = new JPanel();
	HelpLinePane = new JPanel();

    QuadraticMain = new JPanel();
	QuadraticTitle = new JPanel();
    QuadraticHeader = new JPanel();
    QuadraticBody = new JPanel();
    QuadraticFooter = new JPanel();
	HelpQuadPane = new JPanel();

    CubicMain = new JPanel();
	CubicTitle = new JPanel();
    CubicHeader = new JPanel();
    CubicBody = new JPanel();
    CubicFooter = new JPanel();
	HelpCubePane = new JPanel();

    FourthMain = new JPanel();
	FourthTitle = new JPanel();
    FourthHeader = new JPanel();
    FourthBody = new JPanel();
    FourthFooter = new JPanel();
	HelpQuarPane = new JPanel();

    FifthMain = new JPanel();
	FifthTitle = new JPanel();
    FifthHeader = new JPanel();
    FifthBody = new JPanel();
    FifthFooter = new JPanel();
	HelpQuinPane = new JPanel();

    SixthMain = new JPanel();
	SixthTitle = new JPanel();
    SixthHeader = new JPanel();
    SixthBody = new JPanel();
    SixthFooter = new JPanel();
	HelpSextPane = new JPanel();

    HyperbolaMain = new JPanel();
	HyperbolaTitle = new JPanel();
	HyperbolaHeader = new JPanel();
	HyperbolaBody = new JPanel();
	HyperbolaFooter = new JPanel();
	HelpHypePane = new JPanel();

	errorPanel = new JPanel();





	//SETTING JPANEL LAYOUT
	CoverMain.setLayout(new BoxLayout(CoverMain, BoxLayout.Y_AXIS));
	CoverTitle.setLayout(new FlowLayout());
	CoverHeader.setLayout(new FlowLayout());
	CoverBody.setLayout(new FlowLayout());

    CalculationInputMain.setLayout(new BoxLayout(CalculationInputMain, BoxLayout.Y_AXIS));
	CalculationInputTitle.setLayout(new FlowLayout());
	CalculationInputHeader.setLayout(new FlowLayout());
	AddPanel.setLayout(new FlowLayout());
	SubtractPanel.setLayout(new FlowLayout());
	MultiplyPanel.setLayout(new FlowLayout());
	DividePanel.setLayout(new FlowLayout());
	ExponentPanel.setLayout(new FlowLayout());
	LogPanel.setLayout(new FlowLayout());
	CalculationInputFooter.setLayout(new FlowLayout());
	HelpCalcPane.setLayout(new FlowLayout());

    ConstantMain.setLayout(new BoxLayout(ConstantMain, BoxLayout.Y_AXIS));
	ConstantTitle.setLayout(new FlowLayout());
	ConstantHeader.setLayout(new FlowLayout());
	ConstantBody.setLayout(new FlowLayout());
	ConstantFooter.setLayout(new FlowLayout());
	HelpConsPane.setLayout(new FlowLayout());

    LinearMain.setLayout(new BoxLayout(LinearMain, BoxLayout.Y_AXIS));
	LinearTitle.setLayout(new FlowLayout());
	LinearHeader.setLayout(new FlowLayout());
	LinearBody.setLayout(new FlowLayout());
	LinearFooter.setLayout(new FlowLayout());
	HelpLinePane.setLayout(new FlowLayout());

    QuadraticMain.setLayout(new BoxLayout(QuadraticMain, BoxLayout.Y_AXIS));
	QuadraticTitle.setLayout(new FlowLayout());
    QuadraticHeader.setLayout(new FlowLayout());
    QuadraticBody.setLayout(new FlowLayout());
    QuadraticFooter.setLayout(new FlowLayout());
	HelpQuadPane.setLayout(new FlowLayout());

    CubicMain.setLayout(new BoxLayout(CubicMain, BoxLayout.Y_AXIS));
	CubicTitle.setLayout(new FlowLayout());
    CubicHeader.setLayout(new FlowLayout());
    CubicBody.setLayout(new FlowLayout());
    CubicFooter.setLayout(new FlowLayout());
	HelpCubePane.setLayout(new FlowLayout());

    FourthMain.setLayout(new BoxLayout(FourthMain, BoxLayout.Y_AXIS));
	FourthTitle.setLayout(new FlowLayout());
    FourthHeader.setLayout(new FlowLayout());
    FourthBody.setLayout(new FlowLayout());
    FourthFooter.setLayout(new FlowLayout());
	HelpQuarPane.setLayout(new FlowLayout());

    FifthMain.setLayout(new BoxLayout(FifthMain, BoxLayout.Y_AXIS));
	FifthTitle.setLayout(new FlowLayout());
    FifthHeader.setLayout(new FlowLayout());
    FifthBody.setLayout(new FlowLayout());
    FifthFooter.setLayout(new FlowLayout());
	HelpQuinPane.setLayout(new FlowLayout());

    SixthMain.setLayout(new BoxLayout(SixthMain, BoxLayout.Y_AXIS));
	SixthTitle.setLayout(new FlowLayout());
    SixthHeader.setLayout(new FlowLayout());
    SixthBody.setLayout(new FlowLayout());
    SixthFooter.setLayout(new FlowLayout());
	HelpSextPane.setLayout(new FlowLayout());

    HyperbolaMain.setLayout(new BoxLayout(HyperbolaMain, BoxLayout.Y_AXIS));
	HyperbolaTitle.setLayout(new FlowLayout());
	HyperbolaHeader.setLayout(new FlowLayout());
	HyperbolaBody.setLayout(new FlowLayout());
	HyperbolaFooter.setLayout(new FlowLayout());
	HelpHypePane.setLayout(new FlowLayout());

	errorPanel.setLayout(new BoxLayout(errorPanel, BoxLayout.Y_AXIS));





	//JBUTTON INITIALIZATION
	CovToCalc = new JButton("To Calculations Tab");

    B1 = new JButton("Graph Constant Function");
    B2 = new JButton("Graph Linear Function");
    B3 = new JButton("Graph Quadratic Function");
    B4 = new JButton("Graph Cubic Function");
    B5 = new JButton("Graph Fourth Degree Function");
    B6 = new JButton("Graph Fifth Degree Function");
    B7 = new JButton("Graph Sixth Degree Function");
    BGHyp = new JButton("Graph Hyperbolic Function");

    BC0 = new JButton("Cycle to Constant");
    BC1 = new JButton("Cycle To Linear");
    BC2 = new JButton("Cycle To Quadratic");
    BC3 = new JButton("Cycle To Cubic");
    BC4 = new JButton("Cycle To Fourth Degree");
    BC5= new JButton("Cycle To Fifth Degree");
    BC6 = new JButton("Cycle To Sixth Degree");
    BC7 = new JButton("Cycle To 1/x");

	back = new JButton("Back to menu");

    BHyp = new JButton("Cycle to Calculation");

	AddButton = new JButton(" + ");
	SubtractButton = new JButton (" - ");
	MultiplyButton = new JButton (" * ");
	DivideButton = new JButton (" / ");
	ExponentButton = new JButton (" to the power of ");
	LogButton = new JButton (" Log base ");

	HelpCalc = new JButton ("How To Use");
	HelpCons = new JButton ("How To Use");
	HelpLine = new JButton ("How To Use");
	HelpQuad = new JButton ("How To Use");
	HelpCube = new JButton ("How To Use");
	HelpQuar = new JButton ("How To Use");
	HelpQuin = new JButton ("How To Use");
	HelpSext = new JButton ("How To Use");
	HelpHype = new JButton ("How To Use");





	//JTEXTFIELD INITIALIZATION
    TFHyp = new JTextField(10);

    TF1c = new JTextField(10);
    TF1l = new JTextField(10);
    TF1q = new JTextField(10);
    TF1cu = new JTextField(10);
    TF1fourth = new JTextField(10);
    TF1fifth = new JTextField(10);
    TF1sixth = new JTextField(10);

    TF2l = new JTextField(10);
    TF2q = new JTextField(10);
    TF2cu = new JTextField(10);
    TF2fourth = new JTextField(10);
    TF2fifth = new JTextField(10);
    TF2sixth = new JTextField(10);

    TF3q = new JTextField(10);
    TF3cu = new JTextField(10);
    TF3fourth = new JTextField(10);
    TF3fifth = new JTextField(10);
    TF3sixth = new JTextField(10);

    TF4cu = new JTextField(10);
    TF4fourth = new JTextField(10);
    TF4fifth = new JTextField(10);
    TF4sixth = new JTextField(10);

    TF5fourth = new JTextField(10);
    TF5fifth = new JTextField(10);
    TF5sixth = new JTextField(10);

    TF6fifth = new JTextField(10);
    TF6sixth = new JTextField(10);

    TF7sixth = new JTextField(10);


	Calc1 = new JTextField(10);
	Calc2 = new JTextField(10);
	Calc3 = new JTextField(10);
	Calc4 = new JTextField(10);
	Calc5 = new JTextField(10);
	Calc6 = new JTextField(10);

	Add = new JTextField(10);
	Subtract = new JTextField(10);
	Multiply = new JTextField(10);
	Divide = new JTextField(10);
	Exponent = new JTextField(10);
	LogBase = new JTextField(10);





	//JLABEL INITIALIZATION
	CovTitle = new JLabel("Welcome To The Graphing Calculator");
	Intro = new JLabel("<html><p style=\"text-align:center\">Do you like doing math?<br>" +
					   "Of course not!<br>" +
					   "Finding vertices, minimums, maximums, etc. is all a bore.<br>" +
					   "And why take your time to open a browser, look up Wolfram Alpha or Geogebra, and take years typing in your function when you can do it in a few simple steps here!<br>" +
             "Warning: Using big coefficients for the constant value may push your graph out of the observable window; correct information will still be displayed<br>" +
					   "Use this free and easy Graphing Calculator for all your graphing needs!</p></html>");

	CovTitle.setFont(newFont);



    LCalc = new JLabel("Calculations Tab");
    LH1 = new JLabel("Constant Tab");
    LH2 = new JLabel("Linear Tab");
    LH3 = new JLabel("Quadratic Tab");
    LH4 = new JLabel("Cubic Tab");
    LH5 = new JLabel("Quartic Tab");
    LH6 = new JLabel("Quintic Tab");
    LH7 = new JLabel("Sextic Tab");
    LHyp = new JLabel("Hyperbola Tab");

	LCalc.setFont(newFont);
    LH1.setFont(newFont);
    LH2.setFont(newFont);
    LH3.setFont(newFont);
    LH4.setFont(newFont);
    LH5.setFont(newFont);
    LH6.setFont(newFont);
    LH7.setFont(newFont);
    LHyp.setFont(newFont);



	LCalc2 = new JLabel(" of ");
    L1c = new JLabel("y =");
    L1l = new JLabel("y =");
    L1q = new JLabel("y =");
    L1cu = new JLabel("y =");
    L1fourth = new JLabel("y =");
    L1fifth = new JLabel("y =");
    L1sixth = new JLabel("y =");
    LHypx = new JLabel("y =");
    LHyp1x = new JLabel("1/x");

    L2l = new JLabel("x + ");
    L2q = new JLabel("x + ");
    L2cu = new JLabel("x + ");
    L2fourth = new JLabel("x + ");
    L2fifth = new JLabel("x + ");
    L2sixth = new JLabel("x + ");

    L3q = new JLabel("x^2 + ");
    L3cu = new JLabel("x^2 + ");
    L3fourth = new JLabel("x^2 + ");
    L3fifth = new JLabel("x^2 + ");
    L3sixth = new JLabel("x^2 + ");

    L4cu = new JLabel("x^3 + ");
    L4fourth = new JLabel("x^3 + ");
    L4fifth = new JLabel("x^3 + ");
    L4sixth = new JLabel("x^3 + ");

    L5fourth = new JLabel("x^4 + ");
    L5fifth = new JLabel("x^4 + ");
    L5sixth = new JLabel("x^4 + ");

    L6fifth = new JLabel("x^5 + ");
    L6sixth = new JLabel("x^5 + ");

    L7sixth = new JLabel("x^6 + ");

	errorMessage = new JLabel("Please input only numerical coefficients");

	HelpCalcLabel = new JLabel("<html><p style=\"text-align:center\">Enter numbers that you wish to perform operations on on opposite sides of an operator.<br>" +
							   "for example:<br>" +
							   "5 + 10<br>" +
							   "Press the operation button, in this case +, to perform the calculation.<br>" +
							   "The result of this operation will become the input of the other functions automatically, allowing you to string together successive operations.<br>" +
							   "For log and exponent, simply input the information needed to raise an inputted value to a certain power or to find the log of a desired base of a desired number.</p></html>");
	HelpConsLabel = new JLabel("<html><p style=\"text-align:center\">Enter a constant into the text box.<br>" +
							   "Press \"Graph Constant Function\" to view the resulting graph.<br>" +
							   "You do not need to resize the graph window, just wait a little for it to load.</p></html>");
	HelpLineLabel = new JLabel("<html><p style=\"text-align:center\">Enter the x coefficient and a constant into their appropriate textboxes.<br>" +
							   "Press \"Graph Linear Function\" to view the resulting graph.<br>" +
							   "You do not need to resize the graph window, just wait a little for it to load.</p></html>");
	HelpQuadLabel = new JLabel("<html><p style=\"text-align:center\">Enter the x squared coefficient, x coefficient, and constant into their appropriate textboxes.<br>" +
							   "Press \"Graph Quadratic Function\" to view the resulting graph.<br>" +
							   "You do not need to resize the graph window, just wait a little for it to load.</p></html>");
	HelpCubeLabel = new JLabel("<html><p style=\"text-align:center\">Enter the coefficients and constant into their appropriate textboxes.<br>" +
							   "Press \"Graph Cubic Function\" to view the resulting graph.<br>" +
							   "You do not need to resize the graph window, just wait a little for it to load.</p></html>");
	HelpQuarLabel = new JLabel("<html><p style=\"text-align:center\">Enter the coefficients and constant into their appropriate textboxes.<br>" +
							   "Press \"Graph Fourth Degree Function\" to view the resulting graph.<br>" +
							   "You do not need to resize the graph window, just wait a little for it to load.</p></html>");
	HelpQuinLabel = new JLabel("<html><p style=\"text-align:center\">Enter the coefficients and constant into their appropriate textboxes.<br>" +
							   "Press \"Graph Fifth Degree Function\" to view the resulting graph.<br>" +
							   "You do not need to resize the graph window, just wait a little for it to load.</p></html>");
	HelpSextLabel = new JLabel("<html><p style=\"text-align:center\">Enter the coefficients and constant into their appropriate textboxes.<br>" +
							   "Press \"Graph Sixth Degree Function\" to view the resulting graph.<br>" +
							   "You do not need to resize the graph window, just wait a little for it to load.</p></html>");
	HelpHypeLabel = new JLabel("<html><p style=\"text-align:center\">Enter the coefficient for the hyperbolic function in the textbox.<br>" +
							   "Press \"Graph Hyperbolic Function\" to view the resulting graph.<br>" +
							   "You do not need to resize the graph window, just wait a little for it to load.</p></html>");




	//ADD ACTION LISTENER
	CovToCalc.addActionListener(this);

    B1.addActionListener(this);
    B2.addActionListener(this);
    B3.addActionListener(this);
    B4.addActionListener(this);
    B5.addActionListener(this);
    B6.addActionListener(this);
    B7.addActionListener(this);
    BGHyp.addActionListener(this);

	BC0.addActionListener(this);
    BC1.addActionListener(this);
    BC2.addActionListener(this);
    BC3.addActionListener(this);
    BC4.addActionListener(this);
    BC5.addActionListener(this);
    BC6.addActionListener(this);
    BC7.addActionListener(this);
    BHyp.addActionListener(this);

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

	back.addActionListener(this);
    TFHyp.addActionListener(this);

	AddButton.addActionListener(this);
	SubtractButton.addActionListener(this);
	MultiplyButton.addActionListener(this);
	DivideButton.addActionListener(this);
	ExponentButton.addActionListener(this);
	LogButton.addActionListener(this);

	Calc1.addActionListener(this);
	Calc2.addActionListener(this);
	Calc3.addActionListener(this);
	Calc4.addActionListener(this);
	Calc5.addActionListener(this);
	Calc6.addActionListener(this);

	Add.addActionListener(this);
	Subtract.addActionListener(this);
	Multiply.addActionListener(this);
	Divide.addActionListener(this);
	Exponent.addActionListener(this);
	LogBase.addActionListener(this);

	HelpCalc.addActionListener(this);
	HelpCons.addActionListener(this);
	HelpLine.addActionListener(this);
	HelpQuad.addActionListener(this);
	HelpCube.addActionListener(this);
	HelpQuar.addActionListener(this);
	HelpQuin.addActionListener(this);
	HelpSext.addActionListener(this);
	HelpHype.addActionListener(this);





	//ADD ITEMS TO PANELS

	//Help Panels
	HelpCalcPane.add(HelpCalcLabel);
	HelpConsPane.add(HelpConsLabel);
	HelpLinePane.add(HelpLineLabel);
	HelpQuadPane.add(HelpQuadLabel);
	HelpCubePane.add(HelpCubeLabel);
	HelpQuarPane.add(HelpQuarLabel);
	HelpQuinPane.add(HelpQuinLabel);
	HelpSextPane.add(HelpSextLabel);
	HelpHypePane.add(HelpHypeLabel);

	//Cover Panel
	CoverTitle.add(CovTitle);
	CoverHeader.add(CovToCalc);
	CoverBody.add(Intro);

	CoverMain.add(CoverTitle);
	CoverMain.add(CoverHeader);
	CoverMain.add(CoverBody);



	//Calculation Panel
    CalculationInputTitle.add(LCalc);
    CalculationInputHeader.add(BC0);

    AddPanel.add(Calc1);
    AddPanel.add(AddButton);
    AddPanel.add(Add);
    SubtractPanel.add(Calc2);
    SubtractPanel.add(SubtractButton);
    SubtractPanel.add(Subtract);
    MultiplyPanel.add(Calc3);
    MultiplyPanel.add(MultiplyButton);
    MultiplyPanel.add(Multiply);
    DividePanel.add(Calc4);
    DividePanel.add(DivideButton);
    DividePanel.add(Divide);
    ExponentPanel.add(Calc5);
    ExponentPanel.add(ExponentButton);
    ExponentPanel.add(Exponent);
    LogPanel.add(LogButton);
    LogPanel.add(LogBase);
    LogPanel.add(LCalc2);
    LogPanel.add(Calc6);

	CalculationInputFooter.add(HelpCalc);

	CalculationInputMain.add(CalculationInputTitle);
	CalculationInputMain.add(CalculationInputHeader);
    CalculationInputMain.add(AddPanel);
    CalculationInputMain.add(SubtractPanel);
    CalculationInputMain.add(MultiplyPanel);
    CalculationInputMain.add(DividePanel);
    CalculationInputMain.add(ExponentPanel);
    CalculationInputMain.add(LogPanel);
	CalculationInputMain.add(CalculationInputFooter);



	//Constant Panel
	ConstantTitle.add(LH1);
	ConstantHeader.add(BC1);
	ConstantBody.add(L1c);
	ConstantBody.add(TF1c);
	ConstantFooter.add(B1);
	ConstantFooter.add(HelpCons);

    ConstantMain.add(ConstantTitle);
    ConstantMain.add(ConstantHeader);
    ConstantMain.add(ConstantBody);
    ConstantMain.add(ConstantFooter);



	//Linear Panel
    LinearTitle.add(LH2);
    LinearHeader.add(BC2);
    LinearBody.add(L1l);
    LinearBody.add(TF2l);
    LinearBody.add(L2l);
    LinearBody.add(TF1l);
    LinearFooter.add(B2);
    LinearFooter.add(HelpLine);

	LinearMain.add(LinearTitle);
	LinearMain.add(LinearHeader);
	LinearMain.add(LinearBody);
	LinearMain.add(LinearFooter);



	//Quadratic Panel
    QuadraticTitle.add(LH3);
    QuadraticHeader.add(BC3);
    QuadraticBody.add(L1q);
    QuadraticBody.add(TF3q);
    QuadraticBody.add(L3q);
    QuadraticBody.add(TF2q);
    QuadraticBody.add(L2q);
    QuadraticBody.add(TF1q);
    QuadraticFooter.add(B3);
    QuadraticFooter.add(HelpQuad);

	QuadraticMain.add(QuadraticTitle);
	QuadraticMain.add(QuadraticHeader);
	QuadraticMain.add(QuadraticBody);
	QuadraticMain.add(QuadraticFooter);



	//Cubic Panel
    CubicTitle.add(LH4);
    CubicHeader.add(BC4);
    CubicBody.add(L1cu);
    CubicBody.add(TF4cu);
    CubicBody.add(L4cu);
    CubicBody.add(TF3cu);
    CubicBody.add(L3cu);
    CubicBody.add(TF2cu);
    CubicBody.add(L2cu);
    CubicBody.add(TF1cu);
    CubicFooter.add(B4);
    CubicFooter.add(HelpCube);

	CubicMain.add(CubicTitle);
	CubicMain.add(CubicHeader);
	CubicMain.add(CubicBody);
	CubicMain.add(CubicFooter);



	//Quartic Panel
    FourthTitle.add(LH5);
    FourthHeader.add(BC5);
    FourthBody.add(L1fourth);
    FourthBody.add(TF5fourth);
    FourthBody.add(L5fourth);
    FourthBody.add(TF4fourth);
    FourthBody.add(L4fourth);
    FourthBody.add(TF3fourth);
    FourthBody.add(L3fourth);
    FourthBody.add(TF2fourth);
    FourthBody.add(L2fourth);
    FourthBody.add(TF1fourth);
    FourthFooter.add(B5);
    FourthFooter.add(HelpQuar);

	FourthMain.add(FourthTitle);
	FourthMain.add(FourthHeader);
	FourthMain.add(FourthBody);
	FourthMain.add(FourthFooter);



	//Quintic Panel
    FifthTitle.add(LH6);
    FifthHeader.add(BC6);
    FifthBody.add(L1fifth);
    FifthBody.add(TF6fifth);
    FifthBody.add(L6fifth);
    FifthBody.add(TF5fifth);
    FifthBody.add(L5fifth);
    FifthBody.add(TF4fifth);
    FifthBody.add(L4fifth);
    FifthBody.add(TF3fifth);
    FifthBody.add(L3fifth);
    FifthBody.add(TF2fifth);
    FifthBody.add(L2fifth);
    FifthBody.add(TF1fifth);
    FifthFooter.add(B6);
    FifthFooter.add(HelpQuin);

	FifthMain.add(FifthTitle);
	FifthMain.add(FifthHeader);
	FifthMain.add(FifthBody);
	FifthMain.add(FifthFooter);



	//Sextic Panel
    SixthTitle.add(LH7);
    SixthHeader.add(BC7);
    SixthBody.add(L1sixth);
    SixthBody.add(TF7sixth);
    SixthBody.add(L7sixth);
    SixthBody.add(TF6sixth);
    SixthBody.add(L6sixth);
    SixthBody.add(TF5sixth);
    SixthBody.add(L5sixth);
    SixthBody.add(TF4sixth);
    SixthBody.add(L4sixth);
    SixthBody.add(TF3sixth);
    SixthBody.add(L3sixth);
    SixthBody.add(TF2sixth);
    SixthBody.add(L2sixth);
    SixthBody.add(TF1sixth);
    SixthFooter.add(B7);
    SixthFooter.add(HelpSext);

	SixthMain.add(SixthTitle);
	SixthMain.add(SixthHeader);
	SixthMain.add(SixthBody);
	SixthMain.add(SixthFooter);



	//Hyperbola Panel
    HyperbolaTitle.add(LHyp);
    HyperbolaHeader.add(BHyp);
    HyperbolaBody.add(LHypx);
    HyperbolaBody.add(TFHyp);
    HyperbolaBody.add(LHyp1x);
    HyperbolaFooter.add(BGHyp);
    HyperbolaFooter.add(HelpHype);

	HyperbolaMain.add(HyperbolaTitle);
	HyperbolaMain.add(HyperbolaHeader);
	HyperbolaMain.add(HyperbolaBody);
	HyperbolaMain.add(HyperbolaFooter);



	//Error Panel
	errorPanel.add(errorMessage);
	errorPanel.add(back);





	//CREATE WINDOW
    frame.setContentPane(CoverMain);
    frame.setSize(1100,400);
    frame.setLocation(100,100);
    frame.setVisible(true);
    }





    public void actionPerformed(ActionEvent e) {
  	   JButton button = (JButton) e.getSource();





	//SWITCH PANEL BUTTONS
	   if (button == CovToCalc){
  		    frame.setContentPane(CalculationInputMain);
  		    frame.repaint();
            frame.setVisible(true);
       }

       else if (button == BC0){
  		    frame.setContentPane(ConstantMain);
  		    frame.repaint();
            frame.setVisible(true);
  	   }

       else if (button == BC1){
  		     frame.setContentPane(LinearMain);
  		     frame.repaint();
           frame.setVisible(true);
  	   }

  	   else if (button == BC2){
  	    frame.setContentPane(QuadraticMain);
        frame.repaint();
        frame.setVisible(true);
      }

      else if (button == BC3){
   	    frame.setContentPane(CubicMain);
        frame.repaint();
        frame.setVisible(true);
        }

      else if (button == BC4){
   	    frame.setContentPane(FourthMain);
        frame.repaint();
        frame.setVisible(true);
      }

      else if (button == BC5){
   	    frame.setContentPane(FifthMain);
        frame.repaint();
        frame.setVisible(true);
      }

      else if (button == BC6){
   	    frame.setContentPane(SixthMain);
        frame.repaint();
        frame.setVisible(true);
      }

      else if (button == BC7){
   	    frame.setContentPane(HyperbolaMain);
        frame.repaint();
        frame.setVisible(true);
      }
      else if (button == BHyp){
        frame.setContentPane(CalculationInputMain);
        frame.repaint();
        frame.setVisible(true);
      }





	//CALCULATIONS PANEL BUTTONS
	else if (button == AddButton){
  	    try {
  		double input = Double.parseDouble(Calc1.getText());
		double addend = Double.parseDouble(Add.getText());

		Calc1.setText("" + (input + addend));
		Calc2.setText("" + (input + addend));
		Calc3.setText("" + (input + addend));
		Calc4.setText("" + (input + addend));
		Calc5.setText("" + (input + addend));
		Calc6.setText("" + (input + addend));
  	    }
  	    catch (IllegalArgumentException error){
  		frame.setContentPane(errorPanel);
  		frame.repaint();
  		frame.setVisible(true);
  	    }
    }

	else if (button == SubtractButton){
  	    try {
  		double input = Double.parseDouble(Calc2.getText());
		double subtrahend = Double.parseDouble(Subtract.getText());

		Calc1.setText("" + (input - subtrahend));
		Calc2.setText("" + (input - subtrahend));
		Calc3.setText("" + (input - subtrahend));
		Calc4.setText("" + (input - subtrahend));
		Calc5.setText("" + (input - subtrahend));
		Calc6.setText("" + (input - subtrahend));
  	    }
  	    catch (IllegalArgumentException error){
  		frame.setContentPane(errorPanel);
  		frame.repaint();
  		frame.setVisible(true);
  	    }
    }

	else if (button == MultiplyButton){
  	    try {
  		double input = Double.parseDouble(Calc3.getText());
		double factor = Double.parseDouble(Multiply.getText());

		Calc1.setText("" + (input * factor));
		Calc2.setText("" + (input * factor));
		Calc3.setText("" + (input * factor));
		Calc4.setText("" + (input * factor));
		Calc5.setText("" + (input * factor));
		Calc6.setText("" + (input * factor));
  	    }
  	    catch (IllegalArgumentException error){
  		frame.setContentPane(errorPanel);
  		frame.repaint();
  		frame.setVisible(true);
  	    }
    }

	else if (button == DivideButton){
  	    try {
  		double input = Double.parseDouble(Calc4.getText());
		double divisor = Double.parseDouble(Divide.getText());

		Calc1.setText("" + (input / divisor));
		Calc2.setText("" + (input / divisor));
		Calc3.setText("" + (input / divisor));
		Calc4.setText("" + (input / divisor));
		Calc5.setText("" + (input / divisor));
		Calc6.setText("" + (input / divisor));
  	    }
  	    catch (IllegalArgumentException error){
  		frame.setContentPane(errorPanel);
  		frame.repaint();
  		frame.setVisible(true);
  	    }
    }

	else if (button == ExponentButton){
  	    try {
  		double input = Double.parseDouble(Calc5.getText());
		double power = Double.parseDouble(Exponent.getText());

		Calc1.setText("" + (Math.pow(input, power)));
		Calc2.setText("" + (Math.pow(input, power)));
		Calc3.setText("" + (Math.pow(input, power)));
		Calc4.setText("" + (Math.pow(input, power)));
		Calc5.setText("" + (Math.pow(input, power)));
		Calc6.setText("" + (Math.pow(input, power)));
  	    }
  	    catch (IllegalArgumentException error){
  		frame.setContentPane(errorPanel);
  		frame.repaint();
  		frame.setVisible(true);
  	    }
    }

	else if (button == LogButton){
  	    try {
  		double input = Double.parseDouble(Calc6.getText());
		double base = Double.parseDouble(LogBase.getText());

		Calc1.setText("" + (Math.log(input) / Math.log(base)));
		Calc2.setText("" + (Math.log(input) / Math.log(base)));
		Calc3.setText("" + (Math.log(input) / Math.log(base)));
		Calc4.setText("" + (Math.log(input) / Math.log(base)));
		Calc5.setText("" + (Math.log(input) / Math.log(base)));
		Calc6.setText("" + (Math.log(input) / Math.log(base)));
  	    }
  	    catch (IllegalArgumentException error){
  		frame.setContentPane(errorPanel);
  		frame.repaint();
  		frame.setVisible(true);
  	    }
    }





	//CONSTANT PANEL
    else if (button == B1){
        JFrame f = new JFrame("Graph");
        Function test = new Function();
  	    try {
  		test.setC(Double.parseDouble(TF1c.getText()));
  		test.setX1(0);
        test.setX2(0);
        test.setX3(0);
        test.setX4(0);
        test.setX5(0);
        test.setX6(0);
        CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
        test.setData(check.getX());
        test.setData1(check.getY());
        f.add(test);
        f.setSize(800, 800);
        f.setLocation(200,200);
  	    f.repaint();
        f.setVisible(true);
  	    }
  	    catch (IllegalArgumentException error){
  		frame.setContentPane(errorPanel);
  		frame.repaint();
  		frame.setVisible(true);
  	    }
    }





	//LINEAR PANEL
    else if (button == B2){
        JFrame f = new JFrame("Graph");
        Function test = new Function();
  		try {
  		  test.setC(Double.parseDouble(TF1l.getText()));
          test.setX1(Double.parseDouble(TF2l.getText()));
          test.setX2(0);
          test.setX3(0);
          test.setX4(0);
          test.setX5(0);
          test.setX6(0);
          CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
          test.setData(check.getX());
          test.setData1(check.getY());
          f.add(test);
          f.setSize(800, 800);
          f.setLocation(200,200);
  	      f.repaint();
          f.setVisible(true);
  		}
  	    catch (IllegalArgumentException error){
  		  frame.setContentPane(errorPanel);
  		  frame.repaint();
  		  frame.setVisible(true);
  	    }
	}





	//QUADRATIC PANEL
    else if (button == B3){
        JFrame f = new JFrame("Graph");
        Function test = new Function();
  	    try {
        test.setC(Double.parseDouble(TF1q.getText()));
        test.setX1(Double.parseDouble(TF2q.getText()));
        test.setX2(Double.parseDouble(TF3q.getText()));
        test.setX3(0);
        test.setX4(0);
        test.setX5(0);
        test.setX6(0);
        CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
        test.setData(check.getX());
        test.setData1(check.getY());
        f.add(test);
        f.setSize(800, 800);
        f.setLocation(200,200);
  	    f.repaint();
        f.setVisible(true);
        }
  	    catch (IllegalArgumentException error){
  		frame.setContentPane(errorPanel);
  		frame.repaint();
  		frame.setVisible(true);
  	    }
  	}





	//CUBIC PANEL
    else if (button == B4){
        JFrame f = new JFrame("Graph");
        Function test = new Function();
  	    try {
          test.setC(Double.parseDouble(TF1cu.getText()));
          test.setX1(Double.parseDouble(TF2cu.getText()));
          test.setX2(Double.parseDouble(TF3cu.getText()));
          test.setX3(Double.parseDouble(TF4cu.getText()));
          CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
          test.setData(check.getX());
          test.setData1(check.getY());
          f.add(test);
          f.setSize(800, 800);
          f.setLocation(200,200);
  	      f.repaint();
          f.setVisible(true);
        }
  	    catch (IllegalArgumentException error){
  		  frame.setContentPane(errorPanel);
  		  frame.repaint();
  		  frame.setVisible(true);
  	    }
  	}





	//QUARTIC PANEL
    else if (button == B5){
        JFrame f = new JFrame("Graph");
        Function test = new Function();
  	    try {
        test.setC(Double.parseDouble(TF1fourth.getText()));
        test.setX1(Double.parseDouble(TF2fourth.getText()));
        test.setX2(Double.parseDouble(TF3fourth.getText()));
        test.setX3(Double.parseDouble(TF4fourth.getText()));
        test.setX4(Double.parseDouble(TF5fourth.getText()));
        test.setX5(0);
        test.setX6(0);
        CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
        test.setData(check.getX());
        test.setData1(check.getY());
        f.add(test);
        f.setSize(800, 800);
        f.setLocation(200,200);
  	    f.repaint();
        f.setVisible(true);
        }
  	    catch (IllegalArgumentException error){
  		frame.setContentPane(errorPanel);
  		frame.repaint();
  		frame.setVisible(true);
  	    }
  	}





	//QUINTIC PANEL
    else if (button == B6){
        JFrame f = new JFrame("Graph");
        Function test = new Function();
  	    try {
        test.setC(Double.parseDouble(TF1fifth.getText()));
        test.setX1(Double.parseDouble(TF2fifth.getText()));
        test.setX2(Double.parseDouble(TF3fifth.getText()));
        test.setX3(Double.parseDouble(TF4fifth.getText()));
        test.setX4(Double.parseDouble(TF5fifth.getText()));
        test.setX5(Double.parseDouble(TF6fifth.getText()));
        test.setX6(0);
        CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
        test.setData(check.getX());
        test.setData1(check.getY());
        f.add(test);
        f.setSize(800, 800);
        f.setLocation(200,200);
  	    f.repaint();
        f.setVisible(true);
        }
  	    catch (IllegalArgumentException error){
  		frame.setContentPane(errorPanel);
  		frame.repaint();
  		frame.setVisible(true);
  	    }
  	}





    //SEXTIC PANEL
    else if (button == B7){
        JFrame f = new JFrame("Graph");
        Function test = new Function();
  	    try {
        test.setC(Double.parseDouble(TF1sixth.getText()));
        test.setX1(Double.parseDouble(TF2sixth.getText()));
        test.setX2(Double.parseDouble(TF3sixth.getText()));
        test.setX3(Double.parseDouble(TF4sixth.getText()));
        test.setX4(Double.parseDouble(TF5sixth.getText()));
        test.setX5(Double.parseDouble(TF6sixth.getText()));
        test.setX6(Double.parseDouble(TF7sixth.getText()));
        CreateArray check = new CreateArray(test.getC(), test.getX1(), test.getX2(), test.getX3(), test.getX4(), test.getX5(), test.getX6());
        test.setData(check.getX());
        test.setData1(check.getY());
        f.add(test);
        f.setSize(800, 800);
        f.setLocation(200,200);
  	    f.repaint();
        f.setVisible(true);
        }
  	    catch (IllegalArgumentException error){
  	        frame.setContentPane(errorPanel);
  		    frame.repaint();
  		    frame.setVisible(true);
  	    }
  	}





    //HYPERBOLA PANEL
    else if (button == BGHyp){
        JFrame f = new JFrame("Graph");
        Function test = new Function();
        try {
            test.setXHyp(Double.parseDouble(TFHyp.getText()));
            CreateArray check = new CreateArray(test.getXHyp());
            test.setData(check.getX());
            test.setData1(check.getY());
            f.add(test);
            f.setSize(800, 800);
            f.setLocation(200,200);
            f.repaint();
            f.setVisible(true);
        }
        catch (IllegalArgumentException error){
            frame.setContentPane(errorPanel);
            frame.repaint();
            frame.setVisible(true);
        }
    }





	//ERROR PANEL
  	else if (button == back){
  		frame.setContentPane(CoverMain);
  		frame.repaint();
  		frame.setVisible(true);
  	}





	//HELP PANELS
	else if (button == HelpCalc){
        JFrame f = new JFrame("Help");
		f.setContentPane(HelpCalcPane);
		f.setSize(1000, 150);
        f.setLocation(200,200);
        f.repaint();
        f.setVisible(true);
    }

	else if (button == HelpCons){
        JFrame f = new JFrame("Help");
		f.setContentPane(HelpConsPane);
		f.setSize(1000, 150);
        f.setLocation(200,200);
        f.repaint();
        f.setVisible(true);
    }

	else if (button == HelpLine){
        JFrame f = new JFrame("Help");
		f.setContentPane(HelpLinePane);
		f.setSize(1000, 150);
        f.setLocation(200,200);
        f.repaint();
        f.setVisible(true);
    }

	else if (button == HelpQuad){
        JFrame f = new JFrame("Help");
		f.setContentPane(HelpQuadPane);
		f.setSize(1000, 150);
        f.setLocation(200,200);
        f.repaint();
        f.setVisible(true);
    }

	else if (button == HelpCube){
        JFrame f = new JFrame("Help");
		f.setContentPane(HelpCubePane);
		f.setSize(1000, 150);
        f.setLocation(200,200);
        f.repaint();
        f.setVisible(true);
    }

	else if (button == HelpQuar){
        JFrame f = new JFrame("Help");
		f.setContentPane(HelpQuarPane);
		f.setSize(1000, 150);
        f.setLocation(200,200);
        f.repaint();
        f.setVisible(true);
    }

	else if (button == HelpQuin){
        JFrame f = new JFrame("Help");
		f.setContentPane(HelpQuinPane);
		f.setSize(1000, 150);
        f.setLocation(200,200);
        f.repaint();
        f.setVisible(true);
    }

	else if (button == HelpSext){
        JFrame f = new JFrame("Help");
		f.setContentPane(HelpSextPane);
		f.setSize(1000, 150);
        f.setLocation(200,200);
        f.repaint();
        f.setVisible(true);
    }

	else if (button == HelpHype){
        JFrame f = new JFrame("Help");
		f.setContentPane(HelpHypePane);
		f.setSize(1000, 150);
        f.setLocation(200,200);
        f.repaint();
        f.setVisible(true);
    }
	}





	//MAIN
    public static void main(String[]args){
  	    GraphingCalculator g = new GraphingCalculator();
    }
  }
