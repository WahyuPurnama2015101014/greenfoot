import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    Counter waktu = new Counter("Timer : ");
    private int enemyControl = 0;
    private int itung = 0;
    //private int enemyControlBoss = 0;
    private void prepare()
    {
        Hero lebah = new Hero();
        addObject(lebah,50,200);
        addObject(waktu , 50, 20);
        waktu.setValue(60);
        addObject(new enemiBoss(),700,200);
    }

    public void act()
    {
        spawnEnemyMob();
        if(itung==60){
            waktu.setValue(waktu.getValue()-1);
            itung = 0;
        }else{
            itung++;
        }
        if(waktu.getValue()==0){
            Greenfoot.stop();
        }

    }

    private void spawnEnemyMob(){
        // if(enemyControl == 60){
            // int kec = -(Greenfoot.getRandomNumber(3)+1);
            // addObject(new Enemy(kec),780,Greenfoot.getRandomNumber(300));
            // enemyControl = 0;
        // }else{
            // enemyControl++;
        // }
        if(enemyControl == 120){
            int kec = -(Greenfoot.getRandomNumber(3)+1);
            addObject(new enemyLaser(kec),780,Greenfoot.getRandomNumber(300));
            enemyControl = 0;
        }else{
            enemyControl++;
        }
    }

}
