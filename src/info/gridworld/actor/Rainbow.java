package info.gridworld.actor;

import info.gridworld.grid.Location;

import java.awt.Color;

public class Rainbow extends Actor
{
		
	    private static final double DARKENING_FACTOR = 0.05;

	    public Rainbow()
	    {
	        
	    }

	    /**
	     * Constructs a flower of a given color.
	     * @param initialColor the initial color of this flower
	     */
	    public Rainbow(Color initialColor)
	    {
	        setColor(initialColor);
	    }

	    /**
	     * Causes the color of this flower to darken.
	     */
	    public void act()
	    {
	        Color c = getColor();
//	        int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
//	        int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
//	        int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));
//
//	        setColor(new Color(red, green, blue));
	       
	        
	    }
	    
	    public void turn()
	    {
	        setDirection(getDirection() + Location.HALF_RIGHT);
	    }
}
