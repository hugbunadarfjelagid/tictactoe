public class tictactoe
{	
	public Field[] Board = new Field[9];
	int moves = 0;
	//public Player P1 = new player();
	//public Player P2 = new player();
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
