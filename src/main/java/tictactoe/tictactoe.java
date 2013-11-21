public class tictactoe
{	
	public static void main(String[] args) {
        
        tictactoe newgame = new tictactoe();
        newgame.playgame();
        
    }
	public void playgame() 
	{
        Board game = new Board();
        game.drawBoard(600,600);
	}
}
