/*
 * Date: 04.04.2006
 * Time: 21:00:13
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.xical.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import conf.lang.Language;


/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class ExportMenu extends JMenu {

	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuItem exel,html,pdf,rtf,xical;
	
	public ExportMenu() {
		setText(Language.getString("ExportMenu"));
		
		exel = new JMenuItem(Language.getString("exel"));
		html = new JMenuItem(Language.getString("html"));
		pdf = new JMenuItem(Language.getString("pdf"));
		rtf = new JMenuItem(Language.getString("rtf"));
		xical = new JMenuItem(Language.getString("xical"));

		addActions();

		add(exel);
		add(html);
		add(rtf);
		addSeparator();
		add(pdf);
		addSeparator();
		add(xical);
		
	}

	private void addActions() {
		// TODO Auto-generated method stub
		//EXPORTHELPER
	}
}

/*
 * new File()
 * 
 * 
 */