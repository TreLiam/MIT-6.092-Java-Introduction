package assignment;

import java.util.ArrayList;

import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
//    ArrayList<Bouncer> movingSpriteList_1 = new ArrayList<Bouncer>();
//    ArrayList<StraightMover> movingSpriteList_2 = new ArrayList<StraightMover>();
    
    ArrayList<Mover> moverList = new ArrayList<Mover>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Oval oval1 = new Oval(40, 40, Color.RED);
        Rectangle box1 = new Rectangle(50, 100, Color.GREEN);
        
        Oval oval2 = new Oval(30, 20, Color.BLUE);
        Rectangle box2 = new Rectangle(30, 50, Color.YELLOW);
        
        moverList.add(new Bouncer(50, 120, oval1));
        moverList.add(new Bouncer(100, 170, box1));
        moverList.add(new StraightMover(30, 40, oval2));
        moverList.add(new StraightMover(10, 70, box2));
        
        moverList.get(0).setMovementVector(3, 1);
        moverList.get(1).setMovementVector(-2, 2);
        moverList.get(2).setMovementVector(3, 1);
        moverList.get(3).setMovementVector(-2, 2);
        
//        movingSpriteList_1.add(new Bouncer(50, 120, oval1));
//        movingSpriteList_1.add(new Bouncer(100, 170, box1));
//        
//        movingSpriteList_2.add(new StraightMover(30, 40, oval2));
//        movingSpriteList_2.add(new StraightMover(10, 70, box2));
//        
//        movingSpriteList_1.get(0).setMovementVector(3, 1);
//        movingSpriteList_1.get(1).setMovementVector(-2, 2);
//        
//        movingSpriteList_2.get(0).setMovementVector(3, 1);
//        movingSpriteList_2.get(1).setMovementVector(-2, 2);
        
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
    	for(Mover mover:moverList) {
    		mover.draw(surface);
    	}
    	
//    	for(Bouncer movingSprite:movingSpriteList_1) {
//        	movingSprite.draw(surface);
//        }
//    	
//    	for(StraightMover movingSprite:movingSpriteList_2) {
//        	movingSprite.draw(surface);
//        }
    }
}
