public class ComputerInOrderPlayer implements Player {

  public boolean play(TicTacToe gmae){

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
      for (int i = 0; i <= (game.numColumns*game.numRows); i++){     //makes sure the bot plays in cell order
        if (game.play(i) == CellValue.EMPTY){
          game.play(i);
          playable = true;
        }
      }
    }
  }
}