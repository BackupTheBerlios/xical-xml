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

import gui.xical.menu.FileMenu;
import gui.xical.menu.EditMenu;
import gui.xical.menu.HelpMenu;
import gui.xical.menu.ViewMenu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class XicalMenuBar extends JMenuBar {

	private JMenu file, edit, help, view;

	public XicalMenuBar() {
		file = new FileMenu();
		edit = new EditMenu();
		help = new HelpMenu();
		view = new ViewMenu();

		add(file);
		add(edit);
		add(view);
		add(help);
	}

	
	/**
	 * @return Returns the file.
	 */
	public FileMenu getFile() {
		return (FileMenu) file;
	}


	/**
	 * @param file The file to set.
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
	 * @param edit The edit to set.
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
	 * @param help The help to set.
	 */
	public void setHelp(JMenu help) {
		this.help = help;
	}

	/**
	 * @return Returns the view.
	 */
	public ViewMenu getView() {
		return (ViewMenu) view;
	}

	/**
	 * @param view The view to set.
	 */
	public void setView(JMenu view) {
		this.view = view;
	}
}

/*
 * new File()
 * 
 * 
 */