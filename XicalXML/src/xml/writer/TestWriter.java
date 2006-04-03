/*
 * Date: 03.04.2006
 * Time: 19:00:31
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package xml.writer;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.io.XMLWriter;

import xml.writer.format.XMLOutputFormat;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class TestWriter {
	private XMLWriter writer;

	public TestWriter(Document d) {
		File f = new File("new" + d.getRootElement().getName() + ".xml");
		try {
			FileOutputStream fo = new FileOutputStream(f);

			writer = new XMLWriter(fo, new XMLOutputFormat());

			writer.write(d);
			writer.flush();
			writer.close();

		} catch (Exception e) {
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