public class tictactoe
{	
	public Field[] Board = new Field[9];
	int moves = 0;
	public Players P1 = new Players();
	public Players P2 = new Players();
	public static void main(String[] args) {
        
        tictactoe newgame = new tictactoe();
        newgame.playgame();
        
    }
	public void playgame() 
	{
        Board game = new Board();
        game.drawBoard(600,600);
        prepareBoard();
        preparePlayers();
        XY play = new XY();
        play.markGrid(XY);
	}
	
	public void prepareBoard() {
		int turns = 0;
		moves = 0;
		
		while(turns < 9)
		{
			Board[turns] = new Field();
			turns++;
		}
	}
	public void preparePlayers()
	{
		P1.setName("Player 1");
		P2.setName("Player 2");
		P1.isTurn = true;
		P2.isTurn = false;
        	P1.won = false;
        	P2.won = false;
	}
	
	
	
}
