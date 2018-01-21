import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

public class Function extends JPanel {
    private double[] data;
    private double[] data1;
    private char[] labelchars;
    private char[][] numbers;
    private char[][] negnumbers;
    private char[] Max;
    private char[] Min;
    private char[] FunctionName;
    private char[] TurningPoints;
    private char[] YIntercepts;
    private double C;
    private double X1;
    private double X2;
    private double X3;
    private double X4;
    private double X5;
    private double X6;
    private double XHyp;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        //set variables for size of graph screen;
        int w = getWidth();
        int h = getHeight();
          // Set color of axes
	      g2.setBackground(Color.BLACK);
        g2.setPaint(Color.BLUE);
        // Draw x axis
        g2.draw(new Line2D.Double(0, .5 * h, w, .5 * h));
        // Draw y axis
        g2.draw(new Line2D.Double(.5 * w, 0, .5 * w, h));
        // Draw lines.
        createLabel();
        //Add Header;
        g2.setPaint(Color.MAGENTA);
        g2.drawString("You are viewing a function", 50, 50);
        g2.drawString("of degree: ", 50, 65);
        g2.drawChars(labelchars,0, 1, 120, 65);
        ymax();
        ymin();
        g2.drawString("The max of the function:", 50, 150);
        g2.drawChars(Max, 0, Max.length, 210, 150);
        g2.drawString("The min of the function:", 50, 165);
        g2.drawChars(Min, 0, Min.length, 210, 165);

        findYIntercepts();
        FindTurningPoints();
        g2.drawString("The turning points of the function:", 1, 220);
        g2.drawChars(TurningPoints, 0, TurningPoints.length, 1, 240);
        g2.drawString("The y-intercepts of the function:", 1, 260);
        g2.drawChars(YIntercepts, 0, YIntercepts.length, 210, 260);


        g2.drawString("X-Axis", 750, 435);
        g2.drawString("Y-Axis", 450, 40);
	//	g2.drawString(XIntercepts, 940, 405);
	//	g2.drawString(YIntercepts, 940, 405);
        //add labels for axes;
        g2.setPaint(Color.BLUE);
        //construct arrows;
        g2.draw(new Line2D.Double(0, h/2, 20, h/2 + 20));
        g2.draw(new Line2D.Double(0, h/2, 20, h/2 - 20));
        g2.draw(new Line2D.Double(w/2, 0, w/2 + 20, 20));
        g2.draw(new Line2D.Double(w/2, 0, w/2 - 20, 20));
        g2.draw(new Line2D.Double(w, h/2, w-20, h/2 + 20));
        g2.draw(new Line2D.Double(w, h/2, w-20, h/2 - 20));
        g2.draw(new Line2D.Double(w/2, h, w/2 + 20, h-20));
        g2.draw(new Line2D.Double(w/2, h, w/2 - 20, h-20));

        g2.drawString("Your function is:", 10, 180);

        createFunctionName();
        g2.drawChars(FunctionName, 0, FunctionName.length, 10, 200);


        for(int counter = -100; counter < 100; counter++){
        g2.draw(new Line2D.Double(w/2 - 10, h/2+ 79 * counter, w/2 + 10, h/2 + 79 * counter));
        }

        for(int counter = -100; counter < 100; counter++){
        g2.draw(new Line2D.Double(w/2 + 79*counter, h/2 - 10, w/2 + 79 *counter, h/2 + 10));
        }


        createNumbers();
        for(int counter = 1; counter < 25; counter++){
          g2.drawChars(numbers[counter], 0, numbers[counter].length, w/2+ 10, (h/2- (79* counter)));
        }
	      for(int counter = 0; counter < 25; counter++){
	         g2.drawChars(numbers[counter], 0, numbers[counter].length, (w/2 + (79 * counter)), h/2 + 20);
        }


        createNegNumbers();
        for(int counter = 0; counter < 25; counter++){
         g2.drawChars(negnumbers[counter], 0, negnumbers[counter].length, w/2 + 10, (h/2 + (79* counter)));
        }
        for(int counter = 0; counter < 25; counter++){
	       g2.drawChars(negnumbers[counter], 0, negnumbers[counter].length, (w/2 - (79 * counter)), h/2 + 20);
        }


        g2.setPaint(Color.RED);
        for(int i = 0; i < data.length-1; i++) {
            double x1 = w/2 + data[i] * w/100;
            double y1 = h/2 + data1[i] * -1 * h/100;
            double x2 = w/2 + data[i + 1] * w/100;
            double y2 = h/2 +data1[i+ 1] * -1 * h/100;
            g2.draw(new Line2D.Double(x1, y1, x2, y2));
	    }
      //for(int counter = -20; counter < 21; counter++){

    //  }
    }
    //creates Header Label
    public void createLabel(){
      char[] answer = new char[1];
      String label = new String("");
      if(C != 0){
      label= "0";
      }
      if(X1 != 0){
         label= "1";
       }
      if(X2 != 0){
         label= "2";
       }
      if(X3 != 0){
         label= "3";
       }
       if(X4!= 0){
          label= "4";
        }
        if(X5 != 0){
           label= "5";
         }
         if(X6 != 0){
            label= "6";
          }
          if(XHyp != 0){
            label = "Hyperbolic";
          }
          answer = label.toCharArray();
          labelchars = answer;
       }

     //public void setRoots(char[] roots){
    //   Roots = roots;
    // }
   public void createNumbers(){
       char[][] a = new char[100][10];
       for(int counter = 0; counter < 25; counter++){
         String ans = new String ("");
   	     char[] answer = new char[10];
	        ans+= (counter * 10);
          answer = ans.toCharArray();
	        for(int count = 0; count < answer.length; count++){
	           a[counter][count] = answer[count];
           }
         }
         numbers = a;
    }
    public void createNegNumbers(){
        char[][] a = new char[100][10];
        for(int counter = 0; counter < 25; counter++){
          String ans = new String ("");
    	     char[] answer = new char[10];
 	        ans+= (counter * 10);
           answer = ans.toCharArray();
 	        for(int count = 0; count < answer.length; count++){
 	           a[counter][count] = answer[count];
            }
          }
          negnumbers = a;
     }

    //calculate max of y coordinates;
    public void ymax(){
      String answer = new String("");
      if(XHyp != 0){
        answer = "Infinity";
      }
     if(C!= 0){
        answer= "" + C;
      }
      if(X1 != 0){
        answer= "Infinity";
      }
       if(X2 != 0){
        if(X2 < 0){
          answer= "" + findymax();
        }
        if(X2 > 0){
          answer= "Infinity";
        }
      }
      if(X3 != 0){
        answer= "Infinity";
      }
       if(X4!= 0){
        if(X4 < 0){
         answer = "" +findymax();
       }
        else{
          answer= "Infinity";
        }
      }
     if(X5 != 0){
            answer= "Infinity";
      }
        if(X6 != 0){
          if(X6 < 0){
          answer= "" + findymax();
        }
        else{
          answer= "Infinity";
          }
        }
        Max = answer.toCharArray();
      }

      public void ymin(){
        String answer = new String("");
        if(XHyp != 0){
          answer = "Negative Infinity";
        }
       if(C!= 0){
          answer= "" + C;
        }
        if(X1 != 0){
          answer= "Negative Infinity";
        }
         if(X2 != 0){
          if(X2 > 0){
            answer= "" + findymin();
          }
          if(X2 < 0){
            answer= "Negative Infinity";
          }
        }
        if(X3 != 0){
          answer= "Negative Infinity";
        }
         if(X4!= 0){
          if(X4 > 0){
           answer = "" +findymin();
         }
          else{
            answer= "Negative Infinity";
          }
        }
       if(X5 != 0){
              answer= "Negative Infinity";
        }
          if(X6 != 0){
            if(X6 > 0){
            answer= "" + findymin();
          }
          else{
            answer= "Negative Infinity";
            }
          }
          Min = answer.toCharArray();
        }

    public double findymax(){
      double answer = -100000000;
      for(int counter = 0; counter < data1.length; counter++){
        if (data1[counter] > answer){
        answer = data1[counter];
      }
    }
      return answer;
    }
    public double findymin(){
      double answer = 100000000;
      for(int counter = 0; counter < data1.length; counter++){
        if (data1[counter] < answer){
        answer = data1[counter];
      }
    }
      return answer;
    }
    public void createFunctionName(){
      String answer = new String("y = ");
      if(XHyp != 0.0){
        answer+= XHyp + "/x";
      }
      if(X6 != 0.0){
        if(X6%1 == 0){
          int x6 = (int)X6;
          if(x6 == 1){
            answer+= "x^6";
          }
          else{
            answer+= x6 + "x^6";
          }
          if(X5 != 0.0){
            answer+= " + ";
          }
        }
        else {
          if(X6 == 1){
          answer+= "x^6";
        }
        else{
          answer+= X6 + "x^6";
        }
        if(X5 != 0.0){
          answer+= " + ";
        }
      }
    }
      if(X5 != 0.0){
        if(X5%1 == 0){
          int x5 = (int)X5;
          if(x5 == 1){
            answer+= "x^5";
          }
          else{
            answer+= x5 + "x^5";
          }
          if(X4 != 0.0){
            answer+= " + ";
          }
        }
        else {
          if(X5 == 1){
          answer+= "x^5";
        }
        else{
          answer+= X5 + "x^5";
        }
        if(X4 != 0.0){
          answer+= " + ";
        }
      }
    }
      if(X4 != 0.0){
        if(X4%1 == 0){
          int x4 = (int)X4;
          if(x4 == 1){
            answer+= "x^4";
          }
          else{
            answer+= x4 + "x^4";
          }
          if(X3 != 0.0){
            answer+= " + ";
          }
        }
        else {
          if(X4 == 1){
          answer+= "x^4";
        }
        else{
          answer+= X4 + "x^4";
        }
        if(X3 != 0.0){
          answer+= " + ";
        }
      }
    }
      if(X3 != 0.0){
        if(X3%1 == 0){
          int x3 = (int)X3;
          if(x3 == 1){
            answer+= "x^3";
          }
          else{
            answer+= x3 + "x^3";
          }
          if(X2 != 0.0){
            answer+= " + ";
          }
        }
        else {
          if(X3 == 1){
          answer+= "x^3";
        }
        else{
          answer+= X3 + "x^3";
        }
        if(X2 != 0.0){
          answer+= " + ";
        }
      }
    }
      if(X2 != 0.0){
        if(X2%1 == 0){
          int x2 = (int)X2;
          if(x2 == 1){
            answer+= "x^2";
          }
          else{
            answer+= x2 + "x^2";
          }
          if(X1 != 0.0){
            answer+= " + ";
          }
        }
        else {
          if(X2 == 1){
          answer+= "x^2";
        }
        else{
          answer+= X2 + "x^2";
        }
        if(X1 != 0.0){
          answer+= " + ";
        }
      }
    }
      if(X1 != 0.0){
        if(X1%1 == 0){
          int x1 = (int)X1;
          if(x1 == 1){
            answer+= "x";
          }
          else{
            answer+= x1 + "x";
          }
          if(C != 0.0){
            answer+= " + ";
          }
        }
        else {
          if(X1 == 1){
          answer+= "x";
        }
        else{
          answer+= X1 + "x";
        }
        if(C != 0.0){
          answer+= " + ";
        }
      }
    }
      if(C != 0.0){
        if(C%1 == 0){
          int c = (int)C;
          if(c == 1){
            answer+= c;
          }
          else{
            answer+= c;
          }
        }
        else{
          answer+= C;
        }
      }
      FunctionName = answer.toCharArray();
    }

    //set xcoordinate array;
    public void setData(double[] arg){
      data = arg;
    }
    public void setData1(double[] arg){
      data1 = arg;
    }
    public void setC(double input){
      C = input;
    }
    public void setX1(double input){
      X1 = input;
    }
    public void setX2(double input){
      X2 = input;
    }
    public void setX3(double input){
      X3 = input;
    }
    public void setX4(double input){
      X4 = input;
    }
    public void setX5(double input){
      X5 = input;
    }
    public void setX6(double input){
      X6 = input;
    }
    public void setXHyp(double input){
      XHyp = input;
    }

    public double getC(){
      return C;
    }
    public double getX1(){
      return X1;
    }
    public double getX2(){
      return X2;
    }
    public double getX3(){
      return X3;
    }
    public double getX4(){
      return X4;
    }
    public double getX5(){
      return X5;
    }
    public double getX6(){
      return X6;
    }
    public double getXHyp(){
      return XHyp;
    }
    public void FindTurningPoints(){
      String answer = new String("");
      for(int counter = 1; counter< data.length - 1; counter++){
        if(Math.signum(data1[counter] - data1[counter - 1]) != Math.signum(data1[counter + 1] -  data1[counter])){
          answer+= "(" + String.format("%.2f",data[counter]) + "," + String.format("%.2f",data1[counter])  + ")  ";
        }
      }
      TurningPoints = answer.toCharArray();
    }
    /*public void findRoots(){
      String answer = new String("");
      if(X1!= 0){
        answer += (-1 * C)/X1;
      }
        Roots = answer.toCharArray();
      }*/
    public void findYIntercepts(){
      String answer = new String("");
      answer+= C;
      YIntercepts = answer.toCharArray();
    }

    /*public void setX4(String input){
      X4 = Double.parseDouble(input);
    }
    public void setX5(String input){
      X5 = Double.parseDouble(input);
    }
    public void setX6(String input){
      X6 = Double.parseDouble(input);
    }*/
    /*public static void main() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Function test = new Function();
        CreateArray check = new CreateArray();
        test.setRoots(check.getRoots());
        test.setData(check.getX());
        test.setData1(check.getY());
        test.setRoots(check.getRoots());
	//test.SetMaxandMin(test.ymax(), test.ymin());
        f.add(test);
        f.setSize(1000, 1000);
        f.setLocation(200,200);
        f.setVisible(true);
    }*/
}
