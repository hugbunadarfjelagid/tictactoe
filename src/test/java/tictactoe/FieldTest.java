import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FieldTest
{
    @Test
    public void EmptyFieldTest() throws Exception
    {
        Field fieldtest = new Field();
        Slot slottest = new Slot();
        slottest.Slot = 0;
        assertEquals(fieldtest.place(slottest),0);
    }
}
