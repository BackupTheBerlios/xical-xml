/*
 * Date: 05.04.2006
 * Time: 19:20:07
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package conf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class Config {
	private static Properties config;
	private static File configFile;
	public static void iniConfig(File confFile) {
		if (config != null)
			config = null;
		config = new Properties();

		if (!confFile.exists()) {
			try {
				config.put("langFile", "german.properties");
				config.store(new FileOutputStream(confFile), "new File Config");
			} catch (Exception e) {
				// TODO fehler beim laden exit
			}
		} else {

			try {
				config.load(new FileInputStream(confFile));

			} catch (Exception e) {
				// TODO Exit fehler beim laden
			}
		}
		configFile = confFile;
	}

	public static String getValue(String k) {
		return config.getProperty(k, k);
	}

	public static void setValue(String k, String v) {
		config.setProperty(k, v);
	}
	public static void storeConfig(){
		try {
			config.store(new FileOutputStream(configFile), "store Config");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*
 * new File()
 * 
 * 
 */