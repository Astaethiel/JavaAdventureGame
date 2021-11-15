package uoa.assignment1.character;

import java.util.Random;

public class Player extends GameCharacter{

	public Player(String name) {
		super(name);
	}

	
	public
	void hurtCharacter(GameCharacter character) {
		if (character.successfulDefense() == false) {
			character.setHealth(character.getHealth()-50);
			System.out.println("!!HIT!! Player successfully attacked Monster");
		} else{
			System.out.println("!!MISS!! Monster1 successfully defended attack from Player");
		}
	}

	
	public
	boolean successfulDefense() {
		Random rand = new Random();
		 if (rand.nextInt(9) <= 2 ) {
			 return true;
		 } 
		 return false;
   }

}
