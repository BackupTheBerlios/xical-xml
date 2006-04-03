package xml.reader.test;

import org.dom4j.Document;

import xml.reader.TestReader;
import xml.writer.TestWriter;

public class Test {
	public static void main(String[] args) {
		TestReader tr = new TestReader();
		Document d = tr.getDocument();
		
	//	d.getRootElement().element("chapter").setText("test");
		
		TestWriter tw = new TestWriter(d);
	}
}

/*
 * new File()
 * 
 * 
 */