import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    
    Scanner d = new Scanner(System.in);
    System.out.print("Are you a Teacher or Student? ");
    String status = d.nextLine();
    
    Scanner f = new Scanner(System.in);
    System.out.print("What is your favorite number? ");
    String favNumber = f.nextLine();
    
    if((lowerCase(status).equals("teacher"))) { 
        System.out.println(initial(firstName)+lastName+favNumber+"@schools.nyc.gov");
    } //ends if
        else{
            System.out.println(firstName+initial(lastName)+favNumber+"@nycstudents.net");
    } //ends else
    

    
    // test output
    System.out.println("Hello " + initial(firstName) + "." + initial(lastName) + ".");

    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initial(String n) {
    return n.substring(0, 1);
  } // end initialize method
  
  public static String lowerCase(String d) {
      return d.toLowerCase();
  }

} // end class
