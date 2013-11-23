package tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class UserTest
{
    @Test
    public void SetNameTest() throws Exception
    {
        User testset = new User();
        testset.setName("Frosti");
        assertEquals(testset.getName(), "Frosti");
    }
    @Test
    public void GetNameTest() throws Exception
    {
        User testget = new User();
        assertEquals(testget.setName("Frosti"), testget.getName());
    }
    @Test
    public void ChangeTurnTest() throws Exception
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
