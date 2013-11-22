import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest
{
    @Test
    public void EmptyBoard() throws Exception
    {
    	Board btest = new Board();
    	Space[] assign;
    	int counter = 0;
    	for (int i = 0; i < 9; i++)
    	{
    		assign[i].getSpace();
    		counter += i;
    	}
        assertEquals(counter,0);
    }
}
