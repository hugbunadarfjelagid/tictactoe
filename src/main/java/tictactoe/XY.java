public class XY
{
    public void markGrid(Field[] games)
    {
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setFont(new Font("Verdana", Font.BOLD, (int) (65*1.5)));
        if (board[0].getMarker() == 1)
            StdDraw.text(.20-fix1, .20-fix, "X");
        if (board[1].getMarker() == 1)
            StdDraw.text(.50-fix1, .20-fix, "X");
        if (board[2].getMarker() == 1)
            StdDraw.text(.80-fix1, .20-fix, "X");
        if (board[3].getMarker() == 1)
            StdDraw.text(.20-fix1, .50-fix, "X");
        if (board[4].getMarker() == 1)
            StdDraw.text(.50-fix1, .50-fix, "X");
        if (board[5].getMarker() == 1)
            StdDraw.text(.80-fix1, .50-fix, "X");
        if (board[6].getMarker() == 1)
            StdDraw.text(.20-fix1, .80-fix, "X");
        if (board[7].getMarker() == 1)
            StdDraw.text(.50-fix1, .80-fix, "X");
        if (board[8].getMarker() == 1)
            StdDraw.text(.80-fix1, .80-fix, "X");
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setFont(new Font("Verdana", Font.BOLD, (int) (65*1.5)));
        if (board[0].getMarker() == 2)
            StdDraw.text(.20-fix1, .20-fix, "O");
        if (board[1].getMarker() == 2)
            StdDraw.text(.50-fix1, .20-fix, "O");
        if (board[2].getMarker() == 2)
            StdDraw.text(.80-fix1, .20-fix, "O");
        if (board[3].getMarker() == 2)
            StdDraw.text(.20-fix1, .50-fix, "O");
        if (board[4].getMarker() == 2)
            StdDraw.text(.50-fix1, .50-fix, "O");
        if (board[5].getMarker() == 2)
            StdDraw.text(.80-fix1, .50-fix, "O");
        if (board[6].getMarker() == 2)
            StdDraw.text(.20-fix1, .80-fix, "O");
        if (board[7].getMarker() == 2)
            StdDraw.text(.50-fix1, .80-fix, "O");
        if (board[8].getMarker() == 2)
            StdDraw.text(.80-fix1, .80-fix, "O");
        StdDraw.show();
    }   
}
