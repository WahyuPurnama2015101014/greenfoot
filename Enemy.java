import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int kec;
    private int enemiKilled = 0;
    public Enemy(){
        //setRotation(180);
        kec = -1;
    }
    public Enemy(int speed){
        //setRotation(180);
        kec = speed;
    }
    int tTimer = 0;
    protected void EnemyShoot(){
       
        if(tTimer==90){
           getWorld().addObject(new TembakanEnemy(),getX(),getY());
           tTimer=0;
        }else{
             tTimer++;
        }
    }
    public void act()
    {
        // Add your action code here.
        if(isAtEdge()){
            getWorld().removeObject(this);
        }else if(isTouching(TembakanHero.class)){
            getWorld().addObject(new dead(),getX(),getY());
            removeTouching(TembakanHero.class);
            getWorld().removeObject(this);
            enemiKilled++;
        }
    }
    
    
    
}
