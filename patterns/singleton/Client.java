package singleton;

public class Client {
 
	private Singleton theSingleton;
	 
	public void runTest() {

	    // error - can not instantiate directly
        // theSingleton = new Singleton() ;

        // access the singleton instance
        theSingleton = Singleton.getInstance() ;
        System.out.println( theSingleton ) ;

        // access the singleton instance 2nd time
        theSingleton = Singleton.getInstance() ;
        System.out.println( theSingleton ) ;

	}

   public static void main( String [] args )
    {
        Client c = new Client() ;
        c.runTest() ;
    }         
    	 
}
 
