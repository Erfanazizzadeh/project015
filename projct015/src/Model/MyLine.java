package Model;

import java.awt.*;
import java.awt.geom.Line2D;

public class MyLine extends Shape {
    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3.0f));
        g2.setColor(new Color(0,0,0));
        g2.draw(new Line2D.Double(getPoint1().getX(),getPoint1().getY(),
                getPoint2().getX(),getPoint2().getY()));

    }
}
