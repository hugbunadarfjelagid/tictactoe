import java.awt.*;

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
    public void makeMoveMouse(double x, double y, Players P1, Field[] board) {

        Slot mP1 = new Slot();
        mP1.Slot = 1;
        Slot mP2 = new Slot();
        mP2.Slot = 2;

        Point2D mouseXY = new Point2D(x,y);

        double fix = .15;
        StdDraw.setPenRadius(0.002);
        RectHV Frame1 = new RectHV(0.2-fix,0.2-fix,0.2+fix,0.2+fix);
        if (Frame1.contains(mouseXY)){if (P1.isTurn == true){board[0].place(mP1);} else {board[0].place(mP2);}}
        RectHV Frame2 = new RectHV(0.5-fix,0.2-fix,0.5+fix,0.2+fix);
        if (Frame2.contains(mouseXY)){if (P1.isTurn == true){board[1].place(mP1);} else {board[1].place(mP2);}}
        RectHV Frame3 = new RectHV(0.8-fix,0.2-fix,0.8+fix,0.2+fix);
        if (Frame3.contains(mouseXY)){if (P1.isTurn == true){board[2].place(mP1);} else {board[2].place(mP2);}}
        RectHV Frame4 = new RectHV(0.2-fix,0.5-fix,0.2+fix,0.5+fix);
        if (Frame4.contains(mouseXY)){if (P1.isTurn == true){board[3].place(mP1);} else {board[3].place(mP2);}}
        RectHV Frame5 = new RectHV(0.5-fix,0.5-fix,0.5+fix,0.5+fix);
        if (Frame5.contains(mouseXY)){if (P1.isTurn == true){board[4].place(mP1);} else {board[4].place(mP2);}}
        RectHV Frame6 = new RectHV(0.8-fix,0.5-fix,0.8+fix,0.5+fix);
        if (Frame6.contains(mouseXY)){if (P1.isTurn == true){board[5].place(mP1);} else {board[5].place(mP2);}}
        RectHV Frame7 = new RectHV(0.2-fix,0.8-fix,0.2+fix,0.8+fix);
        if (Frame7.contains(mouseXY)){if (P1.isTurn == true){board[6].place(mP1);} else {board[6].place(mP2);}}
        RectHV Frame8 = new RectHV(0.5-fix,0.8-fix,0.5+fix,0.8+fix);
        if (Frame8.contains(mouseXY)){if (P1.isTurn == true){board[7].place(mP1);} else {board[7].place(mP2);}}
        RectHV Frame9 = new RectHV(0.8-fix,0.8-fix,0.8+fix,0.8+fix);
        if (Frame9.contains(mouseXY)){if (P1.isTurn == true){board[8].place(mP1);} else {board[8].place(mP2);}}

        StdDraw.show();
        StdDraw.show(200);
    }

}
