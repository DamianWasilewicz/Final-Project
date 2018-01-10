import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

public class Graph extends JPanel {
    private double[] data;
    private double[] data1;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        int w = getWidth();
        int h = getHeight();
        // Draw x axis
        g2.draw(new Line2D.Double(0, .5 * h, w, .5 * h));
        // Draw y axis
        g2.draw(new Line2D.Double(.5 * w, 0, .5 * w, h));
        // Draw lines.
        g2.setPaint(Color.BLUE);

        g2.draw(new Line2D.Double(w/2, h/2, w/2 + data[0], h/2 + data1[0] * -1));
        for(int i = 0; i < data.length-1; i++) {
            double x1 = w/2 + data[i] * w/100;
            double y1 = h/2 + data1[i] * -1 * h/100;
            double x2 = w/2 + data[i + 1] * w/100;
            double y2 = h/2 +data1[i+ 1] * -1 * h/100;
            g2.draw(new Line2D.Double(x1, y1, x2, y2));
	    }
    }
    public double xmax(){
      double xmax = data[0];
      for(int counter = 1; counter < data.length; counter++){
        if(data[counter] > xmax){
          xmax = data[counter];
        }
      }
      return xmax;
    }
    public double ymax(){
      double ymax = data1[0];
      for(int counter = 1; counter < data1.length; counter++){
        if(data1[counter] > ymax){
          ymax = data1[counter];
        }
      }
      return ymax;
    }
    public void setData(double[] arg){
      data = arg;
    }
    public void setData1(double[] arg){
      data1 = arg;
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Graph test = new Graph();
        CreateArray check = new CreateArray();
        test.setData(check.getX());
        test.setData1(check.getY());
        f.add(test);
        f.setSize(800, 800);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}
