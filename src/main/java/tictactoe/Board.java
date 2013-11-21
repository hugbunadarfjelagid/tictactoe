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
}
