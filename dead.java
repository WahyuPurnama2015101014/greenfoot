import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dead extends Actor
{
    /**
     * Act - do whatever the dead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timerHilang = 0;
    public void act()
    {
        turn(1);
        if(timerHilang == 30){
            getWorld().removeObject(this);
        }
         timerHilang++;
    }
}
