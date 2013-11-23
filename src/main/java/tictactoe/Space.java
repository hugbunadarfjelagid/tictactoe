package tictactoe;

public class Space
{
    private boolean taken; // boolean for a taken space
    public Placeholder mark = new Placeholder(); // placeholder for space
    
    // set space
    public void setSpace(Placeholder mark)
    {
        this.mark = mark;
    }

    // get space
    public int getSpace()
    {
        return mark.assigned;
    }

    // Mark space if it's not taken
    public boolean place(Placeholder sign)
    {
        if (!(taken))
        {
            mark = sign;
            taken = true;
            return taken;
        }
        return false;
    }
}
