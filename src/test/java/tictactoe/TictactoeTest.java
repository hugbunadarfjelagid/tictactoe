import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TictactoeTest
{
    @Test
    public void NrOfSpacesTest() throws Exception
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
}
