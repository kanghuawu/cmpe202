import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public Gumball pickGumball(){
        Gumball gb = new Gumball();
        int randomNum = Greenfoot.getRandomNumber(3);
        switch(randomNum){
            case 0: gb = new RedGumball(); break;
            case 1: gb = new BlueGumball(); break;
            case 2: gb = new GreenGumball(); break;
        }
        return gb;
    }
}
