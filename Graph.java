import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

public class Graph extends JPanel {
    int[] data = {
        50, 100, 150, 200
    };
    int size = data.length;
    int[] data1 = {
        100,200,300,400
    };
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        int w = getWidth();
        int h = getHeight();
        // Draw x axis
        g2.draw(new Line2D.Double(0, 0, 0, h));
        // Draw y axis
        g2.draw(new Line2D.Double(0, 0, w, 0));
        // Draw lines.
        g2.setPaint(Color.BLUE);
        g2.draw(new Line2D.Double(0, 0, data[0], data1[0]));
        for(int i = 0; i < size-1; i++) {
            double x1 = data[i];
            double y1 = data1[i];
            double x2 = data[i + 1];
            double y2 = data1[i+ 1];
            g2.draw(new Line2D.Double(x1, y1, x2, y2));
        }
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Graph());
        f.setSize(400, 400);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}
