/********************************************
*	AUTHOR:	Jeffrey Silvas
* COLLABORATORS: N/A
*	LAST MODIFIED: 7/8/2026
********************************************/

/********************************************
*	Quipu
*********************************************
*	PROGRAM DESCRIPTION:
*	A user will enter a number between 0 and 999 and this program will display the number as a quipu.
*********************************************
*	ALGORITHM:
 * by default, adds one to the ones place. If the value in the ones place exceeds a single digit, resets it to 0 and
 * add one to the tens place. If the value in the tens place exceeds a single digit, resets it and add one to the
 * hundreds place. (The maximum input is clamped at 999 so that the hundreds place never exceeds one digit.)
*	
*********************************************/

public class Main
{
  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    int number;
    char redo;
    
    /***** INTRO SECTION *****/
    System.out.printf("Hello! This program turns any whole number between 0 and 999 into a digital Quipu.%n%n");

    /***** INPUT SECTION *****/
    number = UtilityBelt.readInt("Please enter a number between 0 and 999: ", 0, 999);
    
    /***** OUTPUT SECTION *****/
    do {
      yourQuipu(number);
      redo = UtilityBelt.readChar("Would you like to make another quipu? [Y/N]: ", "YN");
    } while (redo == 'Y');
    System.out.printf("%nGoodbye!");
    
  }

  /***** STATIC METHODS *****/

  /**
   * Returns a quipu with the specified amount of hundreds, tens, and ones
   *
   * @param number The number to be written out on the quipu
   *
   * @author Jeffrey Silvas jeffreysilvas09@gmail.com**/
  static void yourQuipu(int number) {
    int hundreds, tens, ones;
    hundreds = tens = ones = 0;

    //Separates number into ones, tens, and hundreds places
    for(int i = 0; i < number; i++) {
      if(ones < 9) {
        ones++;
      } else {
        ones = 0;
        tens++;
      }
      if(tens > 9) {
        tens = 0;
        hundreds++;
      }
    }

    System.out.printf("%-11s= %d%n", "Hundreds", hundreds);
    System.out.printf("%-11s= %d%n", "Tens", tens);
    System.out.printf("%-11s= %d%n%n", "Ones", ones);

    //Prints quipu to console
    System.out.println("Your quipu:");
    UtilityBelt.printCentered(30, "___");
    UtilityBelt.printCentered(30, "|");
    for(int i = 0; i < hundreds; i++) {
      UtilityBelt.printCentered(30, "*");
    }
    UtilityBelt.printCentered(30, "|");
    for(int i = 0; i < tens; i++) {
      UtilityBelt.printCentered(30, "*");
    }
    UtilityBelt.printCentered(30, "|");
    for(int i = 0; i < ones; i++) {
      UtilityBelt.printCentered(30, "*");
    }
    UtilityBelt.printCentered(30, "|");
    UtilityBelt.printCentered(30, "‾");
  }
}