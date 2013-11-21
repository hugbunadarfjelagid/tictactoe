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
        game.markGrid(Board);
                    while ((!P1.won && !P2.won ) && (moves < 9)){
                if (StdDraw.mousePressed() || testing) {
                    if (!testing){
                    x = StdDraw.mouseX();
                    y = StdDraw.mouseY();}
                    else {
                        x = StdRandom.uniform(0.2, 0.8);
                        y = StdRandom.uniform(0.2, 0.8);
                    }
                    game.makeMoveMouse(x,y,P1,Board);
                    switchPl(P1,P2);
                    game.DrawToBoard(Board);
                    checkWin(P1,P2,Board);
                    moves++;

                }
            }
            if(P1.won){System.out.println("Player X won");}
            else if(P2.won){System.out.println("Player O won");}
            else{System.out.println("Draw");}
                System.exit(0);
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
	
	    public void checkWin(Players P1, Players P2, Field[] board) {
        if (board[0].getSlot()==1 && board[4].getSlot()==1 && board[8].getSlot()==1)
            P1.won = true;
        if (board[2].getSlot()==1 && board[4].getSlot()==1 && board[6].getSlot()==1)
            P1.won = true;
        if (board[0].getSlot()==1 && board[3].getSlot()==1 && board[6].getSlot()==1)
            P1.won = true;
        if (board[1].getSlot()==1 && board[4].getSlot()==1 && board[7].getSlot()==1)
            P1.won = true;
        if (board[2].getSlot()==1 && board[5].getSlot()==1 && board[8].getSlot()==1)
            P1.won = true;
        if (board[0].getSlot()==1 && board[1].getSlot()==1 && board[2].getSlot()==1)
            P1.won = true;
        if (board[3].getSlot()==1 && board[4].getSlot()==1 && board[5].getSlot()==1)
            P1.won = true;
        if (board[6].getSlot()==1 && board[7].getSlot()==1 && board[8].getSlot()==1)
            P1.won = true;
        if (board[0].getSlot()==2 && board[4].getSlot()==2 && board[8].getSlot()==2)
            P2.won = true;
        if (board[2].getSlot()==2 && board[4].getSlot()==2 && board[6].getSlot()==2)
            P2.won = true;
        if (board[0].getSlot()==2 && board[3].getSlot()==2 && board[6].getSlot()==2)
            P2.won = true;
        if (board[1].getSlot()==2 && board[4].getSlot()==2 && board[7].getSlot()==2)
            P2.won = true;
        if (board[2].getSlot()==2 && board[5].getSlot()==2 && board[8].getSlot()==2)
            P2.won = true;
        if (board[0].getSlot()==2 && board[1].getSlot()==2 && board[2].getSlot()==2)
            P2.won = true;
        if (board[3].getSlot()==2 && board[4].getSlot()==2 && board[5].getSlot()==2)
            P2.won = true;
        if (board[6].getSlot()==2 && board[7].getSlot()==2 && board[8].getSlot()==2)
            P2.won = true;
    }
	
	   public void switchPl(Players P1, Players P2) {
        P1.changeTurn();
        P2.changeTurn();
    }
	
}
