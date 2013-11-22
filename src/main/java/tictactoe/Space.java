package main.java.tictactoe;
public class Space
{
    private boolean taken;
    public Placeholder mark = new Placeholder();

/*    private Boolean taken()
    {
        return taken; // Taken slot
    }*/
    
    public void setSpace(Placeholder mark)
    {
        this.mark = mark;
    }

    public int getSpace()
    {
        return mark.assigned;
    }

    // Mark slot if it's not taken
    public boolean place(Placeholder sign)
    {
        if (!(taken))
        {
            mark = sign;
            taken = true;
            return taken;
        }
//        switchPl(1,2);
        return false;
    }
}
