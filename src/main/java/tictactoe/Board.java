public class Board
{
	public void drawBoard(int width, int height)
	{
		StdDraw.setCanvasSize(width,height);
		StdDraw.clear(StdDraw.DARK_GRAY);
        StdDraw.setPenRadius(.015*1.5);     //resize 1.5
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.square(.2, .2, .15);
        StdDraw.square(.5, .2, .15);
        StdDraw.square(.8, .2, .15);
        StdDraw.square(.2, .5, .15);
        StdDraw.square(.5, .5, .15);
        StdDraw.square(.8, .5, .15);
        StdDraw.square(.2, .8, .15);
        StdDraw.square(.5, .8, .15);
        StdDraw.square(.8, .8, .15);
        StdDraw.setPenRadius(.035);
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.square(.5, .5, .45);
		StdDraw.show();
	}
	    public void markGrid(Field[] games)
    {
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setFont(new Font("Verdana", Font.BOLD, (int) (65*1.5)));
        if (games[0].getSlot() == 1)
            StdDraw.text(.20, .20, "X");
        if (games[1].getSlot() == 1)
            StdDraw.text(.50, .20, "X");
        if (games[2].getSlot() == 1)
            StdDraw.text(.80, .20, "X");
        if (games[3].getSlot() == 1)
            StdDraw.text(.20, .50, "X");
        if (games[4].getSlot() == 1)
            StdDraw.text(.50, .50, "X");
        if (games[5].getSlot() == 1)
            StdDraw.text(.80, .50, "X");
        if (games[6].getSlot() == 1)
            StdDraw.text(.20, .80, "X");
        if (games[7].getSlot() == 1)
            StdDraw.text(.50, .80, "X");
        if (games[8].getSlot() == 1)
            StdDraw.text(.80, .80, "X");
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setFont(new Font("Verdana", Font.BOLD, (int) (65*1.5)));
        if (games[0].getSlot() == 2)
            StdDraw.text(.20, .20, "O");
        if (games[1].getSlot() == 2)
            StdDraw.text(.50, .20, "O");
        if (games[2].getSlot() == 2)
            StdDraw.text(.80, .20, "O");
        if (games[3].getSlot() == 2)
            StdDraw.text(.20, .50, "O");
        if (games[4].getSlot() == 2)
            StdDraw.text(.50, .50, "O");
        if (games[5].getSlot() == 2)
            StdDraw.text(.80, .50, "O");
        if (games[6].getSlot() == 2)
            StdDraw.text(.20, .80, "O");
        if (games[7].getSlot() == 2)
            StdDraw.text(.50, .80, "O");
        if (games[8].getSlot() == 2)
            StdDraw.text(.80, .80, "O");
        StdDraw.show();
    }   

}
