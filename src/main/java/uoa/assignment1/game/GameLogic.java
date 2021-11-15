package uoa.assignment1.game;

import java.util.Scanner;

import uoa.assignment1.character.GameCharacter;
import uoa.assignment1.character.Player;
import uoa.assignment1.character.Monster;

public class GameLogic {
		
	public static void moveCharacter(String input, Map gameMap, GameCharacter character) {
		switch(input) {
			case "up":
			  	moveUp(character, gameMap);
			case "down":
				moveDown(character, gameMap);
			case "left":
				moveLeft(character, gameMap);
			case "right":			  
				moveRight(character, gameMap);
			default:
				System.out.println("Use only keywords up, down, left, right");
				
		  }

	}

	private static void moveRight(GameCharacter character, Map gameMap){
		try {
			if(gameMap.layout[character.row][character.column+1]=="%"){
				if (character.sayName()=="Player"){
					for (int i = 1; i < gameMap.characters.length; i++) {
						if (gameMap.characters[i].row == character.row && gameMap.characters[i].column == character.column+1) {
							Monster mon = (Monster) gameMap.characters[i];
							character.hurtCharacter(mon);
						}
					}
				}else{
					System.out.println("Monster already there so can't move");
				}
			} else if(gameMap.layout[character.row][character.column+1]=="*"){
					character.hurtCharacter(gameMap.characters[0]);

			} else {
			gameMap.layout[character.row][character.column+1] = gameMap.layout[character.row][character.column];
			character.column++;
			gameMap.layout[character.row][character.column-1] = ".";
			}
			
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("You can't go right. You lose a move.");
			
		}
	}
	
	private static void moveLeft(GameCharacter character, Map gameMap){
		try {
			if (character.sayName()=="Player"){
				for (int i = 1; i < gameMap.characters.length; i++) {
					if (gameMap.characters[i].row == character.row && gameMap.characters[i].column == character.column-1) {
						gameMap.characters[i].hurtCharacter(character);
					}
					
				} 
				
			}else {
			gameMap.layout[character.row][character.column-1] = gameMap.layout[character.row][character.column];
			character.column--;
			gameMap.layout[character.row][character.column+1] = ".";
			}
			
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("You can't go left. You lose a move.");
			
		}
	}
	private static void moveDown(GameCharacter character, Map gameMap){
		try {
			if (character.sayName()=="Player"){
				for (int i = 1; i < gameMap.characters.length; i++) {
					if (gameMap.characters[i].row == character.row-1 && gameMap.characters[i].column == character.column) {
						gameMap.characters[i].hurtCharacter(character);
					}
					
				}
				
			} else {
			gameMap.layout[character.row+1][character.column] = gameMap.layout[character.row][character.column];
			character.row++;
			gameMap.layout[character.row-1][character.column] = ".";
			}
			
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("You can't go down. You lose a move.");
			
		}
	}
	private static void moveUp(GameCharacter character, Map gameMap){
		try {
			if (character.sayName()=="Player"){
				for (int i = 1; i < gameMap.characters.length; i++) {
					if (gameMap.characters[i].row == character.row+1 && gameMap.characters[i].column == character.column) {
						gameMap.characters[i].hurtCharacter(character);
					}
					
				}
				
			} else {
			gameMap.layout[character.row-1][character.column] = gameMap.layout[character.row][character.column];
			character.row--;
			gameMap.layout[character.row+1][character.column] = ".";
			}
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("You can't go up. You lose a move.");
			
		}
	}
}
