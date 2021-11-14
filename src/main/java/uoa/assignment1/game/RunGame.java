package uoa.assignment1.game;
import java.util.Scanner;  // Import the Scanner class


public class RunGame {

	private static boolean gameOver = false;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);  // Create a Scanner object
		Game game = new Game(3,3); //args[]);
		String input = "";  // Read user inp
		Integer round = 0;

        while (!gameOver) {
			System.out.printf("Round %d%n", round);
			round++;
			input = scan.nextLine();	
		//complete the code
		}
	}

}
