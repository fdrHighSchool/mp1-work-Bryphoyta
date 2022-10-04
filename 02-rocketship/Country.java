
/**
 * Making a Rocket Ship with United States on it.
 *
 * @Darren Zhu
 */
public class Country{
    public static void main(String[]args){
        rocket();
    } // end main method
    
    public static void lines(){
        System.out.println("|      |");
    } // end lines method
    
    public static void bottom(){
        System.out.println("+------+");
    } // ends bottom method
        
    public static void triangle(){
        System.out.println("   /\\   ");
        System.out.println("  /  \\  ");
        System.out.println(" /    \\ "); 
    } // ends triangle method
     
    public static void box(){
        bottom();
        lines();
        lines();
        lines();
        bottom();
    } // ends box method
    
    public static void united(){
        System.out.println("|United|");
        System.out.println("|States|");
    } // ends united method
    
    public static void rocket(){
        triangle();
        box();
        united();
        box();
        triangle();
    } // ends rocket method
} // ends code/class
