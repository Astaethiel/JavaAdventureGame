package uoa.assignment1.game;

import java.util.Scanner;

import uoa.assignment1.character.GameCharacter;
import uoa.assignment1.character.Player;
import uoa.assignment1.character.Monster;

public class GameLogic {
		
	public static void moveCharacter(String input, Map gameMap, GameCharacter character) {
		switch(input) {
			case "up":
			  moveUp();
			  break;
			case "down":
			  moveDown();
			  break;
			case "left":
			  moveLeft();
			  break;
			case "right":			  
			  moveRight();
			  break;
			default:
				System.out.println("Use only keywords up, down, left, right");
		  }

	}

	private static moveRight(GameCharacter character, Map gameMap){
		try {
			gameMap.layout[character.row][character.column+1] = gameMap.layout[character.row][character.column];
			character.column++;
			gameMap.layout[character.row][character.column-1] = ".";
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("You can't go right. You lose a move.");
		}
	}
	
	private static moveLeft(GameCharacter character, Map gameMap){
		try {
			gameMap.layout[character.row][character.column-1] = gameMap.layout[character.row][character.column];
			character.column--;
			gameMap.layout[character.row][character.column+1] = ".";
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("You can't go left. You lose a move.");
		}
	}
	private static moveDown(GameCharacter character, Map gameMap){
		try {
			gameMap.layout[character.row+1][character.column] = gameMap.layout[character.row][character.column];
			character.column++;
			gameMap.layout[character.row-1][character.column] = ".";
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("You can't go down. You lose a move.");
		}
	}
	private static moveUp(GameCharacter character, Map gameMap){
		try {
			gameMap.layout[character.row-1][character.column] = gameMap.layout[character.row][character.column];
			character.column--;
			gameMap.layout[character.row+1][character.column-1] = ".";
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("You can't go up. You lose a move.");
		}
	}
	
	
}
