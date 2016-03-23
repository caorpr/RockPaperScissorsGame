package game.controller;

import java.util.Scanner;

public class GameController 
{
	private Scanner gameInput;
	
	public GameController()
	{
		gameInput = new Scanner(System.in);
	}
	
	public void start()
	{
		game();
	}
	
	private void game()
	{
		System.out.println("Are you ready to play Rochambeau? yes/no");
		
		String input = gameInput.nextLine();
		
		// Starting the game with do you want to play? input.
		//String startInput = gameInput.nextLine();
		if (input.equals("yes"))
		{
			System.out.println("Great choice laddy!");
			startGame();
		}
		else if (input.equals("no"))
		{
			System.out.println("Why are you even here then....?");
		}
		else
		{
			System.out.println("Please retype this");
			// How do I make it go through again?
		}
	}
	
	
	
	
	private void startGame()
	{
		System.out.println(".....");
		System.out.println(".....");
		System.out.println(".....");
		System.out.println("Do you wish to play against a human? Or the computer?");
		String playAgainst = gameInput.nextLine();
		if (playAgainst.equals("human"))
		{
			System.out.println("a human huh?");
			startHumanGame();
		}
		else if (playAgainst.equals("computer"))
		{
			System.out.println("Against me?!? Good luck!");
			startComputerGame();
		}
		else
		{
			System.out.println("Please retype this");
			// How do I make it go through again?
		}
		
	}
	
	
	
	
	private void startComputerGame()
	{
		
	}
	
	
	private void startHumanGame()
	{
		System.out.println("What is the name of player one?");
		String playerOne = gameInput.nextLine();
		System.out.println("And player two?");
		String playerTwo = gameInput.nextLine();
		
		System.out.println("So, it's " + playerOne + " Versus " + playerTwo + "?");
		System.out.println("Prepare your minds now....");
		

		int gameContinue = 1;
		
		
		for(gameContinue = (1))
		{
			
		}
	}
	
	
	
}
