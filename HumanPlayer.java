public class HumanPlayer implements Player {

  public boolean play(TicTacToe game) {
    
    boolean playable;     

    if (game.numRounds() == game.numRows*game.numColumns){       //if #rounds == grid, game is over
      System.out.println("Game is finished");
      playable = false;                                          
      return playable;
    }
    else{
      playable = true;
    }
    
    while(playable){
      System.out.println(game);
      System.out.print(game.nextPlayer() + " to play: ");
      String answer = Util.console.readline();

      int value = Integer.parseInt(answer);                     //converts string to int

      if(value > 0 || value <= (game.numColumns*numRows)){      //if within bound, play value
        game.play(value -1);
        playable = true;
        return playable;
      }
      else if(game.valueAt(value) != CellValue.EMPTY) {
        System.out.println("This cell is not empty");
      }
      else{
        System.out.println("The value is out of bound");
      }
    }
  }
}