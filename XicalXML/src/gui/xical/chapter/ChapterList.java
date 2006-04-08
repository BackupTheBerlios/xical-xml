/*
 * Date: 05.04.2006
 * Time: 17:38:49
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.xical.chapter;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class ChapterList extends JList {
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List chapterList;

	private class ChapterModel implements ListModel {

		public int getSize() {

			return chapterList.size();
		}

		public Object getElementAt(int index) {

			return chapterList.get(index);
		}

		public void addListDataListener(ListDataListener l) {
			// TODO Auto-generated method stub

		}

		public void removeListDataListener(ListDataListener l) {
			// TODO Auto-generated method stub

		}

	}

	private class ChapterListener implements ListSelectionListener {
		// ListSelectionListener
		public void valueChanged(ListSelectionEvent e) {
			System.out.println(getSelectedValue());
		}

	}

	public ChapterList() {
		chapterList = new ArrayList(5);
		// elemente anfügen
		chapterList.add("test");
		chapterList.add("tes32t");
		chapterList.add("tesddsest");
		chapterList.add("tes23t");
		chapterList.add("tesdds23st");
		chapterList.add("tes2332t");
		chapterList.add("tesdffd324fst");
		setModel(new ChapterModel());
		addListSelectionListener(new ChapterListener());
	}
}

/*
 * new File()
 * 
 * 
 */