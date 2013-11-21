import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class tictactoetest
{
    @Test
    public void boardsize()
    {
        Board testsize = new Board();

        assertEquals(testsize.drawBoard(600,600), game.drawBoard());
    }
}
