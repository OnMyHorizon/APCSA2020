package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
	}

	public void setPlayers(String player)
	{
	}

	public String runGame()
	{
		Scanner keyboard = new Scanner(System.in);
		char response = 'y';
		Random rand = new Random();
		//add in a do while loop after you get the basics up and running
		while (response != 'n') {
			String player, comp = "";
			int computer = rand.nextInt(3);
			System.out.print("\nRock-Paper-Scissors - Pick your weapon[R,P,S] :: ");
			player = keyboard.next();
			System.out.println("player had " + player);
			if (computer == 0) {
				comp = "R";
			}
			if (computer == 1) {
				comp = "P";
			}
			if (computer == 2) {
				comp = "S";
			}
			System.out.println("computer had had " + comp);
			if (comp.equals(player)) {
				System.out.println("!Draw Game!");
			}
			if (player.equals("R")) {
				if (comp.equals("P")) {
					System.out.println("!Computer wins <<Paper Covers Rock>>!");
				}
				else if (comp.equals("S")) {
					System.out.println("!Player wins <<Rock Breaks Scissors>>!");
				}
			}
			if (player.equals("P")) {
				if (comp.equals("R")) {
					System.out.println("!Player wins <<Paper Covers Rock>>!");
				}
				else if (comp.equals("S")) {
					System.out.println("!Computer wins <<Scissors Cuts Paper>>!");
				}
			}
			if (player.equals("S")) {
				if (comp.equals("R")) {
					System.out.println("!Computer wins <<Rock Breaks Scissors>>!");
				}
				else if (comp.equals("P")) {
					System.out.println("!Player wins <<Scissors Cuts Paper>>!");
				}
			}
			System.out.print("\nDo you want to play again? ");
			response = keyboard.next().charAt(0);
		}
		return "";
	}

	public String toString()
	{
		String output="";
		return output;
	}
}