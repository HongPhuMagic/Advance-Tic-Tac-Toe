public class ComputerRandomPlayer implements Player {
  
  public boolean play(TicTacToe game){
    boolean playable;     

    if (game.numRounds() == game.numRows*game.numColumns){       //if #rounds == grid, game is over
      System.out.println("Game is finished");
      playable = false;                                          
      return playable;
    }
    else{
      playable = true;
  }

    int value;
    while(playable){
      value = Util.generator.nextInt(game.numColumns*game.numRows);  //generate random number of size grid
      if (game.play(value) != CellValue.EMPTY){
        game.play(value);
      }
    }
  }
}