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
		System.out.println("Are you ready to play Rochambeau? y/n");
		
		String input = gameInput.nextLine();
		
		// Starting the game with do you want to play? input.
		//String startInput = gameInput.nextLine();
		if (input.equals("y"))
		{
			System.out.println("Great choice laddy!");
			startGame();
		}
		else if (input.equals("n"))
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
		System.out.println("Do you wish to play against a human? Or the computer? (h/c)");
		String playAgainst = gameInput.nextLine();
		if (playAgainst.equals("h"))
		{
			System.out.println("a human huh?");
			startHumanGame();
		}
		else if (playAgainst.equals("c"))
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
		
	}
	
	
	
}
