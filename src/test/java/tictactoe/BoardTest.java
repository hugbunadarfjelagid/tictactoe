import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest
{
    @Test
    public void EmptyBoard() throws Exception
    {
    	Board btest = new Board();
    	int counter = 0;
    	for (int i = 0; i < 9; i++)
    	{
    		btest[i].getSpace;
    		counter += i;
    	}
        assertEquals(counter,0);
    }
}
