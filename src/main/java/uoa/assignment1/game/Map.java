package uoa.assignment1.game;

import uoa.assignment1.character.GameCharacter;
import uoa.assignment1.character.Monster;
import uoa.assignment1.character.Player;

public class Map {

public String [][] layout;
public GameCharacter characters [] = new GameCharacter[4];
 
  Map (int height, int width) {
    this.layout = new String[height][width];
    printLayout();
  }

  private void initialiseArray() {
    Arrays.fill(this.layout, '.');
  }
 
  public void printLayout() {
    for (int y=0; y <= this.layout.length; y++) {
      for (int x=0; x <= this.layout[y].length; x++) {
        System.out.printf(this.layout[y][x]);  
      }
    }
   }
}
