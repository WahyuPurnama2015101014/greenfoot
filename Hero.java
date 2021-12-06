import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private void moveHero(){
        if(Greenfoot.isKeyDown("A")||Greenfoot.isKeyDown("left")){
            move(-5);
        }
        if(Greenfoot.isKeyDown("D")||Greenfoot.isKeyDown("right")){
            move(5);
        }
        if(Greenfoot.isKeyDown("W")||Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-5);
        }
        if(Greenfoot.isKeyDown("S")||Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+5);
        }
    }
    int tTimer = 0;
    private void shoot(int aspd){
        peluruA b1 = new peluruA();
        peluruB b2 = new peluruB();
        peluruC b3 = new peluruC();
        if(tTimer==aspd){
            getWorld().addObject(b1,getX(),getY());
            getWorld().addObject(b2,getX(),getY());
            getWorld().addObject(b3,getX(),getY());
            tTimer=0;
        }else{
            tTimer++;
        }
    }

    public void act()
    {
        // Add your action code here
        moveHero();
        shoot(60);
        if(isTouching(TembakanEnemy.class)){
            getWorld().addObject(new dead(),getX(),getY());
            removeTouching(TembakanEnemy.class);
           // Greenfoot.stop();
        }

    }
}
