package tictactoe;

public class User
{
    public boolean isTurn = false;
    private String name;
    public boolean won = false;

    // constructor
    public void Player(String name, boolean turn)
    {
        this.name = name;
        this.isTurn = turn;
    }

    // set name
    public String setName(String name)
    {
        this.name = name;
        return this.name;
    }

    // get name
    public String getName()
    {
        return this.name;
    }

    // change players turn
    public void changeTurn()
    {
        if (this.isTurn == false)
            this.isTurn = true;
        else
            this.isTurn = false;
    }

    // who's turn it is
    public boolean isTurn(boolean turn)
    {
        this.isTurn = turn;
        return isTurn;
    }
}
