import java.util.Scanner;

public class GuessingGameMethod3
{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Let's play a guesssing game!");
		do
		{
			playARound(1, getRandomNumber(7,12));			//13
		}while (askForAnotherRound("Try again?"));
		System.out.println("\nThank you for playing!");
	}

	public static void playARound(int min, int max)
	{
		boolean validInput;
		int number, guess;
		String answer;

		//Pick a random number
		number = getRandomNumber(min, max);					//25

		//Get the guess
		System.out.println("\nI'm thinking of a number "
			+"between " + min + " and " + max + ".");		//29
		System.out.println("What do you think it is?");

		guess = getGuess(min, max);							//31

		//Check the guess
		if (guess == number)
			System.out.println("You're right!");
		else
			System.out.println("You're wrong!" + " The number was " + number);

	}

	public static int getRandomNumber(int min, int max)			//41
	{
		return (int)(Math.random() * (max - min + 1)) + min;	//43
	}

	public static int getGuess(int min, int max) 				//47
	{
		while(true)
		{
			int guess = sc.nextInt();
			if( (guess < min) || (guess > max) )				//52
			{
				System.out.println("I said, between "
					+ min + " and " + max
					+ ". Try again: ");
			}
			else

				return guess;									//59
		}
	}


	public static boolean askForAnotherRound(String prompt)		//63
	{
		while(true)
		{
			String answer;
			System.out.println("\n" + prompt + " (Y or N) ");
			answer = sc.next();
			if (answer.equalsIgnoreCase("Y"))
					return true;
			else if (answer.equalsIgnoreCase("N"))
					return false;
		}

	}



}//end of class



















