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
/* to be implemented
    @Test
    public void setSpaceTest(Placeholder mark)
    {
        this.mark = mark;
    }

    // get space
    @Test
    public int getSpaceTest()
    {
        return mark.assigned;
    }

    // Mark space if it's not taken
    @Test
    public boolean placeTest(Placeholder sign)
    {
        if (!(taken))
        {
            mark = sign;
            taken = true;
            return taken;
        }
        return false;
    }
*/
}

