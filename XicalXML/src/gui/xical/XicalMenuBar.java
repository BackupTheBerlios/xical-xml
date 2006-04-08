/*
 * Date: 04.04.2006
 * Time: 20:44:38
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.xical;

import gui.xical.menu.EditMenu;
import gui.xical.menu.FileMenu;
import gui.xical.menu.HelpMenu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class XicalMenuBar extends JMenuBar {

	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenu file, edit, help;

	// view;
	// kein view in version 1
	public XicalMenuBar() {
		file = new FileMenu();
		edit = new EditMenu();
		help = new HelpMenu();
		// view = new ViewMenu();

		add(file);
		add(edit);
		// add(view);
		add(help);
	}

	/**
	 * @return Returns the file.
	 */
	public FileMenu getFile() {
		return (FileMenu) file;
	}

	/**
	 * @param file
	 *            The file to set.
	 */
	public void setFile(JMenu file) {
		this.file = file;
	}

	/**
	 * @return Returns the edit.
	 */
	public EditMenu getEdit() {
		return (EditMenu) edit;
	}

	/**
	 * @param edit
	 *            The edit to set.
	 */
	public void setEdit(JMenu edit) {
		this.edit = edit;
	}

	/**
	 * @return Returns the help.
	 */
	public HelpMenu getHelp() {
		return (HelpMenu) help;
	}

	/**
	 * @param help
	 *            The help to set.
	 */
	public void setHelp(JMenu help) {
		this.help = help;
	}

}

/*
 * new File()
 * 
 * 
 */