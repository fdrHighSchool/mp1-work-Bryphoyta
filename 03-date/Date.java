
/**
 * Write a description of class Date here.
 *
 * @ Darren Zhu
 * @ 09/28/2022
 */

import java.util.Scanner;

public class Date{
    public static void main(String[] args){
    Scanner d = new Scanner(System.in);
    System.out.println("Pick a day of the week: ");
    String day = d.nextLine();
    
    Scanner m = new Scanner(System.in);
    System.out.println("Pick a month: ");
    String month = m.nextLine();
    
    Scanner y = new Scanner(System.in);
    System.out.println("Pick a year: ");
    String year = y.nextLine();
    
    Scanner n = new Scanner(System.in);
    System.out.println("Pick a date: ");
    String date = n.nextLine();
    
    System.out.println("American Format:");
    System.out.println(day+", "+month+" "+date+", "+year);
    System.out.println("European format:");
    System.out.println(day+" "+date+" "+month+" "+year);
    }
    
}
