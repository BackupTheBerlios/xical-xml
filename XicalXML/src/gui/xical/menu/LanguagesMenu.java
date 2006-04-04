/*
 * Date: 04.04.2006
 * Time: 21:19:24
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.xical.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import lang.Language;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class LanguagesMenu extends JMenu {
	private JMenuItem german, english;

	public LanguagesMenu() {
		setText(Language.getString("LanguagesMenu"));
		german = new JMenuItem(Language.getString("german"));
		english = new JMenuItem(Language.getString("english"));
		add(german);
		add(english);
		
	}
}

/*
 * new File()
 * 
 * 
 */