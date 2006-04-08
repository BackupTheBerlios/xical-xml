/*
 * Date: 04.04.2006
 * Time: 21:19:24
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.xical.menu;

import gui.xical.XicalEditor;
import gui.xical.XicalMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import conf.lang.Language;


/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class LanguagesMenu extends JMenu {
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuItem german, english;

	public LanguagesMenu() {
		setText(Language.getString("LanguagesMenu"));
		german = new JMenuItem(Language.getString("german"));
		english = new JMenuItem(Language.getString("english"));
		add(german);
		add(english);
		addActions();
	}

	private void addActions() {
		german.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				System.out.println(Language.getString("FileMenu"));
				Language.initLanguage(new File("german.properties"));

				System.out.println(Language.getString("FileMenu"));
				XicalEditor.mainEditor.setVisible(false);
				XicalMenuBar bar = new XicalMenuBar();
				
				XicalEditor.mainEditor.setBar(bar);
				//XicalEditor.mainEditor.setJMenuBar(bar);
				XicalEditor.mainEditor.setVisible(true);
			}
		
		});
		english.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println(Language.getString("FileMenu"));
				Language.initLanguage(new File("english.properties"));

				System.out.println(Language.getString("FileMenu"));
				XicalEditor.mainEditor.setVisible(false);
				XicalMenuBar bar = new XicalMenuBar();
				
				XicalEditor.mainEditor.setBar(bar);
				//XicalEditor.mainEditor.setJMenuBar(bar);
				XicalEditor.mainEditor.setVisible(true);
			}
		
		});
	}
}

/*
 * new File()
 * 
 * 
 */