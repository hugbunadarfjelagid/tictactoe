package tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class UserTest
{
    @Test
    public void SetNameTest()
    {
        User testset = new User();
        testset.setName("Frosti");
        assertEquals(testset.getName(), "Frosti");
    }
    @Test
    public void GetNameTest()
    {
        User testget = new User();
        assertEquals(testget.setName("Frosti"), testget.getName());
    }
    @Test
    public void ChangeTurnTest()
    {
        User changetest = new User();
        if (changetest.isTurn == false)
        {
            changetest.changeTurn();
            assertEquals(changetest.isTurn, true);
        }
        if (changetest.isTurn == true)
        {
            changetest.changeTurn();
            assertEquals(changetest.isTurn, false);
        }
    }
}
