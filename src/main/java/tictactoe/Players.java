public class Players {
    public int moves = 0;
    public boolean isTurn = false;
    private String name = "";
    public boolean won = false;

    public void Player(String name, boolean turn){
        this.name = name;
        this.isTurn = turn;
    }
    public String setName(String name) {
        this.name = name;
        return this.name;
    }
    public String getName(){
        return this.name;
    }
    public void changeTurn() {
        if (this.isTurn == false)
            this.isTurn = true;
        else this.isTurn = false;
    }
    public boolean isTurn(boolean turn){
        this.isTurn = turn;
        return isTurn;
    }
    }
