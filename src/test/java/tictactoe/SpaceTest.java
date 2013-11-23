package tictactoe;

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
}

