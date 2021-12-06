import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluruC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluruC extends TembakanHero
{
    /**
     * Act - do whatever the peluruC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()+5,getY()-2);
        super.act();
    }
}
