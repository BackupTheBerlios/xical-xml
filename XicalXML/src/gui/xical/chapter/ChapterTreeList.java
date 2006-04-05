/*
 * Date: 05.04.2006
 * Time: 17:57:05
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.xical.chapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTree;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 *
 */
public class ChapterTreeList extends JTree {
private List a,b,c,d,e;


class ChapterTreeModel implements TreeModel{

	public Object getRoot() {
		return "root";
	}

	public Object getChild(Object parent, int index) {
		return (data.containsKey(parent))? ((List)data.get(parent)).get(index):null;
	}

	public int getChildCount(Object parent) {
		int c=0;
		if (data.containsKey(parent)) c = ((List)data.get(parent)).size();
		return c;
	}

	public boolean isLeaf(Object node) {
		
		return !(data.containsKey(node));
	}

	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	public int getIndexOfChild(Object parent, Object child) {
		// TODO Auto-generated method stub
		return (data.containsKey(parent))? ((List)data.get(parent)).indexOf(child):0;
	}

	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		
	}

	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		
	}
	
}
private Map data = new HashMap();
public ChapterTreeList() {
	a = new ArrayList();
	b = new ArrayList();
	c = new ArrayList();
	d = new ArrayList();
	e = new ArrayList();
	for (int i=0; i < 4; i++){
		a.add("test " + i);
		b.add("Blatt " + i);
		c.add("Blatt1 " + i);
		d.add("Blatt2 " + i);
		e.add("Blatt3 " + i);
	}

	data.put("root",a);
	data.put(a.get(0),b);
	data.put(a.get(1),c);
	data.put(a.get(2),d);
	data.put(a.get(3),e);
		
	
	
	setModel(new ChapterTreeModel());
	addTreeSelectionListener(new ChapterListener());
}

class ChapterListener implements TreeSelectionListener{

	public void valueChanged(TreeSelectionEvent e) {
		System.out.println(getSelectionCount());
		System.out.println(getSelectionPath());
		System.out.println(getLastSelectedPathComponent());
	}
	
}
}


/*
 * new File()
 *
 *
 */