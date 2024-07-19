package assignment;

import java.awt.Color;
import java.awt.Graphics;

import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxList = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxList.add(new BouncingBox(200, 50, Color.RED));
        boxList.add(new BouncingBox(200, 100, Color.BLUE));
        boxList.add(new BouncingBox(200, 150, Color.GREEN));
        boxList.get(0).setMovementVector(1, 0);
        boxList.get(1).setMovementVector(0, -2);
        boxList.get(2).setMovementVector(-1, 2);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawRect(30, 40, 30, 30);
        surface.drawOval(70, 70, 30, 30);
        int px1[] = {150, 190, 110, 150};
        int py1[] = {110, 150, 150, 110};
        surface.drawPolygon(px1, py1, 4);
        boxList.get(0).draw(surface);
        boxList.get(1).draw(surface);
        boxList.get(2).draw(surface);
    }
} 
