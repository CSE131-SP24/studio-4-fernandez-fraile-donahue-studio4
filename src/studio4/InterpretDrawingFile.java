package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redValue = in.nextInt();
		int greenValue = in.nextInt();
		int blueValue = in.nextInt();
		Boolean isFilled = in.nextBoolean();
		double pOne = in.nextDouble();
		double pTwo = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		Color color = new Color(redValue, greenValue, blueValue);
		StdDraw.setPenColor(color);
		if (shapeType.equals("rectangle"))
		{
			if (isFilled == true)
			{
				StdDraw.filledRectangle(pOne, pTwo, halfWidth, halfHeight);
			}
			else 
			{
				StdDraw.rectangle(pOne, pTwo, halfWidth, halfHeight);
			}
		}
		if (shapeType.equals("ellipse"))
		{
			if (isFilled == true)
			{
				StdDraw.filledEllipse(pOne, pTwo, halfWidth, halfHeight);
			}
			else 
			{
				StdDraw.ellipse(pOne, pTwo, halfWidth, halfHeight);
			}
		}
		
	}
}
