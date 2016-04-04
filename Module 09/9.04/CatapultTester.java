/**
 * A program to calculate distance from a catapult. 
 * 
 * @author Tony Bonadio
 * @version 1/11/16
 */
import java.util.ArrayList;
public class CatapultTester
{
    public static void main ( String [ ] Args )
        {
                //declare and initialize local variables
                double distance [ ] [ ] = new double [ 7 ] [ 6 ] , //distance traveled by the projectile
                angle [ ] = { 25 , 30 , 35 , 40 , 45 , 50 } , //angle of projection
                velocity [ ] = { 20 , 25 , 30 , 35 , 40 , 45 , 50 } ; //velocity of projection
                int counter1 = 0 , //counter used in fourth for loop for MPH value output
                objectArraylistCounter = 0 ; //counter in third for loop which set values to the distance array
                ArrayList < Catapult > projectile = new ArrayList < Catapult > ( ) ;
           for ( int i = 0 ; i < angle. length ; i ++ )
           {
               for ( int j = 0 ; j < velocity. length ; j ++ )
                {
                    projectile. add ( new Catapult ( angle [ i ] , velocity [ j ] ) ) ;
                }
            }
                Catapult dataRecord ; //creates a new dataRecord object of type ShapesV11
           for ( int index = 0 ; index < projectile. size ( ) ; index ++ )
           {
               dataRecord = projectile. get ( index ) ;
               dataRecord. calcDistance ( ) ;
            }
          for ( int i = 0 ; i < angle. length ; i ++ )
            {
                for ( int j = 0 ; j < velocity. length ; j ++ )
                {
                    dataRecord = projectile. get ( objectArraylistCounter ) ;
                    distance [ j ] [ i ] = dataRecord. calcDistance ( ) ;
                    objectArraylistCounter ++;
                }
            }
            //print output
        System.out.println ( " Projectile Distance (feet)" ) ;
        System.out.println ( " MPH 25 deg 30 deg 35 deg 40 deg 45 deg 50 deg" ) ;
        System.out.print ( "=================================================================================" ) ;
        for ( int j = 0 ; j < velocity. length ; j ++ )
            {
                System . out . print ( " \n " + ( int ) velocity [ j ] ) ;
                for ( int k = 0 ; k < angle. length ; k ++ )
                    {
                         System . out . printf ( "%12.2f" , distance [ j ] [ k ] ) ;
                    }
            }
    }
}