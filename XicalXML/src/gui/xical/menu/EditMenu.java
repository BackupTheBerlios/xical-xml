/*
 * Date: 04.04.2006
 * Time: 20:46:26
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
public class EditMenu extends JMenu {

	private JMenuItem addScene, addChapter, editConfig;

	public EditMenu() {
		setText(Language.getString("EditMenu"));
		addScene = new JMenuItem(Language.getString("addScene"));
		addChapter = new JMenuItem(Language.getString("addChapter"));
		add(addScene);
		add(addChapter);
		addSeparator();
		editConfig = new JMenuItem(Language.getString("editConfig"));
		add(editConfig);
		addActions();
		setDefaults(false);
	}

	public void setDefaults(boolean stat) {
		addScene.setEnabled(stat);
		addChapter.setEnabled(stat);
	}

	private void addActions() {
		// TODO Auto-generated method stub

	}
}

/*
 * new File()
 * 
 * 
 */