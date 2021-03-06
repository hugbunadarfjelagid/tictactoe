package tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TictactoeTest
{
    @Test
    public void NrOfSpacesTest()
    {
    	Space[] stest = new Space[9];
	int space = 0;
	while(space < 9)
	{
		stest[space] = new Space();
		space++;
	}
        assertEquals(space,9);
    }
/* to be implemented
    
    @Test
    public static void mainTest(String[] args)
    {
        Tictactoe newgame = new Tictactoe(); // Create instance of Tic-Tac-Toe
        newgame.playgame(); // Initialize game
    }

    @Test
    public void playgameTest() 
    {
        Board play = new Board(); // Create instance of a gameboard
        play.drawBoard(600,600); // Draw gameboard 600x600 pixels
        prepareBoard(); // Prepare gameboard
        preparePlayers(); // Prepare players
        while (!userX.won && !userO.won && !tie )
        {
            if (StdDraw.mousePressed())
            {
                x = StdDraw.mouseX();
                y = StdDraw.mouseY();
                play.makeMoveMouse(x,y,userX,Board);
                play.markSpace(Board);
                switchPl(userX,userO);
                checkWin(userX,userO,Board);
            }
        }
        if(userX.won)
        {
            System.out.println(userX.getName() + " won");
        }
        else if(userO.won)
        {
            System.out.println(userO.getName() + " won");
        }
        else if(tie)
        {
            System.out.println("Draw");
        }
 //       System.exit(0);
    }
    
    @Test
    public void prepareBoardTest()
    {
        int space = 0; // Initialize counter for spaces
        // Create placeholder for each space on the gameboard
        while(space < 9)
        {
            Board[space] = new Space();
            space++;
        }
    }
    
    @Test
    public void preparePlayersTest()
    {
        // Set the players names
        userX.setName("Player X");
        userO.setName("Player O");
        // It's players X turn
        userX.isTurn = true;
        userO.isTurn = false;
        // Neither has won. The game hasn't started
        userX.won = false;
        userO.won = false;
    }
    
    // Check if either player has won
    @Test
    public void checkWinTest(User X, User O, Space[] board)
    {
        // Has player X won?
        if (board[0].getSpace()==1 && board[4].getSpace()==1 && board[8].getSpace()==1)
            X.won = true;
        if (board[2].getSpace()==1 && board[4].getSpace()==1 && board[6].getSpace()==1)
            X.won = true;
        if (board[0].getSpace()==1 && board[3].getSpace()==1 && board[6].getSpace()==1)
            X.won = true;
        if (board[1].getSpace()==1 && board[4].getSpace()==1 && board[7].getSpace()==1)
            X.won = true;
        if (board[2].getSpace()==1 && board[5].getSpace()==1 && board[8].getSpace()==1)
            X.won = true;
        if (board[0].getSpace()==1 && board[1].getSpace()==1 && board[2].getSpace()==1)
            X.won = true;
        if (board[3].getSpace()==1 && board[4].getSpace()==1 && board[5].getSpace()==1)
            X.won = true;
        if (board[6].getSpace()==1 && board[7].getSpace()==1 && board[8].getSpace()==1)
            X.won = true;
        // Has player O won?
        if (board[0].getSpace()==2 && board[4].getSpace()==2 && board[8].getSpace()==2)
            O.won = true;
        if (board[2].getSpace()==2 && board[4].getSpace()==2 && board[6].getSpace()==2)
            O.won = true;
        if (board[0].getSpace()==2 && board[3].getSpace()==2 && board[6].getSpace()==2)
            O.won = true;
        if (board[1].getSpace()==2 && board[4].getSpace()==2 && board[7].getSpace()==2)
            O.won = true;
        if (board[2].getSpace()==2 && board[5].getSpace()==2 && board[8].getSpace()==2)
            O.won = true;
        if (board[0].getSpace()==2 && board[1].getSpace()==2 && board[2].getSpace()==2)
            O.won = true;
        if (board[3].getSpace()==2 && board[4].getSpace()==2 && board[5].getSpace()==2)
            O.won = true;
        if (board[6].getSpace()==2 && board[7].getSpace()==2 && board[8].getSpace()==2)
            O.won = true;
        // Is it a draw?
        if (board[0].getSpace()!=0 && board[1].getSpace()!=0 && board[2].getSpace()!=0
            && board[3].getSpace()!=0 && board[4].getSpace()!=0 && board[5].getSpace()!=0
            && board[6].getSpace()!=0 && board[7].getSpace()!=0 && board[8].getSpace()!=0)
            tie = true;
    }
    
    // Change players turn
    @Test
    public void switchPlTest(User X, User O)
    {
        X.changeTurn();
        O.changeTurn();
    }
*/
}
