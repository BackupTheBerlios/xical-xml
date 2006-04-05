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

import conf.Config;
import conf.lang.Language;


/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class Start {
	// configWreiter musss noch alles anlegen config Editor muss sachen aendern
	// koennen LANG +++
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File confFile = new File("config.properties");
		Config.iniConfig(confFile);
		File langFile = new File(Config.getValue("langFile"));

		Language.initLanguage(langFile);
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