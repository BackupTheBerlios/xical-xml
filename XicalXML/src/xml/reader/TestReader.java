package xml.reader;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class TestReader {
	private SAXReader reader;

	private Document document;

	/**
	 * @return Returns the document.
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * @param document
	 *            The document to set.
	 */
	public void setDocument(Document document) {
		this.document = document;
	}

	/**
	 * @return Returns the reader.
	 */
	public SAXReader getReader() {
		return reader;
	}

	/**
	 * @param reader
	 *            The reader to set.
	 */
	public void setReader(SAXReader reader) {
		this.reader = reader;
	}

	public TestReader() {
		File f = new File("transferorder.xml");
		reader = new SAXReader();
		try {
			setDocument(reader.read(f));
		} catch (DocumentException e) {
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