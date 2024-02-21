package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.black);
		StdDraw.filledRectangle(5,5, 5, 5);
		StdDraw.setPenColor(Color.white);
		StdDraw.filledRectangle(0.5,0.5,.4, 0.25);
		StdDraw.setPenColor(145,0,0);
		StdDraw.filledEllipse(.5,0.5, 0.1, 0.1);
		
	}
}