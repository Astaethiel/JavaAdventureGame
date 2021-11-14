package uoa.assignment1.character;

import java.util.Random;

public class Monster extends GameCharacter {

	public  Monster(String name) {
		super(name);
	}


	public void hurtCharacter(GameCharacter character) {
		if (character.successfulDefense() == false) {
			character.setHealth(character.getHealth()-20); 
		}
	}

	
	public boolean successfulDefense() {
		 Random rand = new Random();
		  if (rand.nextInt(2) == 1) {
			  return true;
		  } 
		  return false;
		  
	}


	
	public String decideMove () {
		Random rand = new Random();
		String[] moves = {"up","down","left","right"};
		return moves[rand.nextInt(3)];
	}

}
