import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

public class Function extends JPanel {
    private double[] data;
    private double[] data1;
    private String label;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        //set variables for size of graph screen;
        int w = getWidth();
        int h = getHeight();
        // Draw x axis
        g2.draw(new Line2D.Double(0, .5 * h, w, .5 * h));
        // Draw y axis
        g2.draw(new Line2D.Double(.5 * w, 0, .5 * w, h));
        // Set color of graph
        g2.setPaint(Color.BLUE);
        // Draw lines.
        g2.draw(new Line2D.Double(w/2, h/2, w/2 + data[0], h/2 + data1[0] * -1));
        for(int i = 0; i < data.length-1; i++) {
            double x1 = w/2 + data[i] * w/100;
            double y1 = h/2 + data1[i] * -1 * h/100;
            double x2 = w/2 + data[i + 1] * w/100;
            double y2 = h/2 +data1[i+ 1] * -1 * h/100;
            g2.draw(new Line2D.Double(x1, y1, x2, y2));
	    }
         g2.drawString(label, 250, 50);
    }
    //creates Header Label
    /*
    public void createLabel(){
      String label = new String ("you are viewing a function with degree");
       if(X3 != 0){
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
       }
     }
     */
    //calculate max of x coordinates;
    public double xmax(){
      double xmax = data[0];
      for(int counter = 1; counter < data.length; counter++){
        if(data[counter] > xmax){
          xmax = data[counter];
        }
      }
      return xmax;
    }
    //calculate max of y coordinates;
    public double ymax(){
      double ymax = data1[0];
      for(int counter = 1; counter < data1.length; counter++){
        if(data1[counter] > ymax){
          ymax = data1[counter];
        }
      }
      return ymax;
    }
    //set xcoordinate array;
    public void setData(double[] arg){
      data = arg;
    }
    public void setData1(double[] arg){
      data1 = arg;
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Function test = new Function();
        CreateArray check = new CreateArray();
        test.setData(check.getX());
        test.setData1(check.getY());
        f.add(test);
        f.setSize(800, 800);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}
