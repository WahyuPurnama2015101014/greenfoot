import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemyLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyLaser extends Enemy
{
    /**
     * Act - do whatever the enemyLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int kec;
    public enemyLaser(){
        //setRotation(180);
        kec = -1;
    }
    public enemyLaser(int speed){
        //setRotation(180);
        kec = speed;
    }
    public void act()
    {
        move(kec);
        EnemyShoot();
        super.act();
        // Add your action code here.
    }
    
}
