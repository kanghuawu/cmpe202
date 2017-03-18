import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    public Coin()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ; 
    }
    
    public void act() 
    {
        int mouseX, mouseY ;
        if(Greenfoot.mouseDragged(this)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);
        } 
    }
    public void returnCoin(World world){
        world.addObject(this, 100 + Greenfoot.getRandomNumber(100), 500 + Greenfoot.getRandomNumber(60));
    }
}
