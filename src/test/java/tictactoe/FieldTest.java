import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FieldTest
{
    @Test
    public void TestSlots() throws Exception
    {
        Field fieldtest = new Field();
        Slot slottest = new Slot();
        assertEquals(fieldtest.place(1),true);
        assertEquals(fieldtest.place(0),false);
    }
}
