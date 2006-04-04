/*
 * Date: 04.04.2006
 * Time: 20:37:13
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.helper;

import java.awt.Dimension;
import java.awt.Window;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class FrameHelper {

	public static void centerWindow(Window w) {
		int widht = w.getWidth();
		int height = w.getHeight();

		Dimension screen = w.getToolkit().getScreenSize();
		int maxwidht = screen.width;
		int maxheight = screen.height;

		if (widht < 200)
			widht = 200;

		if (height < 200)
			height = 200;
		w.setSize(widht, height);
		w.setLocation((maxheight / 2) + height, (maxwidht / 2) - widht);

	}

}

/*
 * new File()
 * 
 * 
 */