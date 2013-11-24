package tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpaceTest
{
    @Test
    public void EmptySpaceTest()
    {
        Space stest = new Space();
        Placeholder ptest = new Placeholder();
        ptest.assigned = 0;
        assertEquals(stest.place(ptest),true);
    }
    @Test
    public void setSpaceTest(Placeholder mark)
    {
        /* to be implemented
        this.mark = mark;
        */
    }

    // get space
    @Test
    public int getSpaceTest()
    {
        /* to be implemented
        return mark.assigned;
        */
    }

    // Mark space if it's not taken
    @Test
    public boolean placeTest(Placeholder sign)
    {
        /* to be implemented
        if (!(taken))
        {
            mark = sign;
            taken = true;
            return taken;
        }
        return false;
        */
    }

}

