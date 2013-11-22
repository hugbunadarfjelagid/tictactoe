import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TictactoeTest
{
    @Test
    public void LabelSpaces() throws Exception
    {
    	Space[] stest = new Space[9];
    	Board btest = new Board();
	int space = 0;
	while(space < 9)
	{
		Board[space] = new Space();
		space++;
	}
    	int counter = 0;
    	for (int i = 0; i < 9; i++)
    	{
    		stest[i].getSpace();
    		counter = i;
    	}
        assertEquals(counter,8);
    }
}
