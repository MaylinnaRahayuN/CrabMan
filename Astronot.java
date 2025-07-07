import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Astronot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Astronot extends Actor
{
    /**
     * Act - do whatever the Astronot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Astronot()
    {
        getImage().scale(getImage().getWidth() / 1, getImage().getHeight() / 1);
    }
    
    public void act()
    {
        moveAround();
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 2, getY());

        }
         if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 2, getY());

        }
         if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 2);
        }
         if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+ 2);
        }
    }
    


}
