import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PlayersTest
{
    @Test
    public void SetNameTest() throws Exception
    {
        Players testplayerset = new Players();
        testplayerset.setName("Frosti");
        assertEquals(testplayerset.getName(), "Frosti");
    }
    @Test
    public void GetNameTest() throws Exception
    {
        Players testplayerget = new Players();
        assertEquals(testplayerget.setName("Frosti"), testplayerget.getName());
    }
    @Test
    public void ChangeTurnTest() throws Exception
    {
        Players changetest = new Players();
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
