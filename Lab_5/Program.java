import java.util.Scanner;

/*
 * Student Name: Brayden Hermann
 * Lab Professor: Fedor Ilitchev
 * Due Date: 4/7/2023
 * Modified Date: 4/9/2023
 * Description: Lab 4 main program
 */
public class Program {

	/*
	 * Add programmer comments here.
	 */
		public static void main(String[] args) {
		// Each character corresponds to the first letter of the menu option
		// For example, 'E' corresponds to (E)nter, but you must accept
		// lower case characters as well - 'e', 'd', 'r', and 'q'
		final char ENTER_VALUES = 'E';
		final char DISPLAY_REPORT = 'D';
		final char RESET_VALUES = 'R';
		final char QUIT_PROGRAM = 'Q';
		char option = 'E';
		DiceChecker diceChecker = new DiceChecker();
		
		// while the user does not want to quit the program
		while(option != QUIT_PROGRAM) {
			
			// output menu options
			System.out.print("\n(E)nter Dice Roll Values"
					+ "\n(D)isplay Report"
					+ "\n(R)eset Dice Roll Data"
					+ "\n(Q)uit Program");
			
			// get user option and set it to upper case
			option = Character.toUpperCase(User.inputCharacter("\n\nSelect option: "));
			
			// action based on the user's option
			switch(option) {
				// enter dice roll values
				case ENTER_VALUES: diceChecker.enterData();
					break;
			
				// display report
				case DISPLAY_REPORT: diceChecker.printReport();
					break;
				
				// reset dice roll data
				case RESET_VALUES: diceChecker.resetData();
					break;
					
				// quit program
				case QUIT_PROGRAM:
					break;
					
				// invalid menu option
				default:
					System.out.println("Invalid menu option");
			}
		}
		
		System.out.println("\nProgram by Brayden Hermann"
				+ "\nThank you for using my Dice Checker software");
	}

}
