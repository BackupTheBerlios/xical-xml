/*
 * Date: 04.04.2006
 * Time: 20:19:59
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui;

import gui.xical.XicalEditor;

import java.io.File;

import lang.Language;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 *
 */
public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Language.initLanguage(new File("german.properties"));
	//	Language.initLanguage(new File("english.properties"));
		XicalEditor editor = new XicalEditor();
		editor.pack();
		editor.setVisible(true);
	}

}


/*
 * new File()
 *
 *
 */