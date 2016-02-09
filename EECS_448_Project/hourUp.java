import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hourUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hourUp extends ClockMenu
{
    /**
     * Act - do whatever the hourUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {        
        toggle();
    }    
    
    public hourUp()
    {
        setImage("plus.png");
    }
    
    public void toggle()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            myClock.changeHour(true);
        }
    }
}
