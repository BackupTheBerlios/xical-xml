/*
 * Date: 04.04.2006
 * Time: 20:32:18
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.xical;

import gui.helper.FrameHelper;

import javax.swing.JDialog;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class Welcome extends JDialog {
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Welcome() {
		setTitle("Welcome");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		FrameHelper.centerWindow(this);
	}
}

/*
 * new File()
 * 
 * 
 */