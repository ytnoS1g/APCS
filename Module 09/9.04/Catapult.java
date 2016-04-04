/**
 * A program to calculate distance from a catapult. 
 * 
 * @author Tony Bonadio
 * @version 1/11/16
 */
public class Catapult
    {
        //declare private instance variables
        private double gravity = 9.79 , //gravity affecting the projectile
        degreeMeasure, //degree measurement at which the projectile is fired
        velocity, //velocity at which the projectile is fired (meters per second)
        distance ; //distance which the projectile travels (in feet)
        //constructor for ojbects of type Catapult
        Catapult ( double degMeasure, double velocityValue )
            {
                degreeMeasure = degMeasure ;
                velocity = velocityValue / 2.23694 ;
            }
/**
* Mutator method which calculates the distance of a projectile fired by the catapult object (no parameter).
* @return distance--returns double value for distance of the projectile's travel.
*/
        public double calcDistance ( )
            {
                return distance = ( ( Math . pow ( ( velocity ) , 2 ) * Math . sin ( 2 * ( Math . toRadians ( degreeMeasure ) ) ) / gravity ) ) * 3.28084 ;
            }
}