package factory_method;

public class RunTest {
    
    public static void main( String [] args )
    {
        System.out.println( "Testing Prius Factory...") ;
        // PriusFactory pf = new PriusFactory() ;
        Creator pf = new PriusFactory() ;
        pf.buildOrder() ;
        
        System.out.println( "Testing Volvo Factory...") ;
        // VolvoFactory vf = new VolvoFactory() ;
        Creator vf = new VolvoFactory() ;
        vf.buildOrder() ;

        System.out.println( "Testing Tesla Factory...") ;
        // TeslaFactory tf = new TeslaFactory() ;
        Creator tf = new TeslaFactory() ;
        tf.buildOrder() ;
        
    }

}
