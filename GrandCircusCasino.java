import java.util.Scanner;

public class GrandCircusCasino {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		int numberOfSides = 0;
		String rollDice = "yes";

		System.out.println(
				"Welcome to the Grand Circus Casino! \nWould you like to roll the dice? Enter \"yes\" or \"no\".");

		rollDice = scan1.nextLine();

		System.out.println("How many sides are there on your dice?");

		numberOfSides = scan1.nextInt();
		scan1.nextLine();
		
		while (rollDice.equalsIgnoreCase("yes")) {
			
			if (rollDice.equalsIgnoreCase("yes")) {
				
				int random1 = randomDiceRoll(numberOfSides);
				int random2 = randomDiceRoll(numberOfSides);

				if ((random1 == random2) && (random1 == 1)) {

					System.out.println("You rolled " + random1 + " and " + random2 + ".");
					System.out.println("You rolled \"Snake Eyes\".");
					System.out.println();
				}

				else if ((random1 == random2) && (random1 == 6)) {
					
					System.out.println("You rolled " + random1 + " and " + random2 + ".");
					System.out.println("You rolled \"Box Cars\".");
					System.out.println();
				}

				else {
				System.out.println("You rolled " + random1 + " and " + random2 + ".");
				System.out.println("");
				}
			}

			System.out.println("Would you like to roll again?");

			rollDice = scan1.nextLine();

		}
		System.out.println("Goodbye!");

		scan1.close();
	}

	public static int randomDiceRoll(int numberOfSides) {
		
		int random = (int) (Math.random() * numberOfSides + 1);
		return random;
	}

}
