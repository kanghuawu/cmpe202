import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public boolean checkQuarter(Actor coin){
        System.out.println("Inspector checking...");
        if(coin instanceof FakeQuarter || coin instanceof Penny){ 
            System.out.println("This is not a Quarter");
            return false;
        }
        else {
            System.out.println("This is indeed a Quarter");
            return true; 
        }
            
    }
    
    public Picker getPicker(){
        World world = this.getWorld();
        Picker picker;
        System.out.println("Inspector is choosing a Picker");
        if(Greenfoot.getRandomNumber(10) > 5 ){
            picker = world.getObjects(RandomPicker.class).get(0);
        }else{
            picker = world.getObjects(GreenPicker.class).get(0);
        }
        return picker;
    }
}
