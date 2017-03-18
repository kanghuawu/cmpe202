import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    private Message message;
    private Coin coin;
    private Inspector inspector;
    private World world;
    
    private boolean haveCoin = false;
    
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 );
        world = this.getWorld();
        
        
    }

    public void act() 
    {
        world = this.getWorld();
         
        
        if(this.isTouching(Coin.class) && ! haveCoin){
            coin = Coin.class.cast(getOneIntersectingObject(Coin.class));
            world.removeObject(coin);
            
            System.out.println("Coin inserted");
            message = world.getObjects(Message.class).get(0);
            message.draw("Have Coin");
            
            haveCoin = true;
        }
        
        inspector = world.getObjects(Inspector.class).get(0);
        
        if(haveCoin && (Greenfoot.mousePressed(this) || Greenfoot.mousePressed(message))){
            
            if(inspector.checkQuarter(coin)){
                
                Picker picker = inspector.getPicker();
                System.out.println(picker);
                
                Gumball gb = picker.pickGumball();
                gb.ejectGumball(world);

                System.out.println(gb);
                message.draw("Crank Turned");
            }else{
                coin.returnCoin(world);
                message.draw("Coin Ejected");
            }
            haveCoin = false;
        }
        
    }
    
}   