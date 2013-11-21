public class tictactoe
{	
	int moves = 0;
	public Player PX = new player();
	public Player PO = new player();
	public static void main(String[] args) {
        
        tictactoe newgame = new tictactoe();
        newgame.playgame();
        
    }
	public void playgame() 
	{
        Board game = new Board();
        game.drawBoard(600,600);
        prepareBoard();
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
}
