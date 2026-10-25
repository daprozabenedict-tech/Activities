
package Week_1;

public class ADVANCED_UnitCastingConverter {
    public static void main(String[] args) {
        
        
         System.out.println("=================================================");
         
        //EXPLICIT CASTING
        
        double centimeters = 367.0;
        int meters = (int)(centimeters / 100);
        double remainingCentimeters = (int) centimeters % 100;
        
        System.out.println("Centimeters: " + centimeters);
        System.out.println("Meters: " + meters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);
        
         System.out.println("=================================================");
         
        //IMPLICIT WIDENING
        
        int INT = 32;
        double DOUBLE = INT;
        
        /*
         * There is no need to cast since int is a whole number.
         * Therefore there is no data to lose
         */
        
        System.out.println("Int: " + INT);
        System.out.println("Double: "+ DOUBLE);
        
        
        System.out.println("=================================================");
          
        //EXPLICIT NARROWING
        
        double Double = 64.5;
        int Int = (int) Double;
        
        /*
         * The decimal part is lost because double is being
         * converted into an int, which only stores whole numbers.
         */
        
        System.out.println("Double: " + Double);
        System.out.println("Int: "+ Int);
        
        
        System.out.println("=================================================");
        
        
        
        
        
        
        
    }
}
