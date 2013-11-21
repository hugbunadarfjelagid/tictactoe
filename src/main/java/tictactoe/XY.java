import java.awt.*;

public class XY
{
    public void markGrid(Field[] games)
    {
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setFont(new Font("Verdana", Font.BOLD, (int) (65*1.5)));
        if (games[0].getMarker() == 1)
            StdDraw.text(.20, .20, "X");
        if (games[1].getMarker() == 1)
            StdDraw.text(.50, .20, "X");
        if (games[2].getMarker() == 1)
            StdDraw.text(.80, .20, "X");
        if (games[3].getMarker() == 1)
            StdDraw.text(.20, .50, "X");
        if (games[4].getMarker() == 1)
            StdDraw.text(.50, .50, "X");
        if (games[5].getMarker() == 1)
            StdDraw.text(.80, .50, "X");
        if (games[6].getMarker() == 1)
            StdDraw.text(.20, .80, "X");
        if (games[7].getMarker() == 1)
            StdDraw.text(.50, .80, "X");
        if (games[8].getMarker() == 1)
            StdDraw.text(.80, .80, "X");
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setFont(new Font("Verdana", Font.BOLD, (int) (65*1.5)));
        if (games[0].getMarker() == 2)
            StdDraw.text(.20, .20, "O");
        if (games[1].getMarker() == 2)
            StdDraw.text(.50, .20, "O");
        if (games[2].getMarker() == 2)
            StdDraw.text(.80, .20, "O");
        if (games[3].getMarker() == 2)
            StdDraw.text(.20, .50, "O");
        if (games[4].getMarker() == 2)
            StdDraw.text(.50, .50, "O");
        if (games[5].getMarker() == 2)
            StdDraw.text(.80, .50, "O");
        if (games[6].getMarker() == 2)
            StdDraw.text(.20, .80, "O");
        if (games[7].getMarker() == 2)
            StdDraw.text(.50, .80, "O");
        if (games[8].getMarker() == 2)
            StdDraw.text(.80, .80, "O");
        StdDraw.show();
    }   
}
