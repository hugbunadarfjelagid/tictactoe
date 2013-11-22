import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TictactoeTest
{
    @Test
    public void EmptyBoard() throws Exception
    {
    	Space[] stest = new Space[9];
    	int counter = 0;
    	for (int i = 0; i < 9; i++)
    	{
    		stest[i].getSpace();
    		counter += i;
    	}
        assertEquals(counter,0);
    }
}
