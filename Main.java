import java.util.Scanner;

/**
 *program will type out in words users number form 1 to 10
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner
    Scanner input = new Scanner(System.in);

    //asks user to input number
    System.out.println("Please enter a positive integer:");
    int userNumber = input.nextInt();

    //creates switch case system
    switch (userNumber){
      case 1:
        System.out.println("one");
        break;
      case 2:
        System.out.println("two");
        break;
      case 3: 
        System.out.println("three");
        break;
      case 4:
        System.out.println("four");
        break;
      case 5:
        System.out.println("five");
        break;
      case 6:
        System.out.println("six");
        break;
      case 7:
        System.out.println("seven");
        break;
      case 8:
        System.out.println("eight");
        break;
      case 9:
        System.out.println("nine");
        break;
      case 10:
        System.out.println("ten");
        break;
      default: 
        System.out.println("not in the range");
    }
  }
}

