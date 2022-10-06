
/**
 * Write a description of class LanternFly here.
 *
 * @Darren Zhu
 * @9/30/22
 */
import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you kill this summer? ");
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println("Go outside bruh");
        } // end if statement
        else {
            System.out.println("https://www.youtube.com/watch?v=eBGIQ7ZuuiU");
        } // end else statement
        
    } // end main method

} // end class