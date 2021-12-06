import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemiBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemiBoss extends Enemy
{
    /**
     * Act - do whatever the enemiBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    int hp = 20;
    public void act()
    {
        if(isTouching(TembakanHero.class)){
            hp--;
            removeTouching(TembakanHero.class);
        }
        if(hp>=0){
            getWorld().showText​("Boss Hp :"+hp, getX(),getY()+180);   
        }else {
            getWorld().addObject(new dead(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.stop();

        }
        EnemyShoot();
    }
}
