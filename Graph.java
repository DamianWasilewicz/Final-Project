import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

public class Graph extends JPanel {
    int[] data = {
        100, 200
    };
    int size = data.length;
    int[] data1 = {
        100,200
    };
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
        for(int i = 0; i < size-1; i++) {
            double x1 = w/2 + data[i];
            double y1 = h/2 + data1[i] * -1;
            double x2 = w/2 + data[i + 1];
            double y2 = h/2 +data1[i+ 1] * -1;
            g2.draw(new Line2D.Double(x1, y1, x2, y2));
	    }
    }
    public int xmax(){
      int xmax = data[0];
      for(int counter = 1; counter < data.length; counter++){
        if(data[counter] > xmax){
          xmax = data[counter];
        }
      }
      return xmax;
    }
    public int ymax(){
      int ymax = data1[0];
      for(int counter = 1; counter < data1.length; counter++){
        if(data1[counter] > ymax){
          ymax = data1[counter];
        }
      }
      return ymax;
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Graph test = new Graph();
        f.add(test);
        f.setSize(test.xmax() * 2, test.ymax() * 2);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}
