import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class tictactoetest
{
    @Test
    public void boardsize()
    {
        Board testsize = new Board();
        assertEquals(testsize.drawBoard(600,600),true);
    }
}
