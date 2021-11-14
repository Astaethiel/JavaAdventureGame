package uoa.assignment1.game;

import uoa.assignment1.character.GameCharacter;
import uoa.assignment1.character.Monster;
import uoa.assignment1.character.Player;

public class Map {

public String[][] layout;
public GameCharacter characters [] = new GameCharacter[4];
 
  Map (int height, int width) {
    layout = new String[height][width];
    Player player = new Player("Player");
    Monster mon1 = new Monster("Mon1");
    Monster mon2 = new Monster("Mon2");
    Monster mon3 = new Monster("Mon3");

    characters[0] = player;
    characters[1] = mon1;
    characters[2] = mon2;
    characters[3] = mon3;
    characters[0].column = layout[layout.length-1].length-1;
    characters[0].row = layout.length-1;
    characters[1].column = layout[layout.length-1].length-1;
    characters[1].row = 0;
    characters[2].column = 0;
    characters[2].row = layout.length-1;
    characters[3].column = 0;
    characters[3].row = 0;

    initialiseArray();
  }

  private void initialiseArray() {
    for (int y=0; y < this.layout.length; y++) {
      for (int x=0; x < this.layout[y].length; x++) {
        layout[y][x] = ".";
      }
    }
    layout[characters[0].row][characters[0].column] = "*";
    layout[characters[1].row][characters[1].column] = "%";
    layout[characters[2].row][characters[2].column] = "%";
    layout[characters[3].row][characters[3].column] = "%";
  }
 
  public void printLayout() {
    
   for (int y=0; y < this.layout.length; y++) {
      for (int x=0; x < this.layout[y].length; x++) {
        System.out.printf("%s", this.layout[y][x]);  
      }
      System.out.print('\n');
    }  
  }
}