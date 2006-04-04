/*
 * Date: 04.04.2006
 * Time: 21:02:17
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package lang;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class Language {
	private static Properties language;

	public static void initLanguage(File f) {
		if (language != null)
			language = null;

		language = new Properties();
		try {
			language.load(new FileInputStream(f));
		} catch (Exception e) {
			language = null;
			//log
			System.out.println("fehler " + e.getMessage());
			// spaeter mit gui fehler not loadable
		}
	}

	public static String getString(String s) {
		if ((language == null) || (!language.containsKey(s)))
			return s;
		return language.getProperty(s, s);
	}

}

/*
 * new File()
 * 
 * 
 */