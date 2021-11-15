package uoa.assignment1.game;

import uoa.assignment1.character.Monster;

public class Game {
public Map map;

    Game (int height, int width) {
        map = new Map(height, width);
        map.printLayout();
    }
    			
    public Map getMap() {
        return map;
    }
    
    public boolean nextRound (String input) {
        GameLogic.moveCharacter(input, map, map.characters[0]);
        System.out.printf("Player is moving %s%n", input);
        for (int i=1; i < map.characters.length; i++) {
            Monster mon = (Monster) map.characters[i];
            String move = mon.decideMove();
            GameLogic.moveCharacter(move, map, map.characters[i]);
            System.out.println(map.characters[i].sayName() + " is moving " + move); 
            }
        System.out.printf("%n");
        for (int i=0; i < map.characters.length; i++) {
            System.out.println("Health " + map.characters[i].sayName() + ": " + map.characters[i].getHealth()); 
        }
        System.out.printf("%n");
        map.printLayout();

        return true;

    }
   
}