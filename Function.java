import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

public class Function extends JPanel {
    private double[] data;
    private double[] data1;
    private String label;
    private char[] labelchars;
    private char[][] numbers;
    private char[][] negnumbers;
    private char[] Max;
    private char[] Min;
    private char[] Roots;
    private boolean X1;
    private boolean X2;
    private boolean X3;

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
        g2.drawString("The roots of your function are:", 50, 150);
	// g2.drawChars(Roots, 0, Roots.length - 1, 50, 170);
        g2.drawString("X-Axis", 940, 405);
        g2.drawString("Y-Axis", 450, 40);
	//g2.drawChars(Min,0, Min.length, 50, 300);
	//g2.drawChars(Max,0, Max.length, 50, 340);
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


        for(int counter = -20; counter < 21; counter++){
        g2.draw(new Line2D.Double(w/2 - 10, h/2 + 50*counter, w/2 + 10, h/2 + 50* counter));
        }

        for(int counter = -24; counter < 25; counter++){
        g2.draw(new Line2D.Double(w/2 + 50*counter, h/2 - 10, w/2 + 50*counter, h/2 + 10));
        }


        createNumbers();
        for(int counter = 1; counter < 25; counter++){
          g2.drawChars(numbers[counter], 0, numbers[counter].length, w/2 + 10, (h/2 - 40* counter) + 15);
        }
	      for(int counter = 0; counter < 25; counter++){
	         g2.drawChars(numbers[counter], 0, numbers[counter].length, (w/2 + (40* counter)), h/2 + 20);
        }


        createNegNumbers();
        for(int counter = 0; counter < 25; counter++){
         g2.drawChars(negnumbers[counter], 0, negnumbers[counter].length, w/2 + 10, (h/2 + 40* counter));
        }
        for(int counter = 0; counter < 25; counter++){
	       g2.drawChars(negnumbers[counter], 0, negnumbers[counter].length, (w/2 - (40* counter)), h/2 + 20);
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
    answer[0] = '3';
    labelchars= answer;
       /*if(X1 != 0){
         label+= "3";
       }
       else if(X2 != 0){
         label+= "2";
       }
       else if(X3 != 0){
         label+= "1";
       }
       else{
         label+= "0";
       }*/

     }
     public void setRoots(char[] roots){
       Roots = roots;
     }
   public void createNumbers(){
       char[][] a = new char[25][10];
       for(int counter = 0; counter < 25; counter++){
         String ans = new String ("");
   	     char[] answer = new char[10];
	        ans+= (counter);
          answer = ans.toCharArray();
	        for(int count = 0; count < answer.length; count++){
	           a[counter][count] = answer[count];
           }
         }
         numbers = a;
    }
    public void createNegNumbers(){
        char[][] a = new char[25][10];
        for(int counter = 0; counter < 25; counter++){
          String ans = new String ("");
    	     char[] answer = new char[10];
 	        ans+= (counter * -1);
           answer = ans.toCharArray();
 	        for(int count = 0; count < answer.length; count++){
 	           a[counter][count] = answer[count];
            }
          }
          negnumbers = a;
     }
    public String getLabel(){
       return label;
     }

    //calculate max of y coordinates;
    /*public String ymax(){
      String answer = new String("");
      if(X6on){
        if(X6 < 0){
          answer+= C;
        }
        else{
          answer+= "∞";
        }
        }
        else if(X5on){
            answer+= "∞";
      }
      else if(X4on){
        if(X4 < 0){
          answer+= C;
        }
        else{
          answer+= "∞";
        }
      }
      else if(X3on){
          answer+= "∞";
        }
        else if(X2on){
          if(X2 < 0){
            answer+= C;
          }
          else{
            answer+= "∞";
          }
        }
        else if(Xon){
          answer+= "∞";
        }
        else{
          answer+= C;
        }
      }

*/

    public double ymin(){
      double ymin = data1[0];
      for(int counter = 1; counter < data1.length; counter++){
        if(data1[counter] < ymin){
          ymin = data1[counter];
        }
      }
      return ymin;
    }

    //set xcoordinate array;
    public void setData(double[] arg){
      data = arg;
    }
    public void setData1(double[] arg){
      data1 = arg;
    }
    public static void main() {
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
    }
}
