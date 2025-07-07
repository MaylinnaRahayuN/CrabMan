import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WellHeightSmallBgt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WellHeightSmallBgt extends Walls
{
    /**
     * Act - do whatever the WellHeightSmallBgt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WellHeightSmallBgt()
    {
        getImage().scale(getImage().getWidth() / 6, getImage().getHeight() * 10);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
