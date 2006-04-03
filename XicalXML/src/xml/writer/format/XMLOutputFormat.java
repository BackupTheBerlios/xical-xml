/*
 * Date: 03.04.2006
 * Time: 19:22:02
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package xml.writer.format;

import org.dom4j.io.OutputFormat;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class XMLOutputFormat extends OutputFormat {
	public XMLOutputFormat() {
		setIndent(true);
		setIndentSize(4);
		setLineSeparator("\n");
		setNewlines(true);
		setOmitEncoding(true);
		setEncoding("UTF-8");
		setTrimText(true);
		setExpandEmptyElements(false);
	}
}

/*
 * new File()
 * Format for XML Encoding UTF-8
 * 
 */