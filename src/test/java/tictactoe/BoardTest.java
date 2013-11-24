package tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.awt.*;

public class BoardTest
{
    // Size and colors of the Canvas and squares
    @Test
    public void drawBoardTest(int width, int height)
    {
        /* to be implemented
        StdDraw.setCanvasSize(width,height);
        StdDraw.clear(StdDraw.WHITE);
        StdDraw.setPenRadius(.0225);
        StdDraw.setPenColor(StdDraw.BLACK);
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
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.square(.5, .5, .45);
        StdDraw.show();
        */
    }

    // Font size, color and position of X's and O's
    @Test
    public void markSpaceTest(Space[] assign)
    {
        /* to be implemented
        // User X is blue
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setFont(new Font("Verdana", Font.BOLD, (int) (97.5)));
        // Coordinates for X in each space
        if (assign[0].getSpace() == 1)
            StdDraw.text(.20, .20, "X");
        if (assign[1].getSpace() == 1)
            StdDraw.text(.50, .20, "X");
        if (assign[2].getSpace() == 1)
            StdDraw.text(.80, .20, "X");
        if (assign[3].getSpace() == 1)
            StdDraw.text(.20, .50, "X");
        if (assign[4].getSpace() == 1)
            StdDraw.text(.50, .50, "X");
        if (assign[5].getSpace() == 1)
            StdDraw.text(.80, .50, "X");
        if (assign[6].getSpace() == 1)
            StdDraw.text(.20, .80, "X");
        if (assign[7].getSpace() == 1)
            StdDraw.text(.50, .80, "X");
        if (assign[8].getSpace() == 1)
            StdDraw.text(.80, .80, "X");
        // User O is red
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setFont(new Font("Verdana", Font.BOLD, (int) (97.5)));
        // Coordinates for O in each space
        if (assign[0].getSpace() == 2)
            StdDraw.text(.20, .20, "O");
        if (assign[1].getSpace() == 2)
            StdDraw.text(.50, .20, "O");
        if (assign[2].getSpace() == 2)
            StdDraw.text(.80, .20, "O");
        if (assign[3].getSpace() == 2)
            StdDraw.text(.20, .50, "O");
        if (assign[4].getSpace() == 2)
            StdDraw.text(.50, .50, "O");
        if (assign[5].getSpace() == 2)
            StdDraw.text(.80, .50, "O");
        if (assign[6].getSpace() == 2)
            StdDraw.text(.20, .80, "O");
        if (assign[7].getSpace() == 2)
            StdDraw.text(.50, .80, "O");
        if (assign[8].getSpace() == 2)
            StdDraw.text(.80, .80, "O");
        StdDraw.show();
        */
    }

    // Users moves in game
    @Test
    public void makeMoveMouseTest(double x, double y, User X, Space[] board)
    {
        /* to be implemented
        Placeholder x_marked = new Placeholder();
        x_marked.assigned = 1; // Marks X
        Placeholder o_marked = new Placeholder();
        o_marked.assigned = 2; // Marks O

        Point2D mouseXY = new Point2D(x,y);

        StdDraw.setPenRadius(0.002);

        // Mark spaces with X or O
        RectHV Space1 = new RectHV(0.05,0.05,0.35,0.35);
        if (Space1.contains(mouseXY))
        {
            if (X.isTurn == true)
            {
                board[0].place(x_marked);
            }
            else
            {
                board[0].place(o_marked);
            }
        }

        RectHV Space2 = new RectHV(0.35,0.05,0.65,0.35);
        if (Space2.contains(mouseXY))
        {
            if (X.isTurn == true)
            {
                board[1].place(x_marked);
            }
            else
            {
                board[1].place(o_marked);
            }
        }

        RectHV Space3 = new RectHV(0.65,0.05,0.95,0.35);
        if (Space3.contains(mouseXY))
        {
            if (X.isTurn == true)
            {
                board[2].place(x_marked);
            }
            else
            {
                board[2].place(o_marked);
            }
        }

        RectHV Space4 = new RectHV(0.05,0.35,0.35,0.65);
        if (Space4.contains(mouseXY))
        {
            if (X.isTurn == true)
            {
                board[3].place(x_marked);
            }
            else
            {
                board[3].place(o_marked);
            }
        }

        RectHV Space5 = new RectHV(0.35,0.35,0.65,0.65);
        if (Space5.contains(mouseXY))
        {
            if (X.isTurn == true)
            {
                board[4].place(x_marked);
            }
            else
            {
                board[4].place(o_marked);
            }
        }

        RectHV Space6 = new RectHV(0.65,0.35,0.95,0.65);
        if (Space6.contains(mouseXY))
        {
            if (X.isTurn == true)
            {
                board[5].place(x_marked);
            }
            else
            {
                board[5].place(o_marked);
            }
        }

        RectHV Space7 = new RectHV(0.05,0.65,0.35,0.95);
        if (Space7.contains(mouseXY))
        {
            if (X.isTurn == true)
            {
                board[6].place(x_marked);
            }
            else
            {
                board[6].place(o_marked);
            }
        }

        RectHV Space8 = new RectHV(0.35,0.65,0.65,0.95);
        if (Space8.contains(mouseXY))
        {
            if (X.isTurn == true)
            {
                board[7].place(x_marked);
            }
            else
            {
                board[7].place(o_marked);
            }
        }

        RectHV Space9 = new RectHV(0.65,0.65,0.95,0.95);
        if (Space9.contains(mouseXY))
        {
            if (X.isTurn == true)
            {
                board[8].place(x_marked);
            }
            else
            {
                board[8].place(o_marked);
            }
        }

        StdDraw.show();
        StdDraw.show(200);
        */
    }
}
