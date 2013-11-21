import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FieldTest
{
    @Test
    public void TestSlots() throws Exception
    {
        Field fieldtest = new Field();
        Slot slottest = new Slot();
        slottest.Slot = 1;
        assertEquals(fieldtest.place(slottest),true);
        assertEquals(fieldtest.place(slottest),false);
    }
}
