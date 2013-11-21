import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PlayersTest
{
    @Test
    public void SetNameTest() throws Exception
    {
        Player testplayerset = new Player();
        testplayer.setName("Frosti");
        assertEquals(testplayer.getName(), "Frosti");
    }
    @Test
    public void GetNameTest() throws Exception
    {
        Player testplayerget = new Player();
        assertEquals(testplayerget.setName("Frosti"), test.getName());
    }
    @Test
    public void ChangeTurnTest() throws Exception
    {
        Player changetest = new Player();
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
