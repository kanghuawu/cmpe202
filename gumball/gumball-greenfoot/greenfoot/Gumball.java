import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gumball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gumball extends Actor
{

    public Gumball()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ; 
    }

    public void act() 
    {
        // Add your action code here.
    }
    
    public void ejectGumball(World world){
        world.addObject(this, 500, 500);
    }
    
    public String toString(){
        return this.getClass().toString().substring(6) + " ejected";
    }
}
