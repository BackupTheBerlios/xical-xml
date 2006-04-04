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

	public static void closeProject() {

		getMain().getBar().getFile().setDeafaults(false);

	}

	public static void openProject() {
		getMain().getBar().getFile().setDeafaults(true);
	}

	public static void newProject() {
		getMain().getBar().getFile().setDeafaults(true);
		
		XicalDocument oldDoc = getMain().getXicalDocument();
		if (oldDoc != null){

			// aktive project löschen speichern ...
		} else {
			XicalDocument newDoc = new XicalDocument();
			newDoc.setSaved(false);
			getMain().setXicalDocument(newDoc);
		}
		
	}

	public static void saveProject() {
		getMain().getBar().getFile().setDeafaults(true);
	}

}

/*
 * new File()
 * 
 * 
 */