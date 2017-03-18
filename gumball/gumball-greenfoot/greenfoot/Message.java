import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage gi;
    private World world;
    private Actor GM;
    
    public void act() 
    {
    }
    
    public Message(){
        gi = new GreenfootImage(100, 30);
        setImage(gi);
    }
    public void draw(String myMessage){
        gi.clear();
        gi.setColor(Color.GREEN);
        gi.fill();
        gi.setColor(Color.BLACK);
        Font font = new Font(15);
        gi.setFont(font);
        gi.drawString(myMessage, 0, 20); 
    }
    
}
