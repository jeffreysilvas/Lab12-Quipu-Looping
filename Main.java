/********************************************
*	AUTHOR:	
* COLLABORATORS: 
*	LAST MODIFIED:	
********************************************/

/********************************************
*	Quipu
*********************************************
*	PROGRAM DESCRIPTION:
*	A user will enter a number between 0 and 999 and this program will display the number as a quipu.
*********************************************
*	ALGORITHM:
*	
*********************************************/

public class Main
{

  /***** CONSTANT SECTION *****/

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    int numHundreds, numTens, numOnes, number;

    /***** INITIALIZATION SECTION *****/
    numHundreds = numTens = numOnes = 0;
    
    
    /***** INTRO SECTION *****/
    System.out.printf("Hello! This program turns any whole number between 0 and 999 into a digital Quipu.%n%n");
    number = UtilityBelt.readInt("Please enter a number between 0 and 999: ", 0, 999);
    

    /***** INPUT SECTION *****/
    

    /***** PROCESSING SECTION *****/
    for(int i = 0; i < number; i++) {
      if(numOnes < 9) {
        numOnes++;
      } else {
        numOnes = 0;
        numTens++;
      }
      if(numTens > 9) {
        numTens = 0;
        numHundreds++;
      }
    }
    
    /***** OUTPUT SECTION *****/
    yourQuipu(numHundreds, numTens, numOnes);
    
  }
  /***** STATIC METHODS *****/

  /**
   * Returns a quipu with the specified amount of hundreds, tens, and ones
   *
   * @param hundreds The amount of beads in the hundreds place
   * @param tens The amount of beads in the tens place
   * @param ones The amount of beads in the ones place
   *
   * @author Jeffrey Silvas jeffreysilvas09@gmail.com**/
  static void yourQuipu(int hundreds, int tens, int ones) {
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