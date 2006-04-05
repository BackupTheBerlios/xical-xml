/*
 * Date: 04.04.2006
 * Time: 20:45:47
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.xical.menu;

import gui.helper.ProjectHelper;
import gui.xical.XicalEditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import conf.lang.Language;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class FileMenu extends JMenu {

	private JMenuItem makeNew, makeOpen, makeClose, makeSave, makeSaveas,
			makeExit;

	private JMenu makeExport;

	public FileMenu() {
		setText(Language.getString("FileMenu"));
		makeExport = new ExportMenu();

		makeNew = new JMenuItem(Language.getString("makeNew"));
		makeOpen = new JMenuItem(Language.getString("makeOpen"));
		makeClose = new JMenuItem(Language.getString("makeClose"));
		makeSave = new JMenuItem(Language.getString("makeSave"));
		makeSaveas = new JMenuItem(Language.getString("makeSaveas"));
		makeExit = new JMenuItem(Language.getString("makeExit"));

		addActions();
		setDefaults(false);
		add(makeNew);
		add(makeOpen);
		addSeparator();
		add(makeSave);
		add(makeSaveas);
		addSeparator();
		add(makeExport);
		addSeparator();
		add(makeClose);
		add(makeExit);

	}

	public void setDefaults(boolean stat) {
		makeSave.setEnabled(stat);
		makeSaveas.setEnabled(stat);
		makeExport.setEnabled(stat);
		makeClose.setEnabled(stat);
	}

	private void addActions() {

		makeExit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				XicalEditor.mainEditor.checkIfSaved();
			}

		});

		makeClose.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ProjectHelper.closeProject();
			}

		});

		makeOpen.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ProjectHelper.openProject();
			}

		});

		makeNew.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ProjectHelper.newProject();
			}

		});

		makeSave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ProjectHelper.saveProject();
			}

		});

		makeSaveas.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ProjectHelper.saveasProject();
			}

		});

		// TODO noch mehr
	}

	/**
	 * @return Returns the makeClose.
	 */
	public JMenuItem getMakeClose() {
		return makeClose;
	}

	/**
	 * @param makeClose
	 *            The makeClose to set.
	 */
	public void setMakeClose(JMenuItem makeClose) {
		this.makeClose = makeClose;
	}

	/**
	 * @return Returns the makeExit.
	 */
	public JMenuItem getMakeExit() {
		return makeExit;
	}

	/**
	 * @param makeExit
	 *            The makeExit to set.
	 */
	public void setMakeExit(JMenuItem makeExit) {
		this.makeExit = makeExit;
	}

	/**
	 * @return Returns the makeExport.
	 */
	public ExportMenu getMakeExport() {
		return (ExportMenu) makeExport;
	}

	/**
	 * @param makeExport
	 *            The makeExport to set.
	 */
	public void setMakeExport(JMenu makeExport) {
		this.makeExport = makeExport;
	}

	/**
	 * @return Returns the makeNew.
	 */
	public JMenuItem getMakeNew() {
		return makeNew;
	}

	/**
	 * @param makeNew
	 *            The makeNew to set.
	 */
	public void setMakeNew(JMenuItem makeNew) {
		this.makeNew = makeNew;
	}

	/**
	 * @return Returns the makeOpen.
	 */
	public JMenuItem getMakeOpen() {
		return makeOpen;
	}

	/**
	 * @param makeOpen
	 *            The makeOpen to set.
	 */
	public void setMakeOpen(JMenuItem makeOpen) {
		this.makeOpen = makeOpen;
	}

	/**
	 * @return Returns the makeSave.
	 */
	public JMenuItem getMakeSave() {
		return makeSave;
	}

	/**
	 * @param makeSave
	 *            The makeSave to set.
	 */
	public void setMakeSave(JMenuItem makeSave) {
		this.makeSave = makeSave;
	}

	/**
	 * @return Returns the makeSaveas.
	 */
	public JMenuItem getMakeSaveas() {
		return makeSaveas;
	}

	/**
	 * @param makeSaveas
	 *            The makeSaveas to set.
	 */
	public void setMakeSaveas(JMenuItem makeSaveas) {
		this.makeSaveas = makeSaveas;
	}
}

/*
 * new File()
 * 
 * 
 */