import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpaceTest
{
    @Test
    public void EmptySpaceTest() throws Exception
    {
        Space stest = new Space();
        Placeholder ptest = new Placeholder();
        ptest.assigned = 0;
        assertEquals(stest.place(ptest),true);
    }
    
    @Test
    public void EmptyBoardTest() throws Exception
    {
    	Space stest = new Space();
    	int counter = 0;
    	for (int i = 0; i < 9; i++)
    	{
    		stest[i].getSpace();
    		counter += i;
    	}
        assertEquals(counter,0);
    }
}

