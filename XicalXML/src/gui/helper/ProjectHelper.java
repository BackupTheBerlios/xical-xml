/*
 * Date: 04.04.2006
 * Time: 21:32:26
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.helper;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

import conf.Config;
import conf.lang.Language;

import xml.xical.XicalDocument;
import gui.xical.XicalEditor;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class ProjectHelper {

	private static XicalEditor getMain() {
		return XicalEditor.mainEditor;
	}

	private static void setDefaults(boolean s) {
		getMain().getBar().getFile().setDefaults(s);
		getMain().getBar().getEdit().setDefaults(s);
	}

	public static void closeProject() {
		if (saveIfChangedDocument()) {
			setDefaults(false);
		}

	}

	private static boolean saveIfChangedDocument() {
		XicalDocument oldDoc = getMain().getXicalDocument();
		if (oldDoc != null && !oldDoc.isSaved()) {

			// aktive project löschen speichern ...

			int chose = JOptionPane.showConfirmDialog(getMain(), Language
					.getString("confirmSaveMsg"), Language
					.getString("confirmSaveTitle"),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			if (chose == JOptionPane.YES_OPTION) {
				ProjectHelper.saveProject();
				return true;
			} else if (chose == JOptionPane.CANCEL_OPTION)
				return false;
			else
				return true;
		} else
			return true;
	}

	public static void openProject() {
		if (!saveIfChangedDocument())
			return;
		String base = Config.getValue("openBase");
		File fbase = new File(base);
		JFileChooser chooser;
		if (fbase.exists())
			chooser = new JFileChooser(fbase);
		else
			chooser = new JFileChooser();

		int action = chooser.showSaveDialog(getMain());

		if (action == JFileChooser.APPROVE_OPTION) {
			// save
			File cf = chooser.getSelectedFile();
			// ordner neu setzen
			Config.setValue("openBase", cf.getParent());
			setDefaults(true);

			XicalDocument doc = XicalDocumentHelper.createDocument(cf);
			getMain().setXicalDocument(doc);
			getMain().repaint();
			FrameHelper.buildGUI();

		}
	}

	public static void newProject() {

		if (!saveIfChangedDocument())
			return;
		setDefaults(true);
		XicalDocument newDoc = XicalDocumentHelper.createNewDocument();
		newDoc.setSaved(false);
		getMain().setXicalDocument(newDoc);

	}

	public static void saveProject() {
		String base = Config.getValue("saveBase");
		XicalDocument doc = getMain().getXicalDocument();
		boolean fileskipper = false;
		File fbase;
		if (doc.getFilePath() != null) {
			fbase = new File(doc.getFilePath());
			fileskipper = true;
		} else
			fbase = new File(base);
		JFileChooser chooser;
		if (fbase.exists())
			chooser = new JFileChooser(fbase);
		else
			chooser = new JFileChooser();
		int action = -1;

		if (!fileskipper)
			action = chooser.showSaveDialog(getMain());

		if (action == JFileChooser.APPROVE_OPTION || fileskipper) {
			// save
			File cf;
			if (fileskipper)
				cf = fbase;
			else
				cf = chooser.getSelectedFile();

			// ordner neu setzen
			Config.setValue("saveBase", cf.getParent());
			XicalDocumentHelper.saveToFile(cf);
			// name wird gespeichert
			doc.setFilePath(cf.getAbsolutePath());
			// speichern in file cf und endung beachten
			doc.setSaved(true);

		}
	}

	public static void saveasProject() {

		XicalDocument doc = getMain().getXicalDocument();
		String base = Config.getValue("saveBase");
		File fbase = new File(base);
		JFileChooser chooser;
		if (fbase.exists())
			chooser = new JFileChooser(fbase);
		else
			chooser = new JFileChooser();

		int action = chooser.showSaveDialog(getMain());

		if (action == JFileChooser.APPROVE_OPTION) {
			// save
			File cf = chooser.getSelectedFile();
			// ordner neu setzen
			Config.setValue("saveBase", cf.getParent());
			XicalDocumentHelper.saveToFile(cf);
			// speichern in file cf und endung beachten
			doc.setSaved(true);

		}
	}

	public static void resetEditForm(TreePath path) {

	}

}

/*
 * new File()
 * 
 * 
 */