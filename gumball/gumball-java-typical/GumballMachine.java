
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private int total;
    private int model;
    
    public GumballMachine( int size , int model)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.model = model;
        this.total = 0;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 && this.model == 1 )
        {
            this.has_quarter = true ;
        }
        else if ( coin == 25 && this.model == 2)
        {
            this.total += coin;
            if(this.total == 50) this.has_quarter = true;
        }
        else if( (coin == 25 || coin == 10 || coin == 5) && this.model == 3)
        {
            this.total += coin;
            if(this.total == 50) this.has_quarter = true;
        }
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
}
