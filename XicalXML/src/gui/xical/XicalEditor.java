/*
 * Date: 04.04.2006
 * Time: 19:47:37
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package gui.xical;

import gui.helper.FrameHelper;
import gui.helper.ProjectHelper;

import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import lang.Language;

import xml.xical.XicalDocument;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class XicalEditor extends JFrame {

	public static XicalEditor mainEditor;

	private JMenuBar bar;

	private String title = Language.getString("XicalEditor");

	private XicalDocument xicalDocument;

	private BorderLayout layout;

	private boolean startFlag;

	private class MainWindowListener implements WindowListener {

		public void windowOpened(WindowEvent e) {
			if (startFlag) {
				Welcome welcome = new Welcome();
				welcome.setVisible(startFlag);
				startFlag = false;
			}

		}

		public void windowClosing(WindowEvent e) {
			checkIfSaved();
		}

		public void windowClosed(WindowEvent e) {
			System.exit(0);
		}

		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public void checkIfSaved() {
		if ((xicalDocument == null) || xicalDocument.isSaved())
			dispose();
		else {
			// speichern
			int chose = JOptionPane.showConfirmDialog(this, Language
					.getString("confirmExitSaveMsg"), Language
					.getString("confirmExitTitle"),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			if (chose == JOptionPane.YES_OPTION) {
				ProjectHelper.saveProject();
				dispose();
			} else if (chose == JOptionPane.NO_OPTION)
				dispose();
			else {
				// Abbruch do nothing
			}
		}
	}
	
	
	private void createGUI() {
		setTitle(title);
		layout = new BorderLayout(2, 2);
		setLayout(layout);
		// startFlag = true;
		addWindowListener(new MainWindowListener());
		FrameHelper.centerWindow(this);
		bar = new XicalMenuBar();
	}

	/**
	 * @return Returns the xicalDocument.
	 */
	public XicalDocument getXicalDocument() {
		return xicalDocument;
	}

	/**
	 * @param xicalDocument
	 *            The xicalDocument to set.
	 */
	public void setXicalDocument(XicalDocument xicalDocument) {
		this.xicalDocument = xicalDocument;
	}

	public XicalEditor() {
		mainEditor = this;
		createGUI();
		addBasics();
	}

	private void addBasics() {
		setJMenuBar(bar);

	}

	/**
	 * @return Returns the bar.
	 */
	public XicalMenuBar getBar() {
		return (XicalMenuBar) bar;
	}

	/**
	 * @param bar
	 *            The bar to set.
	 */
	public void setBar(JMenuBar bar) {
		this.bar = bar;
		setJMenuBar(bar);
	}
}

/*
 * new File()
 * 
 * 
 */