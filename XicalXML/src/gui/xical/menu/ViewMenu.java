/*
 * Date: 04.04.2006
 * Time: 20:46:39
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.xical.menu;

import javax.swing.JMenu;

import lang.Language;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 *
 */
public class ViewMenu extends JMenu {
private JMenu languages;
public ViewMenu() {
	setText(Language.getString("ViewMenu"));
	languages = new LanguagesMenu();
	add(languages);
}
}


/*
 * new File()
 *
 *
 */