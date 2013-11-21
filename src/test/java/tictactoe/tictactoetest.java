import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class tictactoetest
{
    @Test
    public void boardsize()
    {
        Board testsize = new Board();

        assertTrue(testsize.drawBoard(600,600) == game.drawBoard());
    }
}
