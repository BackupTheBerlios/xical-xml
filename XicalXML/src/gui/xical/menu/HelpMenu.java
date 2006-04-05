/*
 * Date: 04.04.2006
 * Time: 20:46:48
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.xical.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import conf.lang.Language;


/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class HelpMenu extends JMenu {
	private JMenuItem welcome, about, help;

	public HelpMenu() {
		setText(Language.getString("HelpMenu"));
		welcome = new JMenuItem(Language.getString("welcome"));
		about = new JMenuItem(Language.getString("about"));
		help = new JMenuItem(Language.getString("help"));
		add(welcome);
		addSeparator();
		add(help);
		addSeparator();
		add(about);

	}
}

/*
 * new File()
 * 
 * 
 */